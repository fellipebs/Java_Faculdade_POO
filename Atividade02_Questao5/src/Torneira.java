
public class Torneira extends Equipamento{

	String tipo;
	public Torneira(int serial, int idade, String nome, double peso, String tipo) {
		super(serial, idade, nome, peso);
		// TODO Auto-generated constructor stub
		this.tipo = tipo;
	}
	
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public void torneiraFaz() {
		System.out.println("A torneira de tipo: " + getTipo() + " espirra água!");
	}
	
}
