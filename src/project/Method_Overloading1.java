package project;
//method overloading with different data types
public class Method_Overloading1 {
	
	public void myMethod1(String a)
	{
		System.out.println(a);
	}

		public void myMethod1(int a)
		{
			System.out.println(a);
		}
		

	public static void main(String[] args) {
		Method_Overloading1 obj=new Method_Overloading1();
		obj.myMethod1("sunanda");// calling 1st method
		obj.myMethod1(20);//calling 2nd method

	}

}
