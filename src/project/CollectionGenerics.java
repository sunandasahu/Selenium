package project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class CollectionGenerics {

	public static void main(String[] args) {
		//when we want specific type of value in our collection we use generics
		Collection<Integer>myNum=new ArrayList <Integer>();
		myNum.add(55);
		myNum.add(11);
		myNum.add(10);
		
		//if we want to remove a specific value 
		myNum.remove(11);
		
		//myNum.add("abc"); because we specify the data type ,it is not accepting string value
		for(int i:myNum)
		{
			System.out.println(i);
		}
		
		
		

	}

}
