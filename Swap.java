package corejava;

import java.util.Scanner;

public class Swap {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the first value A= ");
		int a =scan.nextInt();
		System.out.println("enter the second value B= ");
		int b= scan.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
		
		System.out.println("the swapping of two numbers is A= "+a+"\n B= "+b);
		
	}
}
