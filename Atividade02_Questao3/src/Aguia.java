
public class Aguia extends Animal{

	private double tamanhoBico;
	
	public Aguia(String nome, double peso, String cor, int numPatas, int temAsas, double tamanhoBico) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.tamanhoBico = tamanhoBico;
	}
	
	public double getTamanhoBico() {
		return tamanhoBico;
	}


	public void setTamanhoBico(double tamanhoBico) {
		this.tamanhoBico = tamanhoBico;
	}


	public void aguiaFaz() {
		System.out.println("A aguia que tem um bico de tamanho " + getTamanhoBico() + ", mata suas vitimas impiedosamente!");
	}
}
