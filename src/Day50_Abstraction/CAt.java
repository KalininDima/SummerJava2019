package Day50_Abstraction;

public class CAt extends Animal {

	public CAt (char Gender, byte Age,String Color, String Nickname) {
		super(Gender,Age,Color, Nickname);
	}

	public void Sleep(int hours) {
		System.out.println(Nickname+" Sleeps 14 hours");
	}

	public void Eat (String food) {
		System.out.println(Nickname+"  eats "+ food);
	}
	
	public void Drink(String drink) {
		System.out.println(Nickname+" drink vodka");
	}
	
	
	public void Speak(String Language) {
		System.out.println(Nickname+" says meow");
	}
	
	//Cat mycat = new Cat();
	
}
