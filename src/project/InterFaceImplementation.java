package project;

public class InterFaceImplementation implements InterFaceExample2{

	@Override
	public void dis() {
		System.out.println(name + "  "+age);
		
	}
	
	@Override
	public void myMethod() {
		
		System.out.println("My car is  " + modelName + ".  Its speed is "+ speed );
	}
	public static void main(String[] args) {
		InterFaceImplementation obj1=new InterFaceImplementation();
		obj1.dis();
		obj1.myMethod();
	}
}
