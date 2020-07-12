package project;

public class Method_Overloading3 {
	
	public void info(String name,int id)
	{
		System.out.println("my name is "+ name + " my id is "+ id);
	}
	public void info(int speed,String model)
	{
		System.out.println("my car speed  is "+ speed + " my model name is "+ model);
	}

	public static void main(String[] args) {
		Method_Overloading3 obj = new Method_Overloading3();
		obj.info("tom", 202);
		obj.info(50, "honda");
		

	}

}
