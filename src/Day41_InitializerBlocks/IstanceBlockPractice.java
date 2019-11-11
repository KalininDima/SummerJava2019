package Day41_InitializerBlocks;
public class IstanceBlockPractice {

	public String name = "Shrin"; // mihray, dinara
	
	
	
	public IstanceBlockPractice() {
		this(10);
		name = "qwer";
	}
		{
			name = "mihray";
		}
		
		{
			name = "rewq";
		}
	public IstanceBlockPractice(int a) {
			name = "Muhtar";
		
	}
		
	
	public static void main(String[] args) {
		
		IstanceBlockPractice obj = new IstanceBlockPractice();
		obj.name = "Aijamal";
		System.out.println(obj.name); //Shrirn
		
		IstanceBlockPractice obj2 = new IstanceBlockPractice();
		
		System.out.println(obj2.name);
	}
	
	

}
