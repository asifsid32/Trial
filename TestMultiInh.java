package javaproj;

public class TestMultiInh {
	public static void main(String args[])
	{
		
		Manager m1 = new Manager();
		m1.setNo_of_sub(20);
		m1.setName("asif"); m1.setAdd("Nagpur"); 
		m1.setEcode(101); m1.setDept("comp"); m1.setSalary(1500);
		
		System.out.println("no of subord:"+m1.getNo_of_sub()+"code"+m1.getEcode()+"\nname"+m1.getName()+"\ndept"+m1.getDept());
	}

}
