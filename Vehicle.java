package javaproj;

public class Vehicle {
	protected int regno;
	protected int milage;
	protected String color;
	public Vehicle() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Vehicle(int regno, int milage, String color) {
		super();
		this.regno = regno;
		this.milage = milage;
		this.color = color;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public int getMilage() {
		return milage;
	}
	public void setMilage(int milage) {
		this.milage = milage;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
