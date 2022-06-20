import java.util.Scanner;

public class Ravali {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int n1 = sc.nextInt();
		System.out.println("Enter the second number: ");
		int n2 = sc.nextInt();
		int sum = n1 + n2;
		int minus = n1 - n2;
		int multiply = n1 * n2;
		int subtract = n1 - n2;
		int divide = n1 / n2;
		int rnums = n1 % n2;
		System.out.printf(
				"Sum = %d\nMinus = %d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderOf2Numbers = %d\n ", sum,
				minus, multiply, subtract, divide, rnums);
	}
}
