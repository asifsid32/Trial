package javaproj;

public class Manager extends Emp {
	public Manager(int no_of_sub) {
		super();
		this.no_of_sub = no_of_sub;
	}

	protected int no_of_sub ;

	public Manager() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Manager(int ecode, String dept, double salary) {
		super(ecode, dept, salary);
		// TODO Auto-generated constructor stub
	}

	public int getNo_of_sub() {
		return no_of_sub;
	}

	public void setNo_of_sub(int no_of_sub) {
		this.no_of_sub = no_of_sub;
	}
	

}
