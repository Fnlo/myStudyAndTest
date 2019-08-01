package Fnlo.Test.JVM;

public class Test1 {
	
	//true
	public static void test1(){
		String a = "123";
		String b = "123";
		System.out.println(a == b);
	}

	//false
	public static void test2(){
		String a = "123";
		String b = new String("123");
		System.out.println(a == b);
	}
	
//	public static void test3() throws Exception{
//		String a = "123";
//		System.out.println(a == "123");
//		a = "456";
//		System.gc();
//		Thread.sleep(500);
//		
//		String b = "123";
//		System.out.println(b == "123");
//	}
	
	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		test2();
	}

}
