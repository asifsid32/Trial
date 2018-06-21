package javaproj;

public class TestHasA {
	public static void main(String[] args){
		Student st1 = new Student(101,"Asif",90,96,94);
		Student st2 = new Student(101,"Asif",90,96,94);
		Student st3 = new Student(101,"Asif",90,96,94);

		Student st[]=new Student[3];
		st[0]=st[1];
		st[1]=st[2];
		st[2]=st[3];
		School sch=new School(2001,"DYP",st);
		System.out.println("regno"+sch.regno);
		System.out.println("School name"+sch.sname);
		System.out.println("Student info");
		st=sch.get
		for (Student s:){
		System.out.println("roll no "+sch.getS().getRoll());
		System.out.println("name"+sch.getS().getStud_name());
		System.out.println("marks1"+sch.getS().getM1());
		System.out.println("marks2"+sch.getS().getM2());
		System.out.println("marks3"+sch.getS().getM3());
		}

		
		
		
	}

}
