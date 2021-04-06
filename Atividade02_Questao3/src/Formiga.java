
public class Formiga extends Animal{

	private int tamanhoColonia;
	public Formiga(String nome, double peso, String cor, int numPatas, int temAsas, int tamanhoColonia) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.tamanhoColonia = tamanhoColonia;
	}
	
	public int getTamanhoColonia() {
		return tamanhoColonia;
	}
	public void setTamanhoColonia(int tamanhoColonia) {
		this.tamanhoColonia = tamanhoColonia;
	}
	
	public void formigaFaz() {
		System.out.println("A formiga de nome: " + getNome() + " vive em comunidades de " + getTamanhoColonia() + " formigas" );
	}

}
