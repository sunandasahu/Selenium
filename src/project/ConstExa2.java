package project;
//Parameterized constructor without method
public class ConstExa2 {
	String animalName;
	String soundType;
	public ConstExa2(String name,String sound)
	{
		 animalName=name;
		 soundType=sound;
	}
	

	public static void main(String[] args) {
		ConstExa2 animal1=new ConstExa2("cat","Meaun");
		ConstExa2 animal2=new ConstExa2("dog","whof");
		System.out.println(animal1.animalName + " says " + animal1.soundType);
		System.out.println(animal2.animalName + " says " + animal2.soundType);

	}

}
