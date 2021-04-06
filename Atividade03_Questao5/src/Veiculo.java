
public class Veiculo {
	
	private int velocidade;
	private int marchaAtual;
	private int velocidadeMaxima;
	private int ano;
	private String cor;
	private int capacidadePessoas;
	
	public Veiculo(int velocidade, int marchaAtual, int velocidadeMaxima, int ano, String cor, int capacidadePessoas) {
		this.velocidade = velocidade;
		this.marchaAtual = marchaAtual;
		this.velocidadeMaxima = velocidadeMaxima;
		this.ano = ano;
		this.cor = cor;
		this.capacidadePessoas = capacidadePessoas;
	}

	public int getVelocidade() {
		return velocidade;
	}

	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}

	public int getMarchaAtual() {
		return marchaAtual;
	}

	public void setMarchaAtual(int marchaAtual) {
		this.marchaAtual = marchaAtual;
	}

	public int getVelocidadeMaxima() {
		return velocidadeMaxima;
	}

	public void setVelocidadeMaxima(int velocidadeMaxima) {
		this.velocidadeMaxima = velocidadeMaxima;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getCapacidadePessoas() {
		return capacidadePessoas;
	}

	public void setCapacidadePessoas(int capacidadePessoas) {
		this.capacidadePessoas = capacidadePessoas;
	}
	
	/*
	public void aumentarVelocidade(int velocidade) {
		this.velocidade = this.velocidade + velocidade;
	}
	
	public void diminuirVelocidade(int velocidade) {
		this.velocidade = this.velocidade - velocidade;
	}
	*/
	

}
