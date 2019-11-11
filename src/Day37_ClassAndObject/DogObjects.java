package Day37_ClassAndObject;

public class DogObjects {
public static void main(String[] args) {
	
	
	Dog dog1 = new Dog();
	
	System.out.println(dog1.Name);// null
	
	dog1.Breed = "Alaskan Malamute";
	dog1.Size = "small";
	dog1.Color = "gray and white";
	dog1.Name = "Django";
	dog1.Age = 5;
	dog1.Gender = 'M';
	dog1.food = "Chicken";
	
	
	System.out.println(dog1.Breed); //husky
	
	
	dog1.getInfo();
	
	Dog dog2 = new Dog();
		dog2.Breed = "Husky";
		dog2.Size = "Big";
		dog2.Name = "lyka";
		dog2.Color="Gray";
		dog2.Age = 3;
		dog2.Gender = 'F';
		dog2.food = "Sushi";
		
		dog2.getInfo();
		
		dog2.eat();
		dog1.eat();
		dog1.play();
		dog2.play();
		
	//	String str = new String ("Hello");
	//   str.toLowerCase();
	/*
	 Assignment:
	 	create 
	 */
	
}
}
