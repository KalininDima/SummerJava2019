package Day45_Inheritance;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

class credentials{
	private String userName;
	private String passWord;
	
	//geter
	public String getUserName() {
		return userName;
	}
	public String getPassword () {
		return passWord;
	}
	
	public void setUserName (String userName) {
		this.userName = userName;
}
	public void setPassword(String passWord) {
		this.passWord = passWord;
	}
	
	public void setCredentials (String userName, String passWord) {
		this.passWord = passWord;
		this.userName = userName;
	}
	
	public void getInfo() {
		System.out.println("username "+userName);
		System.out.println("password "+ passWord);
	}
	
	
	
}

public class EncapsulationsReview {
public static void main(String[] args) {
	
	
	credentials obj = new credentials();
			//	obj.userName = "ZFDf"; private its only visible within the class
			//	obj.passWord = "1234321"; private its only visible within the class
	
	obj.setUserName("name");
	obj.setPassword("123");
	
		System.out.println(obj.getUserName());
		System.out.println(obj.getPassword());
		
	credentials Dima  = new credentials();
	Dima.setCredentials("Dmytro", "44432");
	System.out.println(Dima.getUserName()+"/"+Dima.getPassword());
	
	credentials Milana  = new credentials();
	Milana.setCredentials("Milnovvna", "12424412412");
	
	credentials[] users = {Dima, obj, Milana};
	users[0].getInfo();
	users[1].getInfo();
	
ArrayList<credentials> list =new ArrayList<>();
list.addAll(Arrays.asList(Dima,obj,Milana));

for (credentials each : list) {
	each.getInfo();
}

	
	
	
}

}
