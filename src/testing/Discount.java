package testing;

import java.util.ArrayList;
import java.util.List;

public class Discount {
	
	/*
	 * 
      'end_date'  => '2019-12-31', // should be in this format only 
      'in_trip'   => false, // internal trips
      'airlines'  => ['SV'], // valid airlines
      'min_price' => 1200 // minimum price to make it work

	 * 
	 */
	
	private List<String> originAirports = new ArrayList<>();
	private List<String> distinationAirports = new ArrayList<>();
	private DiscountValueType valueType;
	private double value; // should be number: 50 as 50 usd or 50 as %50 disscount
	private String currency;
	private String endDate;
	private boolean internalTrips;
	private List<String> airLines = new ArrayList<>();
	private double minPrice;
	
	public List<String> getOriginAirports() {
		return originAirports;
	}
	public void setOriginAirports(List<String> originAirports) {
		this.originAirports = originAirports;
	}
	public List<String> getDistinationAirports() {
		return distinationAirports;
	}
	public void setDistinationAirports(List<String> distinationAirports) {
		this.distinationAirports = distinationAirports;
	}
	public DiscountValueType getValueType() {
		return valueType;
	}
	public void setValueType(DiscountValueType valueType) {
		this.valueType = valueType;
	}
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getEndDate() {
		return endDate;
	}
	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}
	public boolean isInternalTrips() {
		return internalTrips;
	}
	public void setInternalTrips(boolean internalTrips) {
		this.internalTrips = internalTrips;
	}
	public List<String> getAirLines() {
		return airLines;
	}
	public void setAirLines(List<String> airLines) {
		this.airLines = airLines;
	}
	public double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(double minPrice) {
		this.minPrice = minPrice;
	}

}
