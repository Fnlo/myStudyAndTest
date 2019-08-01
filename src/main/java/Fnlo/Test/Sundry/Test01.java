package Fnlo.Test.Sundry;

public class Test01 {

	
	static int i ;
	
	public void method(){
		int j = 0 ;
		System.out.println(j);
	}
	
	public static void main(String[] args) throws Exception{
		
		Test01 x = new Test01();
		System.out.println(x.i);
		x.method();
		
	}
}
