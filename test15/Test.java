package test15;

public class Test {
	int count=0;

	void A() throws Exception
	{
		try {
			count++;
			try {
				count++;
				try {
					count++;
					throw new Exception();
				}catch(Exception ex){
					count++;
					throw new Exception();
				}
			}
			catch(Exception ex) {	
				
				count++;
			}
		}
		catch(Exception ex){	
			System.out.println("unreach");
			count++;
		}
	}

	void display()
	{
		System.out.println(count);
	}
	public static void main (String arg[]) throws Exception{
		Test t=new Test();
		t.A();
		t.display();
	}
}