package Fnlo.Test.Thread;

import java.util.ArrayList;
import java.util.List;

public class Thread_Test_01 {

	public static long trailingZeros(long n) {
		// write your code here, try to do it without arithmetic operators.
		int res = 0;
		long temp = 1;
		for (int i = 1; i <= n; i++) {
			temp = temp * i;
		}
		while (true) {
			if (temp % 10 != 0) {
				break;
			} else {
				temp = temp / 10;
				res++;
			}
		}
		return res;
	}

	public static void main(String[] args) throws Exception {
		
		trailingZeros(105);

		for (int i = 0; i < 5; i++) {
			Runnable myRunnable = new Thread_Test_01_MyThread();
			Thread myThread1 = new Thread(myRunnable);
			myThread1.start();
		}

		for (int i = 0; i < 100; i++) {
			System.out.println(Thread.currentThread().getName() + "  " + i);
			if (i == 30) {
				Runnable myRunnable = new Thread_Test_01_MyThread();
				Thread myThread1 = new Thread(myRunnable);

				Thread myThread2 = new Thread(myRunnable);

				myThread1.start();
				myThread2.start();
			}
		}
	}
}
