package testing;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

public class Testing {

	private static List<Trip> trips = new ArrayList<>();
	private static List<Discount> discounts = new ArrayList<>();
	private static List<Commission> commission = new ArrayList<>();

	
	public static void main(String[] args) {
		
		buildTrips();
		buildCommission();
		buildDiscounts();

		System.out.println(discounts.size());
	}
	
	private static void buildTrips() {
		Trip trip = new Trip();
		trip.setAirLine("SA");
		trip.setArrivaleDateString("2019-12-20");
		trip.setCurrency("USD");
		trip.setDepauterDateString("2019-12-20");
		trip.setDestinationAirportCode("AMM");
		trip.setOriginAirportCode("JED");
		trip.setTotalPrice(400);
	}
	
	private static void buildCommission() {
		Commission defaultCommission = new Commission();
		defaultCommission.setValue(2.5);
		Commission saCommission = new Commission();
		saCommission.getAirLines().add("SA");
		
		// should be first
		commission.add(saCommission);
		
		//should be last
		commission.add(defaultCommission);
	}

	private static void buildDiscounts() {
		
		Discount discount = new Discount();
		
		discount.setCurrency("USD");
		discount.setEndDate("2019-12-31");
		discount.getAirLines().add("SV");
		discount.getOriginAirports().add("JED");
		discount.getOriginAirports().add("RUH");
		discount.getOriginAirports().add("MED");
		discount.setInternalTrips(false);
		discount.setMinPrice(300);
		discount.setValue(10);
		discount.setValueType(DiscountValueType.VALUE);
		
		discounts.add(discount);
		
	}
	
}
