package flowcontrols;
/**
 * 
 * @author sv22044
 *Print 1 to 10 numbers
 *Initialisation
 *do{
 *	statements;
 *	increment or decrement statement;
 *}while(condition);
 *
 *
 */
public class DoWhileLoop {

	public static void main(String[] args) {
		int i=1;
		do {
			System.out.println(i);
			++i;
		}while(i<=10);

	}

}
