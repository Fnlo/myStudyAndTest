package Fnlo.Test.Number;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		getScale(1310732);
	}

	public static int getScale(int number){
		System.out.println(number >> 16);
		System.out.println((number - 4) & 0xffff);
		return 0;
	}
	
}
