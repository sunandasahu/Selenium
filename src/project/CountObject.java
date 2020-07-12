package project;

public class CountObject {
	
	static int i;
	public CountObject()
	{
		i++;
	}
	public void counter()
	{
		System.out.println(i);
		
	}
	

	public static void main(String[] args) {
		CountObject obj1 = new CountObject();
		CountObject obj2 = new CountObject();
		CountObject obj3 = new CountObject();
		obj1.counter();
		

	}

}
