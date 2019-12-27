package Day58_Exceptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/*
 * 1. Write a method called "wait" that causes the current executing thread to sleep for the specific number of seconds
        parameters: double seconds
        return-type: void
        Thread.sleep();
    Note: Exceptions MUST be handled within the methods
2. write a method called "getData" that can retrieve the data from properties files
        parameters: String Key, String FilePath
        return-type: String
    Note: Exceptions MUST be handled within the methods
    
    EXception: unwanted or unexpected events
    cheked excpetion (unwanted) ocuures during compile time
    								MUSt be handled IMMEDIATELY
    uncheked exception(unexpected) occur during run time
    
    all the runtimeexceptions are uncheked exception
    
    EX: NoSuchElementException
    	WebDriverException
    	TimeoutException
   
   Exception Handling:
   1.try & catch: used for handling exceptions
   try{
   Exceptions code;
   } catch(EXceptionClass name){
   code;
   }
   
   try block: gets executed if the exception is checked
   catch block: gets executed if the exception is uncheked
   finally block : can use finally block along with try&catch blocks.
   			codes in finally ALWAYS gets executed regradless of the exception
   			
   			try{
   			Exception code;
   			}
   			catch(){
   			code;
   			}
   			finally{
   			code;
   			}
   
   
   Create file
	MAC:
	touch filename.fileType
	
	new-file filename.filetype
	
	properties file : key = value
	
	Properties class: helps us to retrieve data from 
 */
public class WArmUp {
	   public static void main(String[] args) {
	        
	        Wait( 3 );
	        System.out.println( "Batch 12");
	        
	        
	        Properties property = new Properties();
	        
	        String path = "/Users/dmitriykalinin/Desktop/Data.properties";
	        
	        try {
	            FileInputStream file = new FileInputStream(path);
	            property.load( file);
	        }catch (IOException e) {
	            
	        }
	            
	    
	        
	        String Name =   property.getProperty("ID");
	        System.out.println(Name);
	        
	        
	    System.out.println(   getData("NAME", "/Users/dmitriykalinin/Desktop/Data.properties"));
	        
	    System.out.println(  property.getProperty("HOHO"));
	    
	    
	    String Age1 = getData("Name", "TestData.properties");
	    System.out.println(Age1);
	    
	    
	    String URL = getData("CAR", "files/TestData2.properties");
	    
	    System.out.println(URL);
	        
	    }
	    
	    public static void Wait(double seconds) {
	        
	        try {
	          Thread.sleep( (long)(seconds*1000) );  // 1 seconds = 1000 milliseconds
	        } catch(Exception e) {  }
	        
	    }
	    
	    
	    public static String getData(String Key, String Path) {
	        Properties property = new Properties();
	        
	        
	        try {
	            FileInputStream file = new FileInputStream(Path);
	            property.load( file);
	            
	        }catch(Exception e) {
	            
	        }   
	        
	        return property.getProperty(Key);
	    }
	    
	    
	    
	    
	}
