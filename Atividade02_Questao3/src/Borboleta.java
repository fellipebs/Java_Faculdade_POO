
public class Borboleta extends Animal{

	
	private int tempoMetamorfose; 
	
	public Borboleta(String nome, double peso, String cor, int numPatas, int temAsas, int tempoMetamorfose) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.tempoMetamorfose = tempoMetamorfose;
	}


	public int getTempoMetamorfose() {
		return tempoMetamorfose;
	}


	public void setTempoMetamorfose(int tempoMetamorfose) {
		this.tempoMetamorfose = tempoMetamorfose;
	}


	public void borboletaFaz() {
		
		System.out.println("O borboleta de nome: " + getNome() + ", gastou " + getTempoMetamorfose() + " para criar asas!");
		
	}
	
}
