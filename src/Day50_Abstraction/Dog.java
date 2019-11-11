package Day50_Abstraction;

public class Dog extends Animal {

	public Dog (char Gender, byte Age, String Color, String Nickname) {
		super (Gender,Age,Color,Nickname);
		
	}
	 public void Eat(String food) {
		 System.out.println(Nickname+ " is eat "+ food);
	 }
	 public void Speak (String Language) {
		 System.out.println(Nickname+" is speak "+Language);
	 }
	 public void Drink (String drink) {
		 System.out.println(Nickname + "is drink"+ drink);
	 }
	 public void Sleep(int hours) {
		 System.out.println(Nickname+" is sleep "+hours+" hours");
	 }
	
	
}
