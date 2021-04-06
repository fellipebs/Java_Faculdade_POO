
public class Reptil extends Animal{

	private int temSangueFrio;
	public Reptil(String nome, double peso, String cor, int numPatas, int temAsas, int temSangueFrio) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.temSangueFrio = temSangueFrio;
	}
	public int getTemSangueFrio() {
		return temSangueFrio;
	}
	public void setTemSangueFrio(int temSangueFrio) {
		this.temSangueFrio = temSangueFrio;
	}

	public void reptilFaz() {
		System.out.println("O reptil de nome: " + getNome() + " é sorrateiro!");
	}
}
