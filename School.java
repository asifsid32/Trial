package javaproj;

public class School {
	protected int regno;
	protected String sname;
	Student S[];
	public School() {
		super();
		// TODO Auto-generated constructor stub
	}
	public School(int regno, String sname, Student s[]) {
		super();
		this.regno = regno;
		this.sname = sname;
		this.S = S;
	}
	public int getRegno() {
		return regno;
	}
	public void setRegno(int regno) {
		this.regno = regno;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public Student[] getS() {
		return S;
	}
	public void setS(Student s[]) {
		S = s;
	}
	

}
