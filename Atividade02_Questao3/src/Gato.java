
public class Gato extends Animal{
	
	private String raca;
	
	public Gato(String nome, double peso, String cor, int numPatas, int temAsas, String raca) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.raca = raca;
	}


	

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
	public void gatoFaz() {
		System.out.println(" O gato da raça " + getRaca() + " mia!");
	}
}
