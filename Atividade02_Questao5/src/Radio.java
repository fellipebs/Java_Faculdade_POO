
public class Radio extends Equipamento{

	public int frequenciasSuportadas;
	public Radio(int serial, int idade, String nome, double peso, int frequenciasSuportadas) {
		super(serial, idade, nome, peso);
		// TODO Auto-generated constructor stub
		this.frequenciasSuportadas = frequenciasSuportadas;
	}
	
	
	public int getFrequenciasSuportadas() {
		return frequenciasSuportadas;
	}


	public void setFrequenciasSuportadas(int frequenciasSuportadas) {
		this.frequenciasSuportadas = frequenciasSuportadas;
	}


	public void radioFaz() {
		System.out.println("O rádio de " + getIdade() + " anos, suporta " + getFrequenciasSuportadas() + " frequências!");
	}

}
