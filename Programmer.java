package javaproj;

public class Programmer extends Emp implements GetCertification {
	
	int proj_done;
public Programmer(){}
	public Programmer(int proj_done,String name,String add) {
		super();
		this.proj_done = proj_done;
	}

	public int getProj_done() {
		return proj_done;
	}

	public void setProj_done(int proj_done) {
		this.proj_done = proj_done;
	}
	@Override
	public void getCertification(String cname) {
		// TODO Auto-generated method stub
		
	}
	
	

}
