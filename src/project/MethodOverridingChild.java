package project;

public class MethodOverridingChild extends MethodOverridingParent{
	
	public void display()
	{
		super.display();//Using super keyword we are calling parent class method
		System.out.println("I am a method in child class");
	}
	public void print()
	{
		System.out.println("i am a new method in child class");
	}

	public static void main(String[] args) {
		MethodOverridingChild childObj=new MethodOverridingChild()	;
		MethodOverridingParent newObj=new MethodOverridingParent();
		childObj.display();//calling child class method
		newObj.display();//calling parent class method
		childObj.print();//calling new method of child class
		

	}

}
