package Day54_Polymorphisim;

abstract class AbstractClass{
	// By
	public static void ByLinkText() {
		System.out.println("teeeeext super");
	}
	
public void get () {
	System.out.println("Chrome");
}
}

public class Test extends AbstractClass {
	
	public void get() {
		System.out.println("Firefox");
	}
	
	public static void ByLinkText(int a) {
		System.out.println("teeext sub");
	}
	
	public static void Test() {
		
	}
	
	public static void main(String[] args) {
		
		//AbstractClass obj = new AbstractClass(); you cannot create objects from 
		//abstract class
		
		AbstractClass obj2 =  new Test();
		obj2.ByLinkText();
		// the method not overridden method, reference'
				//gets executed
		obj2.get();
		
		Test obj3 = new Test();
		obj3.ByLinkText(10);// 
		
		
		// driver.findElements(By.Xpath(" "));
		//unless: import static packagename.By.*
		
	}
	
}


