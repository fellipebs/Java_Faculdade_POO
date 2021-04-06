
public class Animal {
	public String nome;
	public String especie;
	public double peso;
	public String cor;
	
	public Animal(String nome, String especie, double peso, String cor) {
		this.nome = nome;
		this.especie = especie;
		this.peso = peso;
		this.cor = cor;
		
	}
	
	public void info() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Especie: " + this.especie);
		System.out.println("Peso: " + this.peso);
		System.out.println("Cor: " + this.cor);
	}
}
