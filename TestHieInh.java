package javaproj;

public class TestHieInh {
	public static void main(String args[])
	{
		Two_Wheeler t1=new Two_Wheeler();
		F_Wheeler f1=new F_Wheeler();
		
		t1.setNo_of_gears(5);
		t1.setBrand("Honda");
		t1.setMilage(25);
		f1.setGeared(true);
		f1.setType("petrol");
	//	System.out.println("no of gears"+t1.getNo_of_gears()+"brand"+t1.getBrand()+"geared or not:"+f1.geared+"type:"+f1.getType()+"milage"+t1.getMilage());
		System.out.println(t1);
		System.out.println(f1);
	}

}
