
public class Coelho extends Animal{

	private double tamanhoOrelha;
	
	public Coelho(String nome, double peso, String cor, int numPatas, int temAsas, double tamanhoOrelha) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.tamanhoOrelha = tamanhoOrelha;
	}

	public double getTamanhoOrelha() {
		return tamanhoOrelha;
	}

	public void setTamanhoOrelha(double tamanhoOrelha) {
		this.tamanhoOrelha = tamanhoOrelha;
	}
	
	public void coelhoFaz() {
		System.out.println(" O coelho de nome : " + getNome() + " pula o dia todo atrás da cenoura!");
	}

	
}
