package CollectionFrameWork;

import java.util.Scanner;

public class Collection6 {
	public static void main(String args[]) {
		// int a = 50;
		// Integer b = new Integer(a);
		// System.out.println(a + "" + b);
		int a=10;
		Integer i=new Integer(20);
		System.out.println(a+" "+i);

		//Auto Boxing
		int x=20;
		Integer y=new Integer(x);
		System.out.println(x+" "+y);

		//Auto Unboxing
		Integer p= new Integer(20);
		int q=p;
		System.out.println(q+" "+p); 
		

	}
}
