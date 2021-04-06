
public class Alcool extends SubstanciaPura{

	double porcentagemPureza;
	public Alcool(int numMoleculas, String formulaMolecular, double porcentagemPureza) {
		super(numMoleculas, formulaMolecular);
		// TODO Auto-generated constructor stub
		this.porcentagemPureza = porcentagemPureza; 
	}
	public double getPorcentagemPureza() {
		return porcentagemPureza;
	}
	public void setPorcentagemPureza(double porcentagemPureza) {
		this.porcentagemPureza = porcentagemPureza;
	}
	
	@Override
	public void entrarPontoDeEbulicao(double temp) {
		if(temp >= 78.4) {
			System.out.println("O álcool está em ponto de ebulição!");
		}else{
			System.out.println("O álcool não está em ponto de ebulição!");
		}
	}
	
	@Override
	public void entrarPontoDeFusao(double temp){
		if(temp <= 0) {
			System.out.println("O álcool está em ponto de fusao!");
		}else{
			System.out.println("O álcool não está em ponto de fusao!");
		}
	}
	

}
