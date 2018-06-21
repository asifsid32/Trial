package javaproj;

public class TestAbstract {

	public static void main(String args[])
	{
		
		CarWindow cw=new CarWindow();
		cw.open();
		HouseWindow hw=new HouseWindow();
		hw.open();
		
		cw.close();
		hw.close();
		cw.display();
		
		
		Window w;
		w=cw;
		
		w.open();
		
	
		((CarWindow) w ).myMethod();
		
	w=new HouseWindow();
			w.open();
			
	}
}
