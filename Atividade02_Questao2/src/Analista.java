
public class Analista extends Funcionario{

	private String tipoComputador;
	
	public Analista(String nome, String matricula, String cpf, String departamento, String empresa, double salario, int nivelCargo, String tipoComputador) {
		super(nome, matricula, cpf, departamento, empresa, salario, nivelCargo);
		this.tipoComputador = tipoComputador;
	}

	public void realizaAnalise() {
		System.out.println("O analista + " + getNome() + "realiza analise com " + tipoComputador);
	}

	public String getTipoComputador() {
		return tipoComputador;
	}

	public void setTipoComputador(String tipoComputador) {
		this.tipoComputador = tipoComputador;
	}
	
	
}
