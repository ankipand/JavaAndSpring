package multitreading;

public class Multi2 implements Runnable {
public static void main(String[] args) {
	Multi2 multi2 = new Multi2();
	Thread thread = new Thread(multi2);
	multi2.run();
   thread.start();
}

@Override
public void run() {
	System.out.println("running the second thread using runnable");
	
}
}
