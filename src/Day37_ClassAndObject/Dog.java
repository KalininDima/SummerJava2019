package Day37_ClassAndObject;

public class Dog {
/*
 Dog
 		Attributes/data:
 				breed,size,age,color,name...
 		actions:
 				eat,sleep,bark,play ...
 		
 		Dog1--> German Shepard, XXL, 5 , pink,Lassie
 			Dog1.eat() ==> Lassie
 		Dog2--> Tibetian Mastiff,small,3,red,KIKO
 			Dog2.eat() ==> KIKO
 			
 		instance variable : object variables, MUST be declared in 
 		the class and outside my method
 		
 		local variable:variables thats created within the method
 		
 		instance methods: methods belong to the object, does not 
 		have the specifier.
 		 Designed to work as an instance of the class
 		 
 */
	String Breed;
	String Size;
	byte Age;
	String Color;
	String Name;
	char Gender;
	String food;
	
	public void getInfo() {
		System.out.println(Breed+" "+Size+" "+Age+" years old "+Color+" "+Name+" "+Gender);
	}
	
	public void eat() {
		System.out.println(Name+" is eating "+food);
	}
	
	public void play() {
		System.out.println(Breed+" is playing");
		
	}
}
