
public class Gato extends Animal{

	String corOlho;
	public Gato(String nome, double peso, String cor, int numPatas, int temAsas, String corOlho) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.corOlho = corOlho;
	}
	

	public String getCorOlho() {
		return corOlho;
	}


	public void setCorOlho(String corOlho) {
		this.corOlho = corOlho;
	}


	@Override
	public void emitirSom() {
		// super.emitirSom();
		System.out.println("O gato mia!");
	}
}
