package testing;

import java.util.ArrayList;
import java.util.List;

public class Commission {

	private double value;
	private List<String> airLines = new ArrayList<>();
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public List<String> getAirLines() {
		return airLines;
	}
	public void setAirLines(List<String> airLines) {
		this.airLines = airLines;
	}
}
