package Day42_Encapsulation;

public class AmericanAirLine {

	public static void main(String[] args) {
		
		
		EmployeeInfo Emrah = new EmployeeInfo();
	//	Emrah.Name = Emrah; // private data is not visible out side the class
		Emrah.setName("Emarah");
		
		//System.out.println(Emrah.Name); private data
		
		System.out.println(Emrah.getName());
		
		Emrah.setSalary(100000);
		System.out.println(Emrah.getSalary());
		
		Emrah.setSSN(4321343);
		System.out.println(Emrah.getSSN());
		
		Emrah.setAge((byte)12);
		System.out.println(Emrah.getAge());
		System.out.println("===========================");
		EmployeeInfo Shirin = new EmployeeInfo();
		Shirin.setAge((byte)41);
		Shirin.setName("Rerula");
		Shirin.setSSN(443222332);
		Shirin.setSalary(9000000);
		System.out.println(Shirin.getName());
		System.out.println(Shirin.getSalary());
		System.out.println(Shirin.getSSN());
		System.out.println(Shirin.getAge());
		
		
		EmployeeInfo Rohan = new EmployeeInfo();
		Rohan.setInfo("Rohan",3312312,(byte)33,4444444);
		
		System.out.println(Rohan.getName()); //
		System.out.println(Rohan.getSSN());
		System.out.println(Rohan.getSalary());
		
		
		
		
	}
	
	
	
	
}
