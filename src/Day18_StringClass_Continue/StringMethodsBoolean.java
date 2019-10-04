package Day18_StringClass_Continue;

public class StringMethodsBoolean {
public static void main(String[] args) {
	
	/*
	 * isEmpty(): checks if the String is empty
	 * return boolean expressions
	 * 
	 */
	
	String str = "Cybertek";
		boolean R1 = str.isEmpty();
		System.out.println(R1);
		
		String str2 = "";
		if (str.isEmpty()) {
			System.out.println("its empty String");
		} else { 
			System.out.println("its String not empty");}
	
	
	/*
	 * equals (str):checks if the two String' face values are equal or not
	 * then returns boolean expression
	 * equal==>
	 */
	
	
	String A1 = "Cybertek";
	String A2 = new String("Cybertek");
	System.out.println(A1==A2); //false
	
	boolean R2=A1.equals(A2);
	System.out.println(R2);
	
	System.out.println("java".equals("Java") );
	//false, case sensitivity
	
	
	/*
	 * equalsIgnoreCase(str): checks if the two String' visible text are equal or not, 
	 * then returns boolean expression Case sensitivity doesn matter
	 * 
	 */
	
	String s1="JAVA";
	String s2=new String ("java");
	System.out.println(s1==s2); //false);
	System.out.println(s1.equals(s2) ); // false, case sensitivity
	System.out.println(s1.equalsIgnoreCase(s2));//true
	
	/*
	 * contains(str):checks if the str is contained in the String or not
	 * then returns boolean expression
	 * 
	 * contained==> true
	 * !contained==>false
	 * 
	 */
	String name = "Mihtar";
	boolean Result=name.contains("good guy");//false
	System.out.println(Result);
	
	String name2= "Marufjon";
	System.out.println(name2.contains("m"));//false case sensitivity
	
	
	/*
	 * starsWith(str): checks if the String is started with the str 
	 * or not, then returns boolean expression
	 *  startedwith===>true      !startedwith===>false
	 * 
	 */
	
	String Today = "Java";
		boolean Result2 = Today.startsWith("J");//true
		System.out.println(Result2);
		
		
	String names = "Cybertek School is a great place to learn JAVA";
	System.out.println(names.startsWith("Cybertek School"));//true
	
	
			
	/*
	 * endsWith(str):checks if the String is ended with the given str 
	 * or not, then returns boolean expression
	 * endsWith===>true   !endsWith==>false
	 */
	
	String B1 = "Muhtar";
	System.out.println(B1.endsWith("r"));//true
	System.out.println(B1.endsWith("M"));//false
	
	
	
}
}
