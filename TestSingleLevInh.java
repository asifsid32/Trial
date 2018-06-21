package javaproj;

public class TestSingleLevInh {
	public static void main(String[] args){

	Emp e1=new Emp();
e1.setName("asif"); e1.setAdd("Nagpur"); 
e1.setEcode(101); e1.setDept("comp"); e1.setSalary(1500);

	System.out.println("code"+e1.getEcode()+"\nname"+e1.getName()+"\ndept"+e1.getDept());
	}
}