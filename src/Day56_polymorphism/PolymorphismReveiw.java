package Day56_polymorphism;

/*
 * Polymorphismim:
 * occures when a super class /interface is reference  and object from is created from child class
 * A extends B
 * sub		super
 * 
 * B		obj		=new A();
 * re-type  ref-name
 * 
 * reference type decides what  can be accesible
 * 
 * child class cannot be  the reference to parent class' object
 * 
 * if we make the abstract class as reference, object MUST be created from sub class (non abstract)
 * 
 * if we make the interface as reference , object MUSt be created from the classes(non abstract) thats implementing the interface
 * 
 * 
 * 
 * 
 * 
 * IS A : Inherited/Im[lement relation between class
 * 			Dog extends Animal
 * 			PitBull extends Dog
 * 
 * 			Dog IS Animal
 * 			PitBull IS A Dog
 * 			PitBull IS An Animal
 * 
 * 			Bird extends Animal
 * 	
 * Has A: 
 * 			class Car {
 * Engine obj = new Engine();
 * 			
 * }
 * 
 * Car HAS an Engine {
 * 
 * Lions li = new Lion();
 * Tiger ti = new Tiger();
 * ....
 * 
 * }
 * 
 * Zoo Has a Lion
 * Zoo Has a Tiger
 * 
 * Method Overriding :
 * 				access modifier needs to be same or more visible
 * 				return type has to be same
 * 				same method name
 *			    same parameter
 *				Only the instance method can be overridden
 *				HAS to be overriden in the sub class
 *				Cannot be private, static, final
 * 
 */


class A {
	protected void methodA() {
		System.out.println("method A class A");
	}
	
	public static void methodC() {
		System.out.println("MethodC from A class");
	}
}


class B extends A{
	
	public void methodB() {
		System.out.println("method B");
	}
	
	public void methodA() {
		System.out.println("method A from B class");
	}
	
	public static void metjodC() {
		System.out.println("method C from B class");
	}
	
	
}
public class PolymorphismReveiw {

	public static void main(String[] args) {
	A obj = new A();
	A obj2 = new B();
				obj2.methodA();
			//	obj2.methodB();
			// obj3 = new A(); child class cannot be the refence to parent class'bject.
		// C obj4 = new C ();  abstract class is not concrete
				
				C obj5 = new D();
				E obj6 = new D();
				//D obj7 = new E(); we cannot create the object from interface
				
				//C obj8 = new E (); we cannot create object from interface
				// E obj9 = new C();
				
				//E obj10 = new F();
				
				A obj11 = new B();
				obj11.methodA();// from B class
				
				obj11.methodC();
	}
	
	
}

abstract class C{
	
}

class D extends C implements E{
	
}

interface E {
	
}

abstract class F implements E{
	
}
