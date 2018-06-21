package javaproj;
import java.util.*;

public class Triangle extends Shape{
	Scanner s1=new Scanner(System.in);
	double area;
	public Triangle()
	{
		
	}
	public Triangle(int side1, int side2) {
		super(side1, side2);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void calcarea() {
		System.out.println("enter side 1");
		side1=s1.nextInt();
		System.out.println("enter side 2");
		side2=s1.nextInt();
		
		area=0.5*side1*side2;
		System.out.println("area:"+area);
	}

	@Override
	public void displayShapeName() {
		
		System.out.println("Triangle");
	}

}
