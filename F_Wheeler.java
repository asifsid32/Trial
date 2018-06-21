package javaproj;

public class F_Wheeler extends Vehicle{

	public F_Wheeler(boolean geared, String type) {
		super();
		this.geared = geared;
		this.type = type;
	}
	public F_Wheeler() {
		super();
		// TODO Auto-generated constructor stub
	}
	public F_Wheeler(int regno, int milage, String color) {
		super(regno, milage, color);
		// TODO Auto-generated constructor stub
	}
	protected boolean geared;
	protected String type ;
	public boolean isGeared() {
		return geared;
	}
	public void setGeared(boolean geared) {
		this.geared = geared;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "F_Wheeler [geared=" + geared + ", type=" + type + ", regno=" + regno + ", milage=" + milage + ", color="
				+ color + "]";
	}
	
}
