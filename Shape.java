package javaproj;

abstract public class Shape {
	public Shape()
	{
		System.out.println("Shape Default");
	}

	public Shape(int side1, int side2) {
		super();
		this.side1 = side1;
		this.side2 = side2;
	}
	int side1;
	int side2;
	public int getSide1() {
		return side1;
	}
	public void setSide1(int side1) {
		this.side1 = side1;
	}
	public int getSide2() {
		return side2;
	}
	public void setSide2(int side2) {
		this.side2 = side2;
	}
	
	public abstract void calcarea();
	public abstract void displayShapeName();
	
	
}
