
public class Boi extends Animal{

	double tamanhoChifre;
	
	public Boi(String nome, double peso, String cor, int numPatas, int temAsas, double tamanhoChifre) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.tamanhoChifre = tamanhoChifre;
	}
	

	public double getTamanhoChifre() {
		return tamanhoChifre;
	}



	public void setTamanhoChifre(double tamanhoChifre) {
		this.tamanhoChifre = tamanhoChifre;
	}



	@Override
	public void emitirSom() {
		// super.emitirSom();
		System.out.println("O boi muge!");
	}
	
}
