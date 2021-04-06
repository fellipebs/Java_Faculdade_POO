
public class TesteThread3 {
	public static void main(String[] args) {
		SincPilha pilha = new SincPilha();
		
		Produtor p1 = new Produtor(pilha);
		Produtor p2 = new Produtor(pilha);
		
		Thread produtorT1 = new Thread(p1);
		Thread produtorT2 = new Thread(p2);
		
		produtorT1.start();
		produtorT2.start();
		
		
		Consumidor c1 = new Consumidor(pilha);
		Consumidor c2 = new Consumidor(pilha);
		
		Thread consumidorT1 = new Thread(c1);
		Thread consumidorT2 = new Thread(c2);
		
		consumidorT1.start();
		consumidorT2.start();
		
	}

}
