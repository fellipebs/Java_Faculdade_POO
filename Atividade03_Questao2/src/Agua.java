
public class Agua extends SubstanciaPura{
	int aguaDoce;
	public Agua(int numMoleculas, String formulaMolecular, int aguaDoce) {
		super(numMoleculas, formulaMolecular);
		// TODO Auto-generated constructor stub
		this.aguaDoce = aguaDoce;
	}
	public int getAguaDoce() {
		return aguaDoce;
	}
	public void setAguaDoce(int aguaDoce) {
		this.aguaDoce = aguaDoce;
	}
	
	
	@Override
	public void entrarPontoDeEbulicao(double temp) {
		if(temp >= 100.00) {
			System.out.println("A �gua est� em ponto de ebuli��o!");
		}else{
			System.out.println("A �gua n�o est� em ponto de ebuli��o!");
		}
	}
	
	@Override
	public void entrarPontoDeFusao(double temp){
		if(temp <= 0) {
			System.out.println("A �gua est� em ponto de fusao!");
		}else{
			System.out.println("A �gua n�o est� em ponto de fusao!");
		}
	}
	

}
