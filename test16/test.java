package test16;

public class test {

	public static void main(String[] args) {
		try
		{
			method();
		}
		catch(Exception e)
		{
			System.out.println("AAA");
		}
	}
	static void method()
	{
		try {
			Integer x=Integer.parseInt("ABC");
		}catch(NullPointerException e)
		{
			System.out.println("BBB");
		}
	}

}
