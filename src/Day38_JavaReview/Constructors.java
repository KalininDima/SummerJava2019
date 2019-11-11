package Day38_JavaReview;

public class Constructors {
public static void main(String[] args) {
	
	
	
	Constructors obj  = new Constructors ((byte)2);
	
}

public Constructors() {
	System.out.println("Erhan ");
}

public Constructors (int a ) {//Erhan Ali
	this(); //Erhan
	System.out.println("Ali "); // Ali
	
}

public Constructors (double a) { //Erhan Ali Shawkrat
	this(100); //Erhan Ali
	System.out.println("Shawkrat" );
	//this (10); constructor call must be the first step
	
}

public Constructors (boolean a) {//Erhan Ali Shawkrat Dinara
	this(2.5); //Erhan Ali Shawkrat
	System.out.println("Dinara ");
}

public Constructors (String str) { //Erhan Ali Seyfo
	this(100);//Erhan Ali
	System.out.println("Seyfo");
}

public Constructors (byte a) {
	this("hello");
	System.out.println("Sabir ");
}


}
