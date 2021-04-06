
public class Crocodilo extends Animal{
	
	private int qtdDentes;
	
	public Crocodilo(String nome, double peso, String cor, int numPatas, int temAsas, int qtdDentes) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.qtdDentes = qtdDentes;
	}

	public int getQtdDentes() {
		return qtdDentes;
	}

	public void setQtdDentes(int qtdDentes) {
		this.qtdDentes = qtdDentes;
	}

	
	
	public void crocodiloFaz() {
		System.out.println("O crocodilo de nome : " + getNome() + " caça suas presas com seus " + getQtdDentes() + " dentes");
	}
	
	
	
}
