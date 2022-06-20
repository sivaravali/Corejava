package flowcontrols;
import java.util.Scanner;

/**
 * 
 * @author sv22044
 * Given number is even or odd
 */
public class IfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		if(n%2==0){
			System.out.println("Given Number is even Number");
		}
		else {
			System.out.println("Given number is odd Number");
		}
		sc.close();
	}

}
