package Fnlo.Test.JVM.GC;

public class ReferencrCountingGC {

	public Object instance = null;

	public final static int x = 1024 * 1024 ;
	private final byte[] xx = new byte[x];
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ReferencrCountingGC objA = new ReferencrCountingGC();
		ReferencrCountingGC objB = new ReferencrCountingGC();
		objA.instance = objB;
		objB.instance = objA;
		
		objA = null;
		objB = null;
		
		//在此处进行GC之后，判断ObjA和ObjB是否被释放
		System.gc();
		
		//事实证明，objA与objB依然被释放，说明JVM并非采用引用计数法来统计需要被GC的对象，而是可达性分析法
	}

}
