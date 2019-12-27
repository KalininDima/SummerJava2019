package Day53_InterfaceContinue;
interface B{
	void method3();
}
public interface extends_VS_Implements extends B {
					//subtype				supertype
	void method1(); //public
	void method2(); //public 
	//voidmethod3();
}

class A implements extends_VS_Implements {
	
	public void method1() {
		
	}
	public void method2() {
		
	}
	
	public void method3() {
		
	}
	/*
	 * void method1(): // public 
	 * void method2();// public 
	 */
	
}

class C extends A implements extends_VS_Implements {
	
	
}