
public class TesteThread2 {
	public static void main(String[] args) {
		OlaRunnerModificada r = new OlaRunnerModificada();
		Thread t1 = new Thread(r);
		Thread t2 = new Thread(r);
		Thread t3 = new Thread(r);
		t1.start();
		t2.start();
		t3.start();
	}
}

class OlaRunnerModificada implements Runnable {
	int i;
	
	public void run() {
		i = 0;
		while ( i < 50) {
			System.out.println("Ola " + i++);
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}