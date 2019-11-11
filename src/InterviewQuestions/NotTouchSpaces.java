package InterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;

public class NotTouchSpaces {
	public static void main(String[] args) {
		String str = "Tom  orow  ||  __--_-KL   44 1 isinn your h and es p";
		//String str = "l";
		  //String str = "Tomorow   is   in  your  h and es";
	     //String str ="sednahr___uo___yn__isiw__o_rom_oT"
		
		char[] arr = new char[str.length()];
		ArrayList<Integer> spacenumber = new ArrayList<>();

		for (int i = 0; i < str.length(); i++) {
			if (("" + str.charAt(i)).equals(" ")) {
				spacenumber.add(i);
			}
		}

		
		int halfLenght=str.length()/2;
		if( str.length()-1%2==0&&str.length()>1) {
			halfLenght=str.length()/2-1;
		}
	
		int c = 0;
		
		for (int j = str.length() - 1; j >= halfLenght;) {
			if(str.length()==1) {
			arr[0]=str.charAt(0);
			break;
			}

			if (!spacenumber.contains(j) && !spacenumber.contains(c) && c <= halfLenght+1) {
				while (!spacenumber.contains(j) && !spacenumber.contains(c) && c <= halfLenght+1) {
					arr[j] = str.charAt(c);
					arr[c] = str.charAt(j);
					c++;
					j--;

				}

			} else if (spacenumber.contains(j) && spacenumber.contains(c) && c <= halfLenght+1) {
				while (spacenumber.contains(j) && spacenumber.contains(c) && c <= halfLenght+1) {
					arr[j] = str.charAt(j);
					arr[c] = str.charAt(c);
					c++;
					j--;

				}
				continue;
			}

			if (spacenumber.contains(j)) {
				while (spacenumber.contains(j)) {
					arr[j] = str.charAt(j);
					j--;
				}
			} else if (spacenumber.contains(c) && c <= halfLenght+1) {
				while (spacenumber.contains(c) && c <= halfLenght+1) {
					arr[c] = str.charAt(c);
					c++;
				}
			}

		}

		System.out.println(Arrays.toString(arr).replace(",",""));

	}

}
