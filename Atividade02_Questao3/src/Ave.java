
public class Ave extends Animal{

	private int carnivora;
	public Ave(String nome, double peso, String cor, int numPatas, int temAsas, int carnivora) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.carnivora = carnivora;
	}
	
	public int getCarnivora() {
		return carnivora;
	}
	public void setCarnivora(int carnivora) {
		this.carnivora = carnivora;
	}

	public void aveFaz() {
		System.out.println("A ave de nome: " + getNome() + " voa até o pico do imalaia!");
	}
	
	
}
