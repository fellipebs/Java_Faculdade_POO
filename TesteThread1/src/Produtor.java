
public class Produtor implements Runnable {
	private SincPilha pilha;
	private int num;
	private static int contador = 1;

	public Produtor (SincPilha s) {
		pilha = s;
		num = contador++;
	}
	
	public void run() {
		char c;
		
		for ( int i = 0 ; i < 200 ; i++) {
			c = (char)(Math.random() * 26 + 'A');
			pilha.empilha(c);
			System.out.println("Produtor " + num + ": " + c);
			try {
				Thread.sleep((int)(Math.random() * 300));
			} catch (InterruptedException e) {
				// TODO: nada
			}
		}
	}
	
}
