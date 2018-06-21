package javaproj;

public class Two_Wheeler extends Vehicle{

	
	public Two_Wheeler(int no_of_gears, String brand) {
		super();
		this.no_of_gears = no_of_gears;
		this.brand = brand;
	}
	protected int no_of_gears;
	protected String brand;
	public Two_Wheeler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Two_Wheeler(int regno, int milage, String color) {
		super(regno, milage, color);
		// TODO Auto-generated constructor stub
	}
	public int getNo_of_gears() {
		return no_of_gears;
	}
	public void setNo_of_gears(int no_of_gears) {
		this.no_of_gears = no_of_gears;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override
	public String toString() {
		return "Two_Wheeler [no_of_gears=" + no_of_gears + ", brand=" + brand + ", regno=" + regno + ", milage="
				+ milage + ", color=" + color + "]";
	}
	
}
