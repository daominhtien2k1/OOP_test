package test11;

public class Test {
	public static void main(String[] args) {
		Test t= new Test();
		int arr[]= {5,6,7};
		t.method1(arr);
		for(int i:arr) {
			System.out.println(i);
		}
		t.method2(arr);
		for(int i:arr) {
			System.out.println(i);
		}
	}
	
	
	public void method1(int arr[])
	{
		for(int i:arr)
			i++;
	}
	public void method2(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		arr[i]++;
	}
}
