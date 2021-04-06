
public class ControleRemoto extends Televisao{

	public ControleRemoto(String marca, int canal, int volume) {
		super(marca, canal, volume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void trocaCanal(int canal) {
		this.setCanal(canal);
	}
	
}
