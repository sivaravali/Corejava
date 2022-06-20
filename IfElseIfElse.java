package flowcontrols;
import java.util.Scanner;
/**
 * 
 * @author sv22044
 * Find Largest Number
 */

public class IfElseIfElse {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first,second,third number?");
		int firstNumber=sc.nextInt();
		int secondNumber=sc.nextInt();
		int thirdNumber=sc.nextInt();
		if(firstNumber>secondNumber&&secondNumber>thirdNumber) {
			System.out.println("firstNumber is largest Number");
			}
		else if(secondNumber>firstNumber&&secondNumber>thirdNumber) {
			System.out.println("secondNumber is largest Number");	
		}
		else if(thirdNumber>firstNumber&&thirdNumber>secondNumber){
			System.out.println("thirdNumber is largest Number");		
		}
		else {
			System.out.println("Any two are more Numbers are equal");
		}
		sc.close();
	}

}
