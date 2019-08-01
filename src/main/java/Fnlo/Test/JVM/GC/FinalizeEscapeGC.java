package Fnlo.Test.JVM.GC;

/**
 * @author Fnlo
 *	此代码演示了两点
 *1.对象可以在被GC时自我拯救
 *2.这种自救的机会只有一次，因为一个对象的finalize()方法最多只会被系统自动执行一次
 */
public class FinalizeEscapeGC {

	public static FinalizeEscapeGC SAVE_HOOK = null;
	
	public void isAlive(){
		System.out.println("yes, I am still alive !");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		super.finalize();
		System.out.println("finalized method executed!");
		FinalizeEscapeGC.SAVE_HOOK = this;
	}
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		SAVE_HOOK = new FinalizeEscapeGC();
		
		//对象第一次成功拯救自己
		SAVE_HOOK = null;
		System.gc();
		//因为finalize方法优先级比较低，所以此处暂停.5秒以等待他
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("no, I am not dead");
		}
		
		//对象第二次成功拯救自己，然而却失败了
		SAVE_HOOK = null;
//		SAVE_HOOK.finalize(); 此处显然不可以使用显示调用
		System.gc();
		//因为finalize方法优先级比较低，所以此处暂停.5秒以等待他
		Thread.sleep(500);
		if(SAVE_HOOK != null){
			SAVE_HOOK.isAlive();
		}else{
			System.out.println("no, I am not dead");
		}
	}

}
