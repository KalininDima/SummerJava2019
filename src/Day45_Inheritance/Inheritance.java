package Day45_Inheritance;

class TestBase{
	
  static String chromeDriver = "Fire Fox";//default
  
  public static void TakeScreenShot() {
	  System.out.println("Screen shot");
	  
  }
  
  private static void closeBrowser () {
	  
	  System.out.println("Browser closed");
  }
	
}

class D extends TestBase {
	//sub			super
}

public class Inheritance extends TestBase{
			//sub					//super
	// sub class is gonna inherit all the visible or protected features from the 
	
/*
 static  String chromeDriver;
  
 public static void TakeScreenShot(){
 System.out.println(TakeScreenShot)
 }
 
 those variable are method we can not see them but they are somwhere in the classes
 */

	
	public static void main (String[] args ) {
		System.out.println(chromeDriver);
		TakeScreenShot();
	}
}
