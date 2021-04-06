
public class Lobo extends Animal{

	private String areaVive;
	
	public Lobo(String nome, double peso, String cor, int numPatas, int temAsas, String areaVive) {
		super(nome, peso, cor, numPatas, temAsas);
		// TODO Auto-generated constructor stub
		this.areaVive = areaVive;
	}

	public String getAreaVive() {
		return areaVive;
	}

	public void setAreaVive(String areaVive) {
		this.areaVive = areaVive;
	}

	
	public void loboFaz() {
		System.out.println("O lobo de nome: " + getNome() + " vive na(o): " + getAreaVive() + " e por lá caça suas presas!");
	}
}
