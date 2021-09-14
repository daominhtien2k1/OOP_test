package test2;

public class Boy extends Human {
	public static void walk() {
		System.out.println("Boy walks");
	}


	public static void main(String args[]) {
		//phương thức static không thể overide và có this(),super()
		Human obj1 = new Boy();
		Human obj2 = new Human();
		Boy obj3 = new Boy();
		obj1.walk();
		obj2.walk();
		obj3.walk();
		obj1 = obj3;
		obj1.walk();
//		obj3=obj1; //Error
	
	}
}