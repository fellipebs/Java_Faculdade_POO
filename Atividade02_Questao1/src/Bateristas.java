
public class Bateristas extends Artista {

	private int quantidadePratos; 
	
	public void emitemSom() {
		System.out.println("badumtss - som da bateria do bateris");
	}

	public int getQuantidadePratos() {
		return quantidadePratos;
	}

	public void setQuantidadePratos(int quantidadePratos) {
		this.quantidadePratos = quantidadePratos;
	}
	
	
}
