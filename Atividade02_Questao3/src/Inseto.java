
public class Inseto extends Animal{
	
	private int venenoso;
	
	public Inseto(String nome, double peso, String cor, int numPatas, int temAsas, int venenoso) {
		super(nome, peso, cor, numPatas, temAsas);
		this.venenoso = venenoso;
	}

	public int getVenenoso() {
		return venenoso;
	}

	public void setVenenoso(int venenoso) {
		this.venenoso = venenoso;
	}

	
	public void insetoFaz() {
		System.out.println("O inseto " + getNome() + " irrita as pessoas!");
	}
	

}
