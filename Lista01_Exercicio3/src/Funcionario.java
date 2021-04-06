
public class Funcionario {
	public int codFuncionario;
	public String nome;
	public double salario;
	
	// public int auxVendas = 0;

	public Funcionario(int codFuncionario, String nome,	double salario) {
		this.codFuncionario = codFuncionario;
		this.nome = nome;
		this.salario = salario;
	}
	
	public void aumentaSalario() {
		salario = salario*1.05;
	}
	
	public double verificaSalario() {
		return this.salario;
	}
	
}
