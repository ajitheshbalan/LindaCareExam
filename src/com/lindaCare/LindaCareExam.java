package com.lindaCare;

 
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.HEAD;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;

import com.lindaCare.model.Order;
 
@Path("/")
public class LindaCareExam {
	private static List<Order> orders = new ArrayList<>();
	private static boolean hasUpdates = false;
	
	@POST
	@Path("/createBuy")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createBuyStock(Order order){
		orders.add(order);
		hasUpdates = true;
		return Response.status(Status.CREATED).build();
	}
 
	@GET
	@Path("/getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getAllOrders() {
		hasUpdates = false;
		if(orders.isEmpty()){
			return Response.status(404).build();
		}
		// return HTTP response 200 in case of success
		 return Response.status(200).entity(orders).build();
	}
	
	
	@GET
	@Path("/hasMoreOrders")
	@Produces(MediaType.APPLICATION_JSON)
	public Response hasMoreOrders() {
		 return Response.status(200).header("hasUpdates", hasUpdates).build();
	}
	
	@GET
	@Path("/getById/{userId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response getByUserId(@PathParam("userId") String userId) {
		List<Order> ordersList = orders.stream()
									   .filter(order-> order.getUserId().equals(userId))
									   .collect(Collectors.toList());
		if(orders.isEmpty()){
			return Response.status(404).build();
		}
		// return HTTP response 200 in case of Records Found for UserId
		return Response.status(200).entity(ordersList).build();
	}
 
}
