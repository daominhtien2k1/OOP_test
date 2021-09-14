package test12;

public class Person {
	private int age;
	private String name;
	public Person()
	{
		
	}
	public Person(int age, String name) {
		this.age = age;
		this.name = name;
	}

	public static void main(String[] args) {
		Person p1 = new Person(20, "Hung");
		Person p2 = new Person(20, "Hung");
		System.out.println((p1.equals(p2)) + " ");
		
	}

}
