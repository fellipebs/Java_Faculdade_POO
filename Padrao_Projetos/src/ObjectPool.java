
public class ObjectPool {
	public String temporario1;
	public String temporario2;
	public String temporario3;
	
	
	public String getTemporario1() {
		return temporario1;
	}


	public void setTemporario1(String temporario1) {
		this.temporario1 = temporario1;
	}


	public String getTemporario2() {
		return temporario2;
	}


	public void setTemporario2(String temporario2) {
		this.temporario2 = temporario2;
	}


	public String getTemporario3() {
		return temporario3;
	}


	public void setTemporario3(String temporario3) {
		this.temporario3 = temporario3;
	}
	
	
	
	public void limparTemporarios() {
		temporario1 = null;
		temporario2 = null;
		temporario3 = null;
	}


	public static void main(String[] args) {
		
		// Posso utilizar qualquer coisa com as variaveis temporarias que tenho!
		//Vou cadastrar nomes de carros, logo após utilizar as mesmas para nomes de bandas.
		ObjectPool op = new ObjectPool();
		
		String carro1 = "Lambo Huracan";
		String carro2 = "Ferrari 458";
		String carro3 = "McLaren P1";
		
		op.setTemporario1(carro1);
		op.setTemporario2(carro2);
		op.setTemporario3(carro3);
		
		System.out.println(op.getTemporario1());
		System.out.println(op.getTemporario2());
		System.out.println(op.getTemporario3());
		
		op.limparTemporarios();
		
		String banda1 = "AC/DC";
		String banda2 = "Metallica";
		String banda3 = "System of a Down";
		
		op.setTemporario1(banda1);
		op.setTemporario2(banda2);
		op.setTemporario3(banda3);
		
		System.out.println(op.getTemporario1());
		System.out.println(op.getTemporario2());
		System.out.println(op.getTemporario3());
		
	}

}


	
