
public class Gerente extends Funcionario{

	public Gerente(String nome, String matricula, String cpf, String departamento, String empresa, double salario,
			int nivelCargo) {
		super(nome, matricula, cpf, departamento, empresa, salario, nivelCargo);
	}

	public void promoveFuncionario(Funcionario func) {
		int lvl = func.getNivelCargo() + 1;
		func.setNivelCargo(lvl);
	}
}
