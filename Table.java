package corejava;

import java.util.Scanner;

public class Table {

	public static void main(String[] args) {
		int a;
		Scanner xyz = new Scanner(System.in);
		System.out.println("Enter a number you need mulitples of: ");
		a = xyz.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(a + "*" + i + "=" + (a * i));
		}

	}

}
