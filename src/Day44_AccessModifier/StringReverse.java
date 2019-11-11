package Day44_AccessModifier;

public class StringReverse {

	public static void main(String[] args) {

		/*
		 * Write a return method that can reverse String
		 */

		String str = "q     w    e   r  t y";
		System.out.println(Reverse(str));
	}

	public static String Reverse(String str) {

		/*
		 public  static String  Reverse(String str) {

return new StringBuffer(str).reverse().toString());

}
		 */
		String rev = "";

		for (int j = str.length() - 1; j >= 0; j--) {
			rev += "" + str.charAt(j);
		}

		return rev;
	}

}
