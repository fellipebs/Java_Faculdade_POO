
public class Leao extends Animal{

	int numeroLeoas;
	
	public Leao(String nome, double peso, String cor, int numPatas, int temAsas, int numeroLeoas) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.numeroLeoas = numeroLeoas;
	}

	public int getNumeroLeoas() {
		return numeroLeoas;
	}

	public void setNumeroLeoas(int numeroLeoas) {
		this.numeroLeoas = numeroLeoas;
	}

	@Override
	public void emitirSom() {
		// super.emitirSom();
		System.out.println("O leão ruge!");
	}
	
	
	
}
