package testing;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Trip {
	
	private double totalPrice;
	private String currency;
	private String airLine;
	private String originAirportCode;
	private String destinationAirportCode;
	private String depauterDateString;
	private String arrivaleDateString;
	
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getAirLine() {
		return airLine;
	}
	public void setAirLine(String airLine) {
		this.airLine = airLine;
	}
	public String getOriginAirportCode() {
		return originAirportCode;
	}
	public void setOriginAirportCode(String originAirportCode) {
		this.originAirportCode = originAirportCode;
	}
	public String getDestinationAirportCode() {
		return destinationAirportCode;
	}
	public void setDestinationAirportCode(String destinationAirportCode) {
		this.destinationAirportCode = destinationAirportCode;
	}
	public String getDepauterDateString() {
		return depauterDateString;
	}
	public void setDepauterDateString(String depauterDateString) {
		this.depauterDateString = depauterDateString;
	}
	public String getArrivaleDateString() {
		return arrivaleDateString;
	}
	public void setArrivaleDateString(String arrivaleDateString) {
		this.arrivaleDateString = arrivaleDateString;
	}
	
	public Date getDepauterDateObject() throws ParseException{
		DateFormat format = new SimpleDateFormat("Y-m-d");
		return format.parse(this.getDepauterDateString());
	}

}
