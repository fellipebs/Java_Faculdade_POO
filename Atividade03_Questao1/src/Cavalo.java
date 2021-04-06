
public class Cavalo extends Animal{

	double velocidadeCorrida;
	
	public Cavalo(String nome, double peso, String cor, int numPatas, int temAsas, double velocidadeCorrida) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.velocidadeCorrida = velocidadeCorrida;
	}

	public double getVelocidadeCorrida() {
		return velocidadeCorrida;
	}

	public void setVelocidadeCorrida(double velocidadeCorrida) {
		this.velocidadeCorrida = velocidadeCorrida;
	}

	@Override
	public void emitirSom() {
		// super.emitirSom();
		System.out.println("O cavalo relincha!");
	}
	
	
	
}
