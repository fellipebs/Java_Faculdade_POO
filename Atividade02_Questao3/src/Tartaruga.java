
public class Tartaruga extends Animal {

	private int idade;
	
	public Tartaruga(String nome, double peso, String cor, int numPatas, int temAsas, int idade) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.idade = idade;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public void tartarugaFaz() {
		System.out.println("A tartatura de " + getIdade() + " anos, nada!");
	}

}
