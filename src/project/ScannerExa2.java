package project;

import java.util.Scanner;

public class ScannerExa2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter employee name");
		String empName= sc.nextLine();
		
		System.out.println("Enter age");
		int age = sc.nextInt();
		
		System.out.println("Enter salary");
		double salary = sc.nextDouble();
		
		sc.close(); // these are the steps to get data from user
		
		System.out.println(empName + "  age: "+age +"  salary: "+ salary);

	}

}
