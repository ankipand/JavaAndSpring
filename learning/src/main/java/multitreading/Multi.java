package multitreading;

public class Multi extends Thread {

	public static void main(String[] args) {
		Multi multi = new  Multi();
		multi.run();
	}
	public void run() {
		System.out.println("running the run");
	}
}
