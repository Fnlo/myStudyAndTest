package Fnlo.Test.Thread;

/**
 * 对于线程wait() , notify() ,notifyAll()函数的使用，该三个函数属于Object类提供的方法
 * 对于sleep(), yield(), join() 详见Thread_Test_04.java
 * 
 * */
public class Thread_Test_03 extends Thread{

	static int i = 0;
	static Object obj = new Object();
	static Object obj2 = new Object();
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		synchronized (obj) {
			try {
				System.out.println("thread1 run");
				obj.wait();
				System.out.println("thread1 run end");
				i++;
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread_Test_03 thread_1 = new Thread_Test_03();
		thread_1.start();
		
		Thread thread_2 = new Thread(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (obj2) {
					try {
						System.out.println("thread2 run");
						obj2.wait();
						System.out.println("thread2 run end ");
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
		});
		thread_2.start();
		
		Thread thread_3 = new Thread(new Runnable() {
			
			@Override
			public void run() {
				// TODO Auto-generated method stub
				synchronized (obj) {
					System.out.println("thread3 run");
					obj.notifyAll();
					System.out.println("thread3 run end");
				}
				synchronized (obj2) {
					System.out.println("thread3 run2");
					obj2.notifyAll();
					System.out.println("thread3 run end2");
				}
			}
		});
		thread_3.start();
	}

}
