
public class Hidraulico extends Equipamento{

	private double pressaoSuportada;
	
	public Hidraulico(int serial, int idade, String nome, double peso, double pressaoSuportada) {
		super(serial, idade, nome, peso);
		// TODO Auto-generated constructor stub
		this.pressaoSuportada = pressaoSuportada;
	}

	public double getPressaoSuportada() {
		return pressaoSuportada;
	}

	public void setPressaoSuportada(double pressaoSuportada) {
		this.pressaoSuportada = pressaoSuportada;
	}

	
	public void hidraulicoFaz() {
		System.out.println("O equipamento hidraúlico de nome: " + getNome() + " e pressao suportado: " + getPressaoSuportada() + " fornece energia sob pressão!");
	}

	
	
}
