
public class Calculadora {
	String nome;
	
	public Calculadora(String nome) {
		this.nome = nome;
	}
	
	public int calcular(int a, int b) {
		return a+b;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
