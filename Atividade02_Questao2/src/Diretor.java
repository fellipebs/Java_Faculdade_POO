
public class Diretor extends Funcionario{

	public Diretor(String nome, String matricula, String cpf, String departamento, String empresa, double salario,
			int nivelCargo) {
		super(nome, matricula, cpf, departamento, empresa, salario, nivelCargo);
		// TODO Auto-generated constructor stub
	}

	public void promoveGerente(Gerente gerente) {
		int lvl = gerente.getNivelCargo();
		gerente.setNivelCargo(++lvl);
	}
}
