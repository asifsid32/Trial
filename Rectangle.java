package javaproj;
import java.util.*;

public class Rectangle extends Shape {

	Scanner s=new Scanner(System.in);
	double area;
	public Rectangle()
	{
		
	}
	public Rectangle(int side1, int side2) {
		super(side1, side2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcarea() {
		System.out.println("enter side 1");
		side1=s.nextInt();
		System.out.println("enter side 2");
		side2=s.nextInt();
		area=side1*side2;
		System.out.println("area:"+area);
	}
		
	

	@Override
	public void displayShapeName() {
		
		System.out.println("Rectangle");
	}

}
