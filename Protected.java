package corejava;

public class Protected extends Private {

		public Protected (int a, int c, int d){
			this.a=a;
			this.c=c;
			this.d=d;
			
		}
		public static void main(String [] args) {
			Protected ob = new Protected(a, c, d);
			System.out.println(a);
			System.out.println(c);
			System.out.println(d);

			
		}
	}
}
