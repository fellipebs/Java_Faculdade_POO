
public class Animal {

	private String nome;
	private double peso;
	private String cor;
	private int numPatas;
	private int temAsas;
	
	public Animal(String nome,double peso, String cor, int numPatas, int temAsas) {
		this.nome = nome;
		this.peso = peso;
		this.cor = cor;
		this.numPatas = numPatas;
		this.temAsas = temAsas;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getNumPatas() {
		return numPatas;
	}
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}
	public int getTemAsas() {
		return temAsas;
	}
	public void setTemAsas(int temAsas) {
		this.temAsas = temAsas;
	}
	
	public void emitirSom() {
		System.out.println("O animal emite som!");
	}
	
}
