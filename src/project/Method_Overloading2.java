package project;

//method overloading with different numbers of parameter
public class Method_Overloading2 {
	
	public void add(int a,int b)
	{
		int c =( a + b);
		System.out.println(c);
	}
	public void add(int a,int b,int c)
	{
		int x = (a+b+c);
		System.out.println(x);
	}

	public static void main(String[] args) {
		Method_Overloading2 obj = new Method_Overloading2();
				
		obj.add(10, 20);
		obj.add(10, 20, 30);

	}

}
