
public class Peixe extends Animal{

	private int temEscamas;
	
	public Peixe(String nome, double peso, String cor, int numPatas, int temAsas, int temEscamas) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.temEscamas = temEscamas;
	}
	
	
	
	
	public int getTemEscamas() {
		return temEscamas;
	}




	public void setTemEscamas(int temEscamas) {
		this.temEscamas = temEscamas;
	}




	public void peixeFaz() {
		System.out.println("O peixe " + getNome() + " da cor " + getCor() + " nada!");
	}
	

}
