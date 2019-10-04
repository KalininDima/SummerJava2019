package Day30_WrapperClass_ArrayListy;

public class WarmUp {
public static void main(String[] args) {
	
	/*
	 1.write a return method that accepts a String and removes 
	 duplicate values from
	 EX: RemoveDuplicate (aaadaaadbbbbb) ==> "adbc"
	 
	 
	 2.write a return method that accepts String and 
	 returns the unique values from
	 EX: Unique (AABBCCCDFG)==>DFG;
	 
	 Muhtar
	 */
	

	String str = RemDup("aaaabbbbcccdd");
	System.out.println(str);
	
	//=========================================
	
	
	String str2 = UV("ABBBCCCDFRET");
	System.out.println(str2);
	
	
	
}

//Task01
public static String RemDup(String str ) {
	String result = ""; // to store the non duplicated values;
	for (int i = 0; i <str.length(); i++) {
		if (!result.contains(str.substring(i,i+1 ) ) ) {
			result+= str.substring(i,i+1);
		}
	}
	
	
	return result ;
}

//task02
public static String UV (String str) {
	String 	result = "";	
	//"AAABBBCDFRTTT" ==>CDFR	
	for (int j =0; j<str.length(); j++) {
		
	int count = 0; // to count number of appearances
	for (int i =0; i< str.length();i++) {
		
		if (str.charAt(i)==str.charAt(j)) {
			count++;
		}
	}
	if (count ==1) 
		result +=""+str.charAt(j);
	}
	return result;
}



}
