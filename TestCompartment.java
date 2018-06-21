package javaproj;
import java.util.Random;
import java.math.*;

public class TestCompartment {

	public static void main(String args[])
	{
		Compartment compart[]=new Compartment[10];
		for(int i=0;i<compart.length;i++)
		{
		long cno=Math.round((Math.random()*3)+1);
		int ch=0;
		
		/*Compartment c;
		FirstClass f1=new FirstClass();
		Ladies f3=new Ladies();
		General f2=new General();
		f1.notice();*/
		
		/*c=f1;
		c.notice();
		c=f2;
		c.notice();
		c=f3;
		c.notice();
		*/
		switch (ch)
		{
		case 1: compart[i]=new FirstClass();
		c
		i++;
		break;
		
		case 2:  compart[i]=new Ladies(); 
		break;
		
		case 3:  compart[i]=new General(); 
		break;
		
		}
		
		}
	}
}
