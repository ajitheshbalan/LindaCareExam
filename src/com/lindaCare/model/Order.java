/**
 * 
 */
package com.lindaCare.model;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author ajithesh
 *
 */
@XmlRootElement
public class Order implements Serializable {
	
	/**
	 * Generated Serial Id
	 */
	private String userId;
	private String currencyFrom;
	private String currencyTo;
	private Double amountSell;
	private Double amountBuy;
	private Double rate;
	private String timePlaced;
	private String originatingCountry;
	/**
	 * @return the userId
	 */
	public String getUserId() {
		return userId;
	}
	/**
	 * @param userId the userId to set
	 */
	public void setUserId(String userId) {
		this.userId = userId;
	}
	/**
	 * @return the currencyFrom
	 */
	public String getCurrencyFrom() {
		return currencyFrom;
	}
	/**
	 * @param currencyFrom the currencyFrom to set
	 */
	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}
	/**
	 * @return the currencyTo
	 */
	public String getCurrencyTo() {
		return currencyTo;
	}
	/**
	 * @param currencyTo the currencyTo to set
	 */
	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}
	/**
	 * @return the timePlaced
	 */
	public String getTimePlaced() {
		return timePlaced;
	}
	/**
	 * @param timePlaced the timePlaced to set
	 */
	public void setTimePlaced(String timePlaced) {
		this.timePlaced = timePlaced;
	}
	/**
	 * @return the originatingCountry
	 */
	public String getOriginatingCountry() {
		return originatingCountry;
	}
	/**
	 * @param originatingCountry the originatingCountry to set
	 */
	public void setOriginatingCountry(String originatingCountry) {
		this.originatingCountry = originatingCountry;
	}
	/**
	 * @return the amountSell
	 */
	public Double getAmountSell() {
		return amountSell;
	}
	/**
	 * @param amountSell the amountSell to set
	 */
	public void setAmountSell(Double amountSell) {
		this.amountSell = amountSell;
	}
	/**
	 * @return the amountBuy
	 */
	public Double getAmountBuy() {
		return amountBuy;
	}
	/**
	 * @param amountBuy the amountBuy to set
	 */
	public void setAmountBuy(Double amountBuy) {
		this.amountBuy = amountBuy;
	}
	/**
	 * @return the rate
	 */
	public Double getRate() {
		return rate;
	}
	/**
	 * @param rate the rate to set
	 */
	public void setRate(Double rate) {
		this.rate = rate;
	}
		

}
