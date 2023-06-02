package testing_ground;

class Store {
	   private static Store instance = new Store();
	   private Store() {};
	   public static Store getInstance() {
		   return instance;
	   }
	   
	String state;
	
	public void changeStateAndPrint(String callerName){
		System.out.println(callerName);
		this.state = callerName;
		try {
			Thread.sleep(1000);
		} catch(InterruptedException e) {
			System.out.println("Поток прерван: " + callerName);
		}
		System.out.println(callerName + "-" + this.state);
	}
}

public class MyThread implements Runnable{
	Thread thread;
	String name;
	
	MyThread(String name){
		thread = new Thread(this, name);
		this.name = name;
	}
	
	public void run(){
		Store myStore = Store.getInstance();
		synchronized(myStore) {
			myStore.changeStateAndPrint(name);
		}
	}
	
}



//MyThread firstThread = new MyThread("first");
//MyThread secondThread = new MyThread("second");
//MyThread thirdThread = new MyThread("third");
//
//firstThread.thread.start();
//secondThread.thread.start();
//thirdThread.thread.start();
//System.out.println("1, 2, 3: " + firstThread.thread.isAlive() + secondThread.thread.isAlive() + thirdThread.thread.isAlive());
//
//try {
//	System.out.println("Ожидание завершения потоков");
//	firstThread.thread.join();
//	secondThread.thread.join();
//	thirdThread.thread.join();
//	
//} catch(InterruptedException e) {
//	System.out.println("Главный поток прерван");
//}
//
//System.out.println("1, 2, 3: " + firstThread.thread.isAlive() + secondThread.thread.isAlive() + thirdThread.thread.isAlive());
//System.out.println("Главный поток завершился");
