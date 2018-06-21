package javaproj;
import java.lang.*;
import java.util.*;

public class Example {
	
	public static void main(String args[])
	{
		
		String s1="Zensar";
		String s2="Pune";
 
		String s3=s1.concat(s2)	;
		System.out.println(s3);

		for (int i=s2.length()-1;i>=0;i--)
		{
			System.out.print(s2.charAt(i));
		}
		
       s1=s1.concat("PVT LMT");		
        s2=s1.concat(s3);
        System.out.println("\n"+s2);
	}

}
