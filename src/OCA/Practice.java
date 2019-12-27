package OCA;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Practice {
	/*
	public static void main(String[] args) {
	*/	
	
	/*
int x = 100;
int a = x++;
int b = ++x;
int c=x++;
int d=(a<b)?(a<c)?a:(b<c)?b:c;
System.out.println(d);
*/

		
		/*
String g=new String ("JAVA");
String f="JAVA";

System.out.println(g.equals(f));

String num1= args[1];
String num2 = args[2];
String num3= args[3];
System.out.println(num3);

*/
		
		/*
		 * OCA2/1
		 * 
		 
		public static void main(String[] args) {
			String [] arr= {"A","B","C","D"};
			for (int i=0;i<arr.length;i++) {
				System.out.println(arr[i]+" ");
				if(arr[i].equals("C")) {
					continue;
				}
				System.out.println("Work done");
				break;
			}
			*/
	
	
	/*
	 OCA2 
	 
	
	public static void main(String[] args) {
	int i=10;
	int j = 20;
	int k=j+=i/5;
	System.out.println(i+ ":" + j+" : " + k );
	}
*/
	
	/*
	public static void main(String[] args) {
	int num = 5;
	do {
		System.out.println(--num + " ");
	}while(num==0);
	
	
		}
	*/
	/*
	 
	 
	public static void main(String[] args) {
		int aray[] = {10,20,30,40,50};
		int x = aray.length;
		
		while(x>0) {
			System.out.println(aray[--x]);
		}
	}
	*/
	
	/*
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		
		Integer a=1;
		list.remove(a);
		System.out.println(list);
	}
	*/
	
	public static void main(String[] args) {
		String chs [][] = new String [2][];
				chs[0] = new String [2];
				chs[1] = new String [5];
				
				int i = 97;
				
	for (int a = 0;a<chs.length;a++) {
		for (int b =0;b<chs.length;b++) {
			chs[a][b]=""+i;
			i++;
					
		}
	}
	for (int a = 0;a<chs.length;a++) {
		for (int b=0;b<chs[a].length;b++) {
			System.out.println(chs[a][b]+" ");
		}
	}
	}
	
	
	
}	


