package Fnlo.QandA;

import java.util.Arrays;

/**
 * @author Fnlo
 * 使用数组实现栈
	自己实现一个栈，要求这个栈具有push()、pop()（返回栈顶元素并出栈）、peek() （返回栈顶元素不出栈）、isEmpty()、size()这些基本的方法。

	提示：每次入栈之前先判断栈的容量是否够用，如果不够用就用Arrays.copyOf()进行扩容；
 *
 *
 */
public class MyStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Let's have a test.
		MyStack temp = new MyStack(3);
		temp.push(1);
		temp.push(2);
		temp.push(3);
		temp.push(4);
		temp.push(5);
		temp.push(6);
		temp.push(7);
		temp.push(8);
		System.out.println(temp.peek());
		System.out.println(temp.size());
		for(int i = 0; i < 8; i++){
			System.out.println(temp.pop());
		}
		System.out.println(temp.isEmpty());
		temp.pop();
	}
	
	private Object[] testStack;
	private int count;
	private int capacity;
	
	
	public MyStack(){
		count = 0;
		testStack = new Object[2];
		capacity = 2;
	}
	
	public MyStack(int capacity){
		count = 0;
		testStack = new Object[capacity];
		this.capacity = capacity;
	}

	public void push(Object obj){
		if(count == capacity){
			int newCapacity = capacity * 2;
			testStack = Arrays.copyOf(testStack, newCapacity);
			capacity = newCapacity;
		}
		testStack[count++] = obj;
	}
	
	public Object pop(){
		if(count == 0){
			return null;
		}
		count--;
		 Object lastObj = testStack[count];
//		 testStack[count - 1] = null;
//		 count --;
		 return lastObj;
	}
	
	public Object peek(){
		if(count == 0){
			return null;
		}
		Object lastObj = testStack[count - 1];
		return lastObj;
	}
	
	public boolean isEmpty(){
		return count == 0;
	}
	
	public int size(){
		return count;
	}
	
}
