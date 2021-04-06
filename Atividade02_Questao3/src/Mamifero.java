
public class Mamifero extends Animal {

	private int idadeLimiteAmamentacao;
	
	public Mamifero(String nome, double peso, String cor, int numPatas, int temAsas, int idadeLimiteAmamentacao) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.idadeLimiteAmamentacao = idadeLimiteAmamentacao;
	}

	public int getIdadeLimiteAmamentacao() {
		return idadeLimiteAmamentacao;
	}

	public void setIdadeLimiteAmamentacao(int idadeLimiteAmamentacao) {
		this.idadeLimiteAmamentacao = idadeLimiteAmamentacao;
	}

	
	public void mamiferoFaz() {
		System.out.println("O Mamífero de nome: " + getNome() + " para de amamentar aos " + getIdadeLimiteAmamentacao() + " anos.");
	}
	
}
