package project;
//Default constructor and no argument constructor
public class ConstExa1 {
	String stName;
	int id;
	public ConstExa1()
	{
		stName="Arya";
		id= 001;
	}

	public static void main(String[] args) {
		
		ConstExa1 student1= new ConstExa1();
		System.out.println(student1.stName +"  "   +student1.id);

	}

}
