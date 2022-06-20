package FlowControlsDemo;
import java.util.Scanner;
/**
 * 
 * @author sv22044
 *CaluculateDiscount
 *
 *
 */
public class CaluculateDiscount {
	public static void main(String[] args) {
	float marketprice, dis, s;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter market price");
	marketprice = sc.nextFloat();
	// dis = 25; means 25 percent
	System.out.println("enter discount");
	dis = sc.nextFloat();
	//System.out.println("Market price = " + marketprice);
	//System.out.println("discount" + dis);
	s = 100 - dis;
	float amount = (s * marketprice) / 100;
	System.out.println("Original price after discount = " + amount);
	}
}
