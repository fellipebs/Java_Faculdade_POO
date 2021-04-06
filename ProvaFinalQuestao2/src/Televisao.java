
public class Televisao {

	private String marca;
	private int canal;
	private int volume;
	
	public Televisao(String marca, int canal, int volume) {
		this.marca = marca;
		this.canal = canal;
		this.volume = volume;
	}

	public void trocaCanal(int canal) {
		this.setCanal(canal);
	}
	
	public void aumentaVolume() {
		this.volume++;
	}
	
	public void diminuiVolume() {
		this.volume--;
	}
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getCanal() {
		return canal;
	}

	public void setCanal(int canal) {
		this.canal = canal;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}
	
	
}
