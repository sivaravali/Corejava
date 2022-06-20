package flowcontrols;
import java.util.Scanner;
/**
 * 
 * @author sv22044
 *Sample switch application using number choice
 */

public class SwitchDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("--------------");
		System.out.println("|  switch application  |");	
		System.out.println("--------------");
		System.out.println("|   1.Add   |");
		System.out.println("|   2.Sub   |");
		System.out.println("|   3.Mul   |");
		System.out.println("|   4.div   |");
		System.out.println("--------------");
		System.out.println("enter your choice");
		int choice= sc.nextInt();
		System.out.println("Enter A Value");
		int a=sc.nextInt();
		System.out.println("Enter B Value");
		int b=sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Result="+(a+b));
			break;
		case 2:
			System.out.println("Result="+(a-b));
			break;
		case 3:
			System.out.println("Result="+(a*b));
			break;
		case 4:
			System.out.println("Result="+(a/b));
			break;
		default:
			System.out.println("please select your choice range1-4 only");
		}
		sc.close();
	}

}
