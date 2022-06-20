package FlowControlsDemo;
import java.util.Scanner;
/**
 * 
 * @author sv22044
 *ReverseString
 *
 *
 */
public class ReverseString {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a string :");
	String str=sc.nextLine();
	System.out.println("Reverse of a string "+str+" is");
	for(int j=str.length();j>0;j--) {
	System.out.print(str.charAt(j-1));
	}
	sc.close();
}
	}

