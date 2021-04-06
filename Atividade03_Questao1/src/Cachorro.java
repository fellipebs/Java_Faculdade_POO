
public class Cachorro extends Animal{

	String raca;
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

	@Override
	public void emitirSom() {
		// super.emitirSom();
		System.out.println("O cachorro late!");
	}
}
