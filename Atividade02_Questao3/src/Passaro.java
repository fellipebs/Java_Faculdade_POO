
public class Passaro extends Animal{

	private int numPenas;
	
	public Passaro(String nome, double peso, String cor, int numPatas, int temAsas, int numPenas) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.numPenas = numPenas;
	}

	public int getNumPenas() {
		return numPenas;
	}

	public void setNumPenas(int numPenas) {
		this.numPenas = numPenas;
	}

	
	public void passaroFaz() {
		
		System.out.println("O passaro de nome: " + getNome() + ", com " + getNumPenas() + " penas voa por cima do muro de Berlim!");
		
	}
	
	
}
