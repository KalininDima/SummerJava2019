package Day33_ArrayList;

public class MethodCalls {
	
	public static void main(String[] args) {
		method2();
		
		int max2 = max(10,20);// 20
		System.out.println(max2);
		
		int max3 = max (100,200,50);//200
		System.out.println(max3);
		
		maximum(400,5000,555555);
		
	String str =print (10,20,30);// 30
	System.out.println(str);
		
	}
public static void method1() {
	System.out.println("A");
}
	public static void method2() {
		method1();
		System.out.println("B");
	}
	
	public static void method3() {
		method2(); // A B
		System.out.println("C");
		
	}
	
	
	
//	public static void meth1() {
		
//	public static void meth2() {
	
//	public static void meth3() {
		
	public static int max (int a , int b) {
	return (a >b) ? a: b;	
	}
	
	
	public static int max (int a, int b, int c) {
		return(max (a,b) > c)? max(a,b):c;
	}
	
	public static int max (int a,int b, int c, int d) {
		/*
		int result = max (a,b,c);
		if (result >d) {
			return result;
		
		}
		return d;
		*/
	return	max(max(a,b) , max(c,d) );
		
		
		//return (result>d) ? result : d ;
	}
	
	public static int max (int a,int b, int c, int d, int e) {
		return max ( max (a,b,c,d) , e );
		
		
	}
	
	public static int maximum (int a,int b,int c) {
		return (max(a,b,c));
	}
	
	public static String print (int a , int b , int c ) {
		maximum(a,b,c);
		return "900";
	}
	
	
}
