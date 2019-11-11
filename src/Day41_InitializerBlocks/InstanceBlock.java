package Day41_InitializerBlocks;

public class InstanceBlock {

	
	{
		System.out.println("Instance block");
	}
	
	{
		System.out.println("Instance block 1");
	}
	
	{
		System.out.println("Instance block 2");
	}
	
	public InstanceBlock(){
		System.out.println("Constructor");
	}
	
	public static void main(String [] args) {
		InstanceBlock obj = new InstanceBlock();
		InstanceBlock obj1 = new InstanceBlock();
		InstanceBlock obj2 = new InstanceBlock();
	}
}
