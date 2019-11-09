package testing;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

public class Testing {

	private List<Trip> trips = new ArrayList<>();
	private List<Discount> discounts = new ArrayList<>();
	private List<Commission> commission = new ArrayList<>();

	
	public static void main(String[] args) {

	}

	@PostConstruct
	public void init() {
		buildTrips();
		buildCommission();
		buildDiscounts();
	}
	
	private void buildTrips() {
		
	}
	
	private void buildCommission() {
		
	}

	private void buildDiscounts() {
		
	}

}
