package Day40_StaticKeyword;

public class StaticVariables {

	static String name;
	static double staticNum;
	int num1;
	
	public static void method1 () {
		System.out.println("Open browser ");
	}
	
	public static void main(String[] args) {
		
		StaticKeyword.method1(); //static method we can call thru the class
		
		//System.out.println(num1); static method only accepts class members
		
		StaticVariables objectA = new StaticVariables();
		StaticVariables obj1 = new StaticVariables();
				obj1.name = "Omer";
				System.out.println(obj1.name);
		StaticVariables obj2 = new StaticVariables();
		obj2.name="Khurshad";
		System.out.println(obj2.name); //Khurshad
		
		System.out.println(obj1.name); //Khurashad
		
		//============================================
		
		
		System.out.println(StaticVariables.staticNum);
		StaticVariables object1 = new StaticVariables();
						object1.staticNum = 4.5;
		System.out.println(object1.staticNum);
		
		StaticVariables object2 = new StaticVariables();
		System.out.println(object2.staticNum);
		
		StaticKeyword.PrintH();
		
		
	}
}
