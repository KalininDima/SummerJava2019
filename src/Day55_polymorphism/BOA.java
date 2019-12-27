package Day55_polymorphism;

import java.util.ArrayList;
import java.util.Arrays;

/*
 * extends: class extends extends
 * 			interface extends interface
 * Implements: a class can implement multiple interface
 * 			Class implements interface
 * 
 * Objects: ClasssName		objectName = new 
 * 		  reference-type	ref-name 
 * 
 * Polymorphism: behaviors of the object in multiple ways
 * 			occurs when parent class/Interface is reference type, and
 * object is created from sub class(non abstract)
 * 
 * 			
 * 
 */
abstract class ScrumTeam{
	public String Name, JobTitle;
	public double salary;
	
	public abstract void DailyStandUp();
	public abstract void Demo();
	
	public void getEmployeeInfo(){
		System.out.println("=====================");
		System.out.println("Employee Name "+ Name);
		System.out.println("Job Title: "+JobTitle);
		System.out.println("Salary: "+ salary );
		System.out.println("=====================");
	}
}

class Developers extends ScrumTeam{
	/*
	 * NAme, JobTitle, Salary
	 */
	public Developers(String Name,String JobTitle, double Salary) {
		this.JobTitle = JobTitle;
		this.Name = Name;
		this.salary = Salary;
	}
	public void DailyStandUp() {
		
	}
	
	public void Demo() {
		
	}
}

public class BOA {
public static void main(String[] args) {
	ScrumTeam Madina = new Testers("Madina","Tester", 4000);
	ScrumTeam Akerke = new Testers("Akerk", "Automation Tester", 10000);
	ScrumTeam Erhan = new Testers("Erhan Holly", "Manual Tester", 50000);
	
	ScrumTeam [] testers = {Madina, Erhan,Akerke };
	for (ScrumTeam each : testers) {
		each.getEmployeeInfo();
	}
	
	ScrumTeam Nadire = new Developers ("Nadire", "Senior Developer", 150000);
	ScrumTeam Mahir = new Developers ("Mahir", "Junior Developer", 100000);
	ScrumTeam Parsa = new Developers ("Parsa", "Medium Developer", 220000);
	ScrumTeam Delare = new Developers ("Delare", "Developer", 1000000);
	
	ScrumTeam [] dev = {Nadire, Mahir, Parsa, Delare};
	for (ScrumTeam each : dev) {
		each.getEmployeeInfo();
	}
	ArrayList<ScrumTeam> scrum = new ArrayList<>();
	scrum.addAll(Arrays.asList(testers));
	scrum.addAll(Arrays.asList(dev));
	
	for (ScrumTeam each: scrum) {
		each.getEmployeeInfo();
	}
	
}
	
}

class Testers extends ScrumTeam{
	
	public Testers(String Name, String JobTitle, double salary) {
		this.Name = Name;
		this.JobTitle = JobTitle;
		this.salary = salary;
		

	}
	
	  @Override
	 public void DailyStandUp() {
		 System.out.println("Tester "+Name+" is talking");
	 }
	  
	  public void Demo() {
		  System.out.println("Tester "+ Name+ " is doing demo");
		  
		  
	  }
	
}
