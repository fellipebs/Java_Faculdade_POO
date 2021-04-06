
public class Cachorro extends Animal{

	private String raca;
	
	public Cachorro(String nome, double peso, String cor, int numPatas, int temAsas, String raca) {
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
	
	
	public void cachorroFaz() {
		System.out.println(" O cachorro da raça " + getRaca() + " late!");
	}

}
