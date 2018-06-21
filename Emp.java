package javaproj;

public class Emp extends Person {
protected  int ecode;
protected String dept;
protected double salary;
public Emp() {
	super();
	// TODO Auto-generated constructor stub
}
public Emp(int ecode, String dept, double salary) {
	super();
	this.ecode = ecode;
	this.dept = dept;
	this.salary = salary;
}
public int getEcode() {
	return ecode;
}
public void setEcode(int ecode) {
	this.ecode = ecode;
}
public String getDept() {
	return dept;
}
public void setDept(String dept) {
	this.dept = dept;
}
public double getSalary() {
	return salary;
}
public void setSalary(double salary) {
	this.salary = salary;
}

}
