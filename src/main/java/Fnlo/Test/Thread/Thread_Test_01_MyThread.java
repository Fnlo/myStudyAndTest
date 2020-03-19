package Fnlo.Test.Thread;

public class Thread_Test_01_MyThread extends Thread{
	
	private int i = 0;
	
	volatile boolean flag = false;
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
//		for(i = 0; i < 100; i++){
//			System.out.println(Thread.currentThread().getName() + "  " + i);
//		}
		while (!flag) {
			
		}
		System.out.println("run end");
	}
	
	public static void main(String[] args) throws Exception {
		Thread_Test_01_MyThread x = new Thread_Test_01_MyThread();
		x.start();
		Thread.sleep(2000);
		x.flag = true;
		System.out.println("main end");
		
		
		int a = 1;
		int c = a;
		int b;
//		b = a = a + 1;		//2
//		b = a++;			//1先取值 在自增
		b = ++a;			//2 先自增 再取值
//		b = a = c + 1;		//2
		System.out.println(b);
	}
	
}
