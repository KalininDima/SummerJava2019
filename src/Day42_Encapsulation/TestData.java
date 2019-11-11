package Day42_Encapsulation;

public class TestData {
/*
 Topic: OOP Encapsulation
            1. private access modifier
            2. getter & setter
            3. multi-class
package: day42_OOP_Encapsulation
OOP: Object Oriented Programming
class:
        data/attribute ==> instance variables
 
        Actions     ==>  instance method
instance variable: belongs to the object. each object
 has its own copy of instance variable
 
Encapsulation: to hide the instance variable (hiding the data)
            1. hiding the data by giving private access modifier
            2. grants other classes get access to the private data using public getter and setter
    getter (Read only): an instance method that returns the private data, does not pass any parameter
                the return of the method MUST match with the data-type of the instance variable
                access modifier needs to be public 
    Setter(Modify): a instance method , passes a parameter.
    the parameters data type MUST match with instance variable'
    the Argument MUST be assigned to the instance variable
    if the parameter has the same name with instance variable, we
     need to use this. keyword to call the instance variable
     
     
    
    
    
private: if the feature is private, the feature is only visible within the class
        codes outside the class cannot access to the data
        not accessible to any other class  -- Khurshad
        
        
  this. keyword
  
  
 */
	
	
	 /*
    Name
    ID
    */

   private String Name = "Enes";  // the data is not visible to any other classes
   private int ID = 200;

   //getter: Read the data
   public String getName() {  // read the private data only
       return Name;
   }
   
   public int getID() {
       return ID;
   }
   
   //setter  : to change the value
public void setName (String Name) {
	this.Name = Name;
	
	
}
public void setID (int ID) {
this.ID = ID;
}
}
