
public class Equipamento {

	private int serial;
	private int idade;
	private String nome;
	private double peso;
	
	public Equipamento(int serial, int idade, String nome, double peso) {
		this.serial = serial;
		this.idade = idade;
		this.nome = nome;
		this.peso = peso;
	}
	
	public int getSerial() {
		return serial;
	}
	public void setSerial(int serial) {
		this.serial = serial;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
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
	
	
}
