package Fnlo.Test.Thread;

public class Thread_Test_04 {

	/**
	 * 关于Thread中几种等待方式的区别(非中断方法)
	 * 1、sleep()  线程暂停执行，但不是放对象锁
	 * 2、join()	   等待线程完全执行结束后，再向下执行
	 * 3、yield()  线程暂停效果等效于sleep(int)函数，但是不指定睡眠时间。 另外关于sleep(99)与yield()的区别在于 sleep()将当前线程暂停后，
	 * 其余优先级(高，同，低优先级)的线程均有执行机会。 而对于yield()函数睡眠后只能使同优先级的线程获得执行机会。
	 * 4、wait() notify() notifyAll()  Demo详见Thread_Test_03.java
	 * 
	 * ***/

	static Object obj = new Object();
	
	public static class MyThread_Sleep_With_SyncObj extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			try {
				synchronized (obj) {
					System.out.println(Thread.currentThread().getName() + "  Start.");
					Thread.sleep(1000);
					System.out.println(Thread.currentThread().getName() + "  End. obj 释放");
				}
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static class MyThread_Sleep_Without_SyncObj extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			try {
				System.out.println(Thread.currentThread().getName() + "  Start.");
				Thread.sleep(1000);
				System.out.println(Thread.currentThread().getName() + "  End.");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static class Mythread_yield extends Thread{
		@Override
		public void run() {
			// TODO Auto-generated method stub
			super.run();
			System.out.println(Thread.currentThread().getName() + "  Start.");
			Thread.yield();
			System.out.println(Thread.currentThread().getName() + "  End.");
		}
	}
	
	
	public static void main(String[] args) throws Exception{
		//带有对象锁的线程在使用sleep()函数时，不会释放锁，导致存在synchronized时，其余线程依旧需要等待锁释放才会去执行
		MyThread_Sleep_With_SyncObj thread_sleep_obj_00 = new MyThread_Sleep_With_SyncObj();
		thread_sleep_obj_00.start();
		MyThread_Sleep_With_SyncObj thread_sleep_obj_01 = new MyThread_Sleep_With_SyncObj();
		thread_sleep_obj_01.start();
		
		thread_sleep_obj_00.join(); //join()函数是等待该线程完全执行结束后再继续向下进行
		thread_sleep_obj_01.join();
		System.out.println("===========这是一个分割线1===========");
		
		//没有对象锁的线程sleep()后，其余线程得以执行
		MyThread_Sleep_Without_SyncObj thread_sleep_noObj_02 = new MyThread_Sleep_Without_SyncObj();
		thread_sleep_noObj_02.start();
		MyThread_Sleep_Without_SyncObj thread_sleep_noObj_03 = new MyThread_Sleep_Without_SyncObj();
		thread_sleep_noObj_03.start();
		
		thread_sleep_noObj_02.join();
		thread_sleep_noObj_03.join();
		System.out.println("===========这是一个分割线2===========");
		
		Mythread_yield thread_yield_04 = new Mythread_yield();
		thread_yield_04.start();
		Mythread_yield thread_yield_05 = new Mythread_yield();
		thread_yield_05.start();
	}
	
}
