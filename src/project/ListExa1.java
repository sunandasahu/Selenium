package project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import org.omg.Messaging.SyncScopeHelper;

public class ListExa1 {

	public static void main(String[] args) {
		List<Integer>myNum=new ArrayList <Integer>();
		myNum.add(10);
		myNum.add(20);
		myNum.add(85);
		myNum.add(5);
		myNum.add(77);
	    myNum.add(2);
		myNum.add(2, 45);//If we want to add an object in a particular index we can use add(int index,int element)
		//myNum.remove(3);//remove an item in a particular index
		Collections.sort(myNum);//to sorting out the elements
		
		myNum.forEach(System.out::println);//different way of printing the elements
//		for(int i:myNum)
//		{
//			System.out.println(i);
//			
//		}
		System.out.println("the element in index nu 0 is  " + myNum.get(0));//to know the element in index i
		System.out.println("The index of element 77 is  "+ myNum.indexOf(77));//method to know the index of an object

	}

}
