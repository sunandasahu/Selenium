package project;

public class TernaryOperator {

	public static void main(String[] args) {
		int i=4;
		int j=0;
//		if(i>5)
//			j=2;
//		else
//			j=1;
		
		j= i>5?2:1;  //in ternary operator instead of writing 4 lines of code , we can use only one line
		             // here we are assigning the value of j according to the value of i. j=condition?first value:else second value
		System.out.println(j);

	}

}
