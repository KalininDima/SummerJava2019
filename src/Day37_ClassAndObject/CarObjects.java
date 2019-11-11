package Day37_ClassAndObject;

public class CarObjects {
public static void main(String[] args) {
	
	Car 			car1 = 		new 		Car();
	//class name	objName		keyword		constructor
				car1.Brand = "BMW";
				car1.Color = "White";
				car1.Millage = 10000;
				car1.Model = "X6";
				car1.Price = 15000.5;
				car1.Year = 2000;
		System.out.println(car1.Brand); // BMW
		System.out.println(car1.Color); //White
		System.out.println(car1.Millage);
		System.out.println(car1.Model);
		System.out.println(car1.Price);
		System.out.println(car1.Year);
		
		System.out.println("=====================");
		Car car2 = new Car();
		
		System.out.println(car2.Brand); // null
		
		car2.Brand = "Toyota";
		car2.Model = "Corola";
		car2.Color = "Blue";
		car2.Millage = 441000;
		car2.Year = 2002;
		car2.Price = 5;
		
		
		car1.drive();//driving bmw
		car2.drive();//driving toyta
		
		car1.start();//driving bmw
		car2.start();//driving toyta
		
		car2.getInfo();
		
		Car car3 = new Car();
			car3.getInfo();// default values
			car3.Brand = "Lexus";
			car3.Model = "RX350";
			car3.Year = 2020;
			car3.Millage = 25000;
			car3.Color = "Purple";
			car3.Price = 43000;
			
			car3.getInfo();
		
}
	
	
	
}
