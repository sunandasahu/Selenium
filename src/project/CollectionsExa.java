package project;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class CollectionsExa {

	public static void main(String[] args) {
		//Collection is a interface that represents a group of variables and we can add any number of values here.
		Collection value = new ArrayList();
		value.add(54);
		value.add("arushi");
		value .add(5.6f);
		
		//to print the values there are two methods
		//Iterator method
		//Enanhanced forloop
//		Iterator i = value.iterator();
//		
////		 System.out.println(i.next());	
////		 System.out.println(i.next());	
//		 System.out.println(i.next());	
		 
		 //instead of writing the print statement each time we can use while loop which has a "hasNext" method.
//		    while(i.hasNext())
//			System.out.println(i.next());
		//Iterator is a old method .lets use enhanced for loop
		
		for (Object i:value)
		{
			System.out.println(i);
		}
		

	}

}
