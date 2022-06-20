package core;

public class Private extends AccessModifiers {
		public Private(int a, int c, int d){
			this.a=a;
			this.c=c;
			this.d=d;
			
		}
		public static void main(String [] args) {
			Private ob = new Private(a, c, d);
			System.out.println(a);
			System.out.println(c);
			System.out.println(d);

			
		}
}
 