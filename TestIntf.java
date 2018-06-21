package javaproj;

public class TestIntf {
	public static void main(String args[])
	{
		
		Bird b=new Bird();
		b.fly();
		
		Aeroplane a=new Aeroplane();
		a.fly();
		
		FlyingObjects f=b;
		f.fly();
		
	}

}
