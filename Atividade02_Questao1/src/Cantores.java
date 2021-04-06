
public class Cantores extends Artista {

	private String modeloMicrofone;
	
	public void emitemSom() {
		System.out.println("AAA - som da voz do cantor");
	}

	public String getModeloMicrofone() {
		return modeloMicrofone;
	}

	public void setModeloMicrofone(String modeloMicrofone) {
		this.modeloMicrofone = modeloMicrofone;
	}
	
	
}
