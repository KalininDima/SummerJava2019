package Day54_Polymorphisim;
/*
 * OOP:
 * 1.Encapsulation; hiding the data, getter&setter
 * 2. Inheritance: super&sub relationship , sub class gets rich
 * 3. Abstraction: hiding the implementation , abstract & interface
 * 4. Polymorphisim: objects to behave in multiple forms
 * 
 * 
 * 
 * WarmUp:
    Create a class called Animal (Donot use abstraction for now):
                Actions: Talk()
    create sub classes of Animal class:
                1. Tiger:
                        Actions: Hunts()
                2. Octopus:
                        Actions: Swim()
        override super class' instance method Talk()
    create a class called Zoo:
            Create Arrays of Tiger
            Create Arrays of Octopus
            
            Is a relation : is inherited relationship between classes
            
            		EX: class Dog extends Animal
            		
            		class Husky extends Dog
            		
            		Dog is An animal 
            		Husky is a Dog 
            		Husky is an Animal
            		
            		Animal obj = new Husky();
            		
            Has a relation: instance of the class (object)
         		
         		class Car{
         		Engine obj = Engine();
         		
         		}
         		
         		Car Has An Engine
         		
         		class Zoo {
         		Tiger obj1 = new Tiger();
         		Octopus obj2 = new Octopus();
         		Animal obj3 = new Tiger();
         		
         		 }
         		 
         		 Zoo Has A Tiger
         		 Zoo Has An Octopus
         		 Zoo Has An Animal
         		 Tiger is an Animal
         		 
         		 
         	classA 			obj = new classA();
         	referencetype              object
         	object MUST be created from NON-Abstract class
         	
	
			Polymorphisim: 
				ocures when he super class is reference type, and 
				object is created from the classes that have IS A relashion
				with the super class / interface
				
				EX:
				WebDriver driver = new ChromeDriver();
						driver.get("google.com"); // overriden method
						will be executed opens the chrome browser
						
				WebDriver driver1 = new FireFoxDriver();
						driver1.get("google.com");
						opens the firefox browser
				
				
2. Important Rules:
1) reference type decides what is accessible and what can be used
2) reference type can be parent class or interface , and objects can 
be any sub class 

if we make the abstract class as reference type, the object MUST be
created from its sub class (Non Abstract)

if we make the interface as reference type , object MUST be created 
from the classes that are implememnting interface

Method overriding:ONLY INSTANCE METHOD CAN BE 
OVERRIDEN (INSTANCE MEANS NO STATIC KEYWORD)
		cannot be static , final, private.
		MUST take place at sub class

Extends & Implements:
class extends class
class implements interface
interface extends interface
interface cannot do anything to the class



 */
public class Polymorphism {

}
