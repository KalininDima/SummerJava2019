package day39_CustomClassContinue;

public class Employee {

String Name;
String ID;
int age;
int SSN;
String JobTitile;
double salary;

public Employee(String Name, String ID,int age, int SSN, String JobTititle, int salary) {
this.Name = Name;
this.ID = ID;
this.age = age;
this.SSN = SSN;
this.JobTitile = JobTititle;
this.salary = salary;

}

public void getInfo(){
	
	System.out.println("Employe' name is : "+ Name);
	System.out.println("Social Security number is : "+ SSN);
	System.out.println("Age is : "+ age);
	System.out.println("Job title is : "+ JobTitile);
	System.out.println("Employe' ID is : "+ ID);
	System.out.println("Salary : $"+ salary);
}

}
