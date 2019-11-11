package Day50_Abstraction;

public class Zoo {
public static void main(String[] args) {
	
	
	CAt Cleo = new CAt('F', (byte)5 ,"Grey","Cleo");
	
	System.out.println("NAme is "+Cleo.Nickname);
	System.out.println("Gender is "+Cleo.Gender);
	System.out.println("Color is "+Cleo.Color);
	System.out.println("Age is "+Cleo.Age);
	
	System.out.println("=================");
	Cleo.getInfo();
	
	CAt Misha = new CAt('F',(byte) 3, "White", "Misha");
	Misha.getInfo();
	Misha.Sleep(6);
	Misha.Eat("Others cats");
	Misha.Drink("Vodka");
	Misha.Speak("Meow");
	
	Dog Django = new Dog ('F',(byte)6,"White&Gray&Black","Django");
	Django.getInfo();
	Django.Sleep(31);
	Django.Eat("Others animals");
	Django.Drink("blood");
	Django.Speak("kill kill kill");
	
	System.out.println("=============");
	Dog[] dog = {};
	CAt[] cat = {};
	
	dog[1].getInfo();
	
	/*
	 abstract class: Countries
	  		Data: name,flag,language,population, religion, rivals, capital city
	  		
	  		constructor that can set all those data
	  		
	  		Actions(abstract: exports(parameter, import (parameter), economy(), currency() )
	 
	 		sub class: 
	 					South Korea
	 					USA
	 					Kazakhstan
	 					New Zealand
	 					Mother Russia
	 					Turkey
	 					....
	 					
	 		abstract method, inheritance, abstract , constructor.
	 					
	 */
}
}
