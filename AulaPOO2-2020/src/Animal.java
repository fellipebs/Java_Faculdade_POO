
public class Animal {

	private String nome;
	private int tipo;
	private double peso;
	private String cor;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if(!nome.equals("")) {
		    this.nome = nome;
		}
		else {
			System.out.println("Nome vazio lalalala");
		}
	}

	public int getTipo() {
		return tipo;
	}

	public void setTipo(int tipo) {
		this.tipo = tipo;
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


	public void dorme() {
		
	}
	
	public void ataca() {
		
	}
	
	public void corre() {
		
	}
	
	public void fazBaruio() {
		
	}
	
}
