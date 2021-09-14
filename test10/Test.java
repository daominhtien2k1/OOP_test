package test10;

import javax.management.RuntimeErrorException;

public class Test {

	public static void main(String[] args) {
		Test t=new Test();
		int n=4;
		t.check2(n);

	}
	public void check1(int n) throws Exception
	{
		if(n<=0)
			throw new Exception("number >0");
	}
	public void check2(int n) throws RuntimeException
	{
		if(n==5)
			throw new RuntimeException("Number !=5");
	}
	public void check3(int n) throws Exception,RuntimeException
	{
		check1(n);
		check2(n);
		check3(n);
	}

}
