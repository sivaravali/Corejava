package flowcontrols;
/**
 * 
 * @author sv22044
 *for(initialisation;condition;increment or decrement statement){outer for loop
 *for(initialisation;condition;increment or decrement statement){inner for loop
 *statements;
 *}
 *}
 */
public class NestedForLoop {

	public static void main(String[] args) {
		for(int i=1;i<=3;i++) {
			for(int j=1;j<=10;j++) {
				System.out.println(i+"x"+j+"="+(i*j));
			}
			System.out.println("---------");
		}
	}

}
