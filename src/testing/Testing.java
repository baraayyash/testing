package testing;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;


public class Testing {

	private static List<Trip> trips = new ArrayList<>();
	private static List<Discount> discounts = new ArrayList<>();
	private static List<Commission> commissions = new ArrayList<>();

	
	public static void main(String[] args) throws ParseException {
		
		buildTrips();
		buildCommission();
		buildDiscounts();

		System.out.println("started !");

		for (Trip trip : trips) {
			
			Discount discountForTrip = null;
			
			for (Discount discount: discounts) {
				boolean isOriginValid = false;
				boolean isDestinationValid = false;
				// can be percentage?
				if ((trip.getTotalPrice() < discount.getValue()) ||  (! discount.getAirLines().contains(trip.getAirLine())) 
						|| (trip.getDepauterDateObject().after(discount.getEndDateObject()))) continue;
				if (discount.getOriginAirports().contains(trip.getOriginAirportCode()) || discount.getOriginAirports().isEmpty())
					isOriginValid = true;
				if (discount.getDistinationAirports().contains(trip.getDestinationAirportCode()) || discount.getDistinationAirports().isEmpty())
					isDestinationValid = true;
				
				if (isOriginValid && isDestinationValid) {
					discountForTrip = discount;
					break;
				}
				// can be internal trip?
			}

			
			if (discountForTrip != null) {
				System.out.println("found discount !");

				trip.setTotalPrice(trip.getTotalPrice() - discountForTrip.getValue());
			} else {
				Commission commissionForTrip = null;
				for (Commission commission : commissions) {
					if (commission.getAirLines().contains(trip.getAirLine()) || 
							commission.getAirLines().isEmpty()) {
						commissionForTrip = commission;
						break;
					}
				}
				
				if (commissionForTrip != null) {
					double commissionValue = (trip.getTotalPrice() * commissionForTrip.getValue()) + trip.getTotalPrice();
					trip.setTotalPrice(commissionValue);
				}
				
			}
			
		}
		
		System.out.println("done !");
		
	}

	private static void buildTrips() {
		Trip trip = new Trip();
		trip.setAirLine("SV");
		trip.setArrivaleDateString("2019-12-20");
		trip.setCurrency("USD");
		trip.setDepauterDateString("2019-12-20");
		trip.setDestinationAirportCode("AMM");
		trip.setOriginAirportCode("JED");
		trip.setTotalPrice(400);
		
		trips.add(trip);
	}
	
	private static void buildCommission() {
		Commission defaultCommission = new Commission();
		defaultCommission.setValue(0.025);
		Commission saCommission = new Commission();
		saCommission.getAirLines().add("SV");
		saCommission.setValue(0.06);
		// should be first
		commissions.add(saCommission);
		
		//should be last
		commissions.add(defaultCommission);
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
