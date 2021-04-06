
public class Eletromecanico extends Equipamento{

	public int volts;
	public Eletromecanico(int serial, int idade, String nome, double peso, int volts) {
		super(serial, idade, nome, peso);
		// TODO Auto-generated constructor stub
		this.volts = volts;
	}

	
	
	public int getVolts() {
		return volts;
	}



	public void setVolts(int volts) {
		this.volts = volts;
	}



	public void eletromecanicoFaz(){
		System.out.println("O eletromecanico de nome: " + getNome() + " opera com " + getVolts() + "volts!");
	}
}
