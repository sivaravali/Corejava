package FlowControlsDemo;
import java.util.Scanner;
/**
 * 
 * @author sv22044
 *SumOfDigitsUsingStaticMethod
 *
 *
 */
public class SumOfDigitsUsingStaticMethod {

	public static void main(String[] args) {
		long n,s;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		n=sc.nextLong();
		s=sum(n);
		System.out.println("Sum of digits of a number is "+s);
		
	}
	static int sum(long num)
	{
		int sum=0;
		while(num!=0)
		{
			sum+=num%10;
			num/=10;
					
		}
		return sum;
	}

}
