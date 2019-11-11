package Day43_JavaRecap;

public class Satic_VS_Ins_VS_Constructor {
static {
	System.out.println("Static Block"); 
	// executed as soon as the class is loaded ,only once
}

{
	System.out.println("Instance block"); 
	//executed when the object is created , runs before constructor
}

public Satic_VS_Ins_VS_Constructor() {
	System.out.println("Constructor");
	//executed when the object is created, runs after instance block
}

public static void main(String[] args) {
	Satic_VS_Ins_VS_Constructor obj = new Satic_VS_Ins_VS_Constructor();
	Satic_VS_Ins_VS_Constructor obj1 = new Satic_VS_Ins_VS_Constructor();
	// number of execution of constructor and instance block depends on
	//the number of the objects
}
}
