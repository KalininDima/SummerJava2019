package Day49_Recap;

public abstract class Animal {

	public abstract void eat ();
	
	public abstract void sleep();
	
}

//concrete 
class Cat extends Animal {
	
public void eat() {
	System.out.println("Fish");
}

public void sleep() {
System.out.println("Sleeps 14 hours");	
	
}

}

class KingKong extends Animal {
	public void eat() {
		System.out.println("KingKong eats Humans");
	}
	
	public void sleep() {
		System.out.println("King kong sleeps 5 hourse");
	}
}


class Test {
	
	public static void main(String[] args) {
		
		KingKong obj = new KingKong();
		obj.eat();
		
		Cat obj2 = new Cat();
			obj2.eat();
	}
}
	
