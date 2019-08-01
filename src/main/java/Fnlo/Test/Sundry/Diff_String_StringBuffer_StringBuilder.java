package Fnlo.Test.Sundry;

public class Diff_String_StringBuffer_StringBuilder {

	
	
	/**
	 * 详情可见:[https://snailclimb.gitee.io/javaguide/#/./java/Java%E5%9F%BA%E7%A1%80%E7%9F%A5%E8%AF%86?id=_11-java-%E9%9D%A2%E5%90%91%E5%AF%B9%E8%B1%A1%E7%BC%96%E7%A8%8B%E4%B8%89%E5%A4%A7%E7%89%B9%E6%80%A7-%E5%B0%81%E8%A3%85-%E7%BB%A7%E6%89%BF-%E5%A4%9A%E6%80%81]
	 * 
	 * StringBuffer 对方法加了同步锁或者对调用的方法加了同步锁，所以是线程安全的，
	 * 相对而言，StringBuilder没有对方法进行加同步锁，所以是线程非安全的
	 * 
	 * StringBuilder相比StringBuffer能获得10% ~ 15%的性能提升，但是却需要承担冒线程不安全的风险
	 * 
	 * 对三者使用总结：
	 * 1、对于操作少量数据来说，适用String
	 * 2、单线程操作字符串缓冲区下操作大量数据：适用于StringBuilder
	 * 3、多线程操作字符串缓冲区下操作大量数据：适用于StringBuffer
	 * 
	 * **/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = new String("str1");
		StringBuffer sb2 = new StringBuffer();
		StringBuilder sb3 = new StringBuilder();
	}

}
