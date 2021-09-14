package test8;

public class Test {
	public static void main(String[] args) {
		Integer a=new Integer (10);
		Integer b=new Integer (10);
		int c=10; int d=10;
		System.out.println(a==b); //false
//		System.out.println(c==d); //true
		System.out.println(a==c); //true
		System.out.println(b==c); //true
	}
}
