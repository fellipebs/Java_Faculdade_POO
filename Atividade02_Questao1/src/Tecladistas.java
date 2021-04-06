
public class Tecladistas extends Artista {

	private String modeloTeclado;

	public void emitemSom() {
		System.out.println("plim - som do teclado do tecladista");
	}

	public String getModeloTeclado() {
		return modeloTeclado;
	}

	public void setModeloTeclado(String modeloTeclado) {
		this.modeloTeclado = modeloTeclado;
	}
	
	
}
