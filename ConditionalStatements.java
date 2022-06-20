package core;

import java.util.Scanner;

public class ConditionalStatements {
	public static void main(String[] args) {
		int a, b, c;
		System.out.println("enter two numbers");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter 1st value");
		a = sc.nextInt();
		System.out.println("enter 2nd value");
		b = sc.nextInt();
		System.out.println("enter 3rd value");
		c = sc.nextInt();
		if (a > b) {
			if (a > c) {
				System.out.println("a is greater");
			} else {
				System.out.println("c is grater");
			}
		} else if (b > a) {
			if (b > c) {
				System.out.println("b is greater");
			} else {
				System.out.println("c is grater");
			}
		}

	}
}
