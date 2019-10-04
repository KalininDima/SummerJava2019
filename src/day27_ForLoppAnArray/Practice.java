package day27_ForLoppAnArray;

public class Practice {
public static void main(String[] args) {
	//Write a programm that can remove all dublicates from 
			//String and print the result
			//EX: (aaaaaaabbbbbbcccccc)
			//output: abc
			
			
			String str = "aaaaaasssddddfffggghtyu";
			
			RemoveDublicates(str);	
	
	
	
}


public static void RemoveDublicates(String str){
	int l = str.length()-1;
	String result = "";
	for (int i = 0;i<=l;i++) {	
			if(!resultU.contains(str.substring(i,i+1))){
			result+=str.charAt(i);
			}
	}
	System.out.println(result);
}







}
