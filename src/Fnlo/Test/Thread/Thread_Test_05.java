package Fnlo.Test.Thread;

public class Thread_Test_05 {
	
	/**
	 * 本类本期望测试不同优先级的线程然后在sleep() 和 yield()的启动情况(原因可查看Thread_Test_04.java)，暂未实现该方法应该如何测试
	 * 
	 * 改为测试直观设置线程级别，以及守护线程与用户线程的区别
	 * 
	 * **/

	public static class Mythread extends Thread{
		public Mythread(String name) {
			// TODO Auto-generated constructor stub
			super(name);
		}
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			System.out.println(Thread.currentThread().getName() + " Start.");
//			try {
//				Thread.sleep(100000);
//			} catch (InterruptedException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + "优先级:" + Thread.currentThread().getPriority());
			
			System.out.println(Thread.currentThread().getName() + " End.");
		}
	}
	
	public static void main(String[] args) throws Exception{
		Mythread thread_01 = new Mythread("thread_01");
		Mythread thread_02 = new Mythread("thread_02");
		Mythread thread_03 = new Mythread("thread_03");
		thread_01.setPriority(1);
		thread_02.setPriority(10);
		thread_03.setPriority(1);
//		thread_03.setDaemon(true);
		thread_01.start();
		thread_02.start();
		thread_03.start();
	}
	
}
