
public class Consumidor implements Runnable {
	private SincPilha pilha;
	private int num;
	private static int contador = 1;
	
	public Consumidor (SincPilha s) {
		pilha = s;
		num = contador++;
	}
	
	public void run() {
		char c;
		for ( int i = 0; i < 200; i++ ){
			c = pilha.desempilha();
			System.out.println("Consumidor " + num + ": " + c);
			
			try {
				Thread.sleep((int)(Math.random() * 300));
			} catch (InterruptedException e) {
				// TODO nada
			}
		}
	}
	
}
