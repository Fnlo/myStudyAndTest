package Fnlo.Test.Thread;

public class Thread_Test_02 {

	static int i = 0;
	
	public static class Mythread extends Thread{

		//static int i ;
		public static void SetI(int ix){
			i = ix;
		}
		public static int GetI(){
			return i;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			i ++;
			System.out.println(i);
		}
	}
	
	public static void main(String[] args) throws Exception{
//		Mythread thread_1 = new Mythread();
//		thread_1.start();
//		thread_1.join();
//		System.out.println(thread_1.GetI());
		
		Mythread thread_2 = new Mythread();
		Mythread thread_3 = new Mythread();
		Mythread thread_4 = new Mythread();
		thread_2.SetI(i);
		thread_2.start();
		thread_2.join();
		thread_3.SetI(i);
		thread_3.start();
		thread_3.join();
		thread_4.SetI(i);
		thread_4.start();
		thread_4.join();
		
//		System.out.println(i);
		
		
	}
}
