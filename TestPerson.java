package javaproj;

public class TestPerson {
	public static void main(String args[]){
	/*Person p1=new Person();
	p1.setName("asif");p1.setAdd("Pune");
    System.out.println(p1);*/
	
	
	Programmer e=new Programmer(5,"Asif","Pune");
	System.out.println("Name"+e.getName());
	e.getCertification("JAVA");
	
	}
}

