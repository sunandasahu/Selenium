package project;

public class AbstractClassExtends extends AbstractClassExa {

	@Override
	void print() {
		System.out.println(x+y);
		
	}
public static void main(String[] args) {
	AbstractClassExtends obj =  new AbstractClassExtends();
	
		obj.print();

	}

}
