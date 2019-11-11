package Day37_ClassAndObject;

public class Car {
/*
 car
 	data/attribute
 		model,year,brand,color,price,millage, VIN
 		
 actions:
 		start,drive,accelarance, stop, drift,brake,get ticket
 		
 		car1 -->  Audi q7 2020, white, 40000$, 10, 12123312412
 			car1.start() ==> Audi
 		
 		car2 --> Tesla Model S 2025, red,60,20,234323432432
 				car2.start() ==> Tesla
 				
 		objects: instance of the class
 		class: where the object came from, determines how the object should behave
 		
 	
 	regular method:
 			access-modofier specifier return-Type methodName {
 			
 			}
 			
 	instance method:
 			access-modifier returnType methodName(parameter if needed) {
 			
 			}
 		
 */
	public static void main(String[] args) {
		
		
		
		
		
		
		
		
		
		
		
	}
	 String Model;
	 int 	Year;
	 String Color;
	 double Price;
	 long Millage;
	 String Brand;
	 
	 public void drive() {
		 System.out.println("Drivivng "+ Brand);
		 
	 }
	 
	  public void start() {
		  System.out.println(Brand+" is starting");
	  }
	 
	  // 2020 Toyota corolla, white, 1000$
	  public void getInfo() {
		  System.out.println(Year+" "+Brand+" "+Model+", "+Color+", "+" "+Millage+" miles, "+Price+"$");
	  }
}
