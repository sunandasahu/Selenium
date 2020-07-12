package project;

import java.util.Scanner;

public class ScannerClassGreatestValue {
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		System.out.println("Enter the value of A");
		int A=myObj.nextInt();
		System.out.println("Enter the value of B");
		int B =myObj.nextInt();
		System.out.println("Enter the value of c");
		int C =myObj.nextInt();
		myObj.close();
		if(A>B && A>C)
		{
			System.out.println("A is biggest");
		}
		else if(B>A && B>C){
			System.out.println("B is biggest");	
		}
		else{
			System.out.println("C is biggest");
		}
	}

	

	
}
