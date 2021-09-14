package test3;

public class Test {


	public static void main(String[] args) {
		String s1 = new String("test");
		String s2 = "test";
		String s3 = String.valueOf("test");
		System.out.println(s1==s2); //false
		System.out.println(s1==s3); //false 
		System.out.println(s2==s3); //true
		String s4 = new String("test");
		String s5 = "test";
		String s6 = String.valueOf("test");
		System.out.println(s1==s4); //false
		System.out.println(s2==s5); //true
		System.out.println(s3==s6); //true
	}
	
	public void method(int...arr){
	}

}