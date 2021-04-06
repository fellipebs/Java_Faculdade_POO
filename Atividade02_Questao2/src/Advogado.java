
public class Advogado extends Funcionario{

	private String nOAB;
	
	public Advogado(String nome, String matricula, String cpf, String departamento, String empresa, double salario, int nivelCargo, String nOAB) {
		super(nome, matricula, cpf, departamento, empresa, salario, nivelCargo);
		this.nOAB = nOAB;
	}

	public String getnOAB() {
		return nOAB;
	}

	public void setnOAB(String nOAB) {
		this.nOAB = nOAB;
	}

	
}
