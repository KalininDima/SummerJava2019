package Day48_MethodOverRiding;
class Test{
	
}
public class FinalClass extends Test {

	
	public static void main(String[] args) {
		String ss;
	}
	
}

final class Erhan extends Practice {
	private final String passWord = "cybertek";
	public String getPassword () {
		return passWord;
	}
	
	/*
	 public void setPassWord(String PassWord) {
	 this.PassWord = PassWord;
	  }
	  we cannot generate setter for final variable . Final variable is immutable;
	 
	 */
}


class Test2 {
	
}

// class Test2 extends Test {  }  // final classes cannot be parent