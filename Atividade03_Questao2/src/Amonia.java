
public class Amonia extends SubstanciaPura{
	
	int toxico;

	public Amonia(int numMoleculas, String formulaMolecular, int toxico) {
		super(numMoleculas, formulaMolecular);
		// TODO Auto-generated constructor stub
		this.toxico = toxico; 
	}

	public int getToxico() {
		return toxico;
	}

	public void setToxico(int toxico) {
		this.toxico = toxico;
	}

	@Override
	public void entrarPontoDeEbulicao(double temp) {
		if(temp >= -33.34) {
			System.out.println("A amônia está em ponto de ebulição!");
		}else{
			System.out.println("A amônia não está em ponto de ebulição!");
		}
	}
	
	@Override
	public void entrarPontoDeFusao(double temp){
		if(temp <= -77.73) {
			System.out.println("A amônia está em ponto de fusao!");
		}else{
			System.out.println("A amônia não está em ponto de fusao!");
		}
	}
	
	
}
