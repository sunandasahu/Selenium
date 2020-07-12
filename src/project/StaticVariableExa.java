package project;

public class StaticVariableExa {
	final static String MY_VARIABLE ="researcher";
	static String comName="UMMS";
	String empName;
	int empId;
	public StaticVariableExa(String name,int id)
	{
		empName=name;
		empId=id;
		
	}
	public void empInfo() //non static method
	{
		System.out.println(comName+" "  +"Employee name:  "+ empName   + "  Id:" + empId + "  Employee type: "+ MY_VARIABLE);
		
	}
	 static void print() //static method
	{
		System.out.println("i am a static method");
	}
	

	public static void main(String[] args) {
		
		StaticVariableExa employee1=new StaticVariableExa("Bhuban",101);
		StaticVariableExa employee2=new StaticVariableExa("Sunanda", 5005);
		employee1.empInfo();
		employee2.empInfo();
		print();//calling static method without object
		

	}

}
