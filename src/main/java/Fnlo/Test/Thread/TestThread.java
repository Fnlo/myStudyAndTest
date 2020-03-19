package Fnlo.Test.Thread;

public class TestThread extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread ct = new ChildThread(Thread.currentThread());
		ct.start();
		int i = 0;
		while (i <= 10) {
			System.out.println("main" + i);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			i++;
		}
		System.out.println(ct.getState());
		ct.start();
	} 
	
	public static class ChildThread extends Thread{
		
		private Thread parentThread;
		
		public ChildThread(Thread parentThread) {
			// TODO Auto-generated constructor stub
			this.parentThread = parentThread;
		}
		
		@Override
		public void run() {
			System.out.println("childThread" + Thread.currentThread().getId() + " " +Thread.currentThread().getName());
			System.out.println(Thread.currentThread().getState());
//			while (parentThread.isAlive()) {
//				try {
//					Thread.sleep(1000);
//				} catch (InterruptedException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
//			}
		}
		
	}

}
