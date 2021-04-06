
public class SubstanciaPura {

	int numMoleculas;
	String formulaMolecular;
	
	public SubstanciaPura(int numMoleculas, String formulaMolecular) {
		this.numMoleculas = numMoleculas;
		this.formulaMolecular = formulaMolecular;
	}
	
	public int getNumMoleculas() {
		return numMoleculas;
	}

	public void setNumMoleculas(int numMoleculas) {
		this.numMoleculas = numMoleculas;
	}

	public String getFormulaMolecular() {
		return formulaMolecular;
	}

	public void setFormulaMolecular(String formulaMolecular) {
		this.formulaMolecular = formulaMolecular;
	}
	
	public void entrarPontoDeEbulicao(double temp) {
		System.out.println("A subst�ncia entrou em ponto de ebuli��o!");
	}
	
	public void entrarPontoDeFusao(double temp){
		System.out.println("A subst�ncia entrou em ponto de fusao!");
	}
	
}
