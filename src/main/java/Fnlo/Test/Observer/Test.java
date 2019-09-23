package Fnlo.Test.Observer;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Watched girl = new ConcreteWatched();
		
		Watcher watcher1 = new ConcreteWatcher();
		Watcher watcher2 = new ConcreteWatcher();
		Watcher watcher3 = new ConcreteWatcher();
		
		girl.addWatcher(watcher1);
		girl.addWatcher(watcher2);
		girl.addWatcher(watcher3);
		
		girl.notifyWatchers("xxxxxxxxxx");
	}

}
