package javaproj;

public class Student {
	protected int roll;
	protected String stud_name;
	protected double m1,m2,m3;
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public String getStud_name() {
		return stud_name;
	}
	public void setStud_name(String stud_name) {
		this.stud_name = stud_name;
	}
	public double getM1() {
		return m1;
	}
	public void setM1(double m1) {
		this.m1 = m1;
	}
	public double getM2() {
		return m2;
	}
	public void setM2(double m2) {
		this.m2 = m2;
	}
	public double getM3() {
		return m3;
	}
	public void setM3(double m3) {
		this.m3 = m3;
	}
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", stud_name=" + stud_name + ", m1=" + m1 + ", m2=" + m2 + ", m3=" + m3 + "]";
	}
	public Student(int roll, String stud_name, double m1, double m2, double m3) {
		super();
		this.roll = roll;
		this.stud_name = stud_name;
		this.m1 = m1;
		this.m2 = m2;
		this.m3 = m3;
	}
	

}
