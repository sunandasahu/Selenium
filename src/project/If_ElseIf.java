package project;

public class If_ElseIf {

	public static void main(String[] args) {
		//if there are more than 2 conditions then we use if else_if 
		int a=20,b=80,c=40;
		if(a>b && a>c)
		{
			System.out.println("a is big");
		}
		else if(b>a && b>c)
		{
			System.out.println("b is big");
		}
		else
		{
			System.out.println("c is big");
		}

	}

}
