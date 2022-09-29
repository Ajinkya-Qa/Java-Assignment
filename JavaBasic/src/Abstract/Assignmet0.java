package Abstract;

abstract class Parent{
	abstract void message();
}
class Subclasses1 extends Parent{
	void message(){
		System.out.println("This is first subclass");
	}
}
class Subclasses2 extends Parent{
	void message(){
		System.out.println("This is second subclass");
	}
}

public class Assignmet0 {
	public static void main(String[] args) {
		Subclasses1 sb1=new Subclasses1();
		sb1.message();
		
		Subclasses2 sb2=new Subclasses2();
		sb2.message();
	}

}
