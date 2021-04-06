
public class TV extends Equipamento{
	int polegadas;
	public TV(int serial, int idade, String nome, double peso, int polegadas) {
		super(serial, idade, nome, peso);
		// TODO Auto-generated constructor stub
		this.polegadas = polegadas;
	}
	public int getPolegadas() {
		return polegadas;
	}
	public void setPolegadas(int polegadas) {
		this.polegadas = polegadas;
	}

	
	public void tvFaz() {
		System.out.println("A tv de " + getPolegadas() + " polegadas passa filmes!");
	}
	
}
