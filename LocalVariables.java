
public class LocalVariables {
	int b=20;
	static int c=20;
	public static void main(String[] args) {
		int a=10;
		System.out.println("A="+a);
		System.out.println("C="+c);
		LocalVariables lv=new LocalVariables();
		lv.m1();
		System.out.println("B="+lv.b);
	}
		public void m1(){
			System.out.println("B="+b);
			System.out.println("C="+c);
			}

}
