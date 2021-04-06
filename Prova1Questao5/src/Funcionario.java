
public class Funcionario {

	public int codFunc;
	public String nome;
	public int nivelCargo;
	public String RG;
	public String dataAdmissao;
	public double salario;
	public Departamento d;

	public Funcionario(int codFunc, String nome, int nivelCargo, String RG, String dataAdmissao, double salario, Departamento d) {
		this.codFunc = codFunc;
		this.nome = nome;
		this.nivelCargo = nivelCargo;
		this.RG = RG;
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
		this.d = d;
	}

	
	public void bonificarFuncionario(double valorPorcentagem) {
		this.salario = this.salario + (this.salario * (valorPorcentagem/100));  
		System.out.println("Novo salário: " + this.salario);
	}
	
	public void trocarDepartamento(Departamento novo) {
		
		this.d = novo;

	}
	
	public void promover() {
		this.nivelCargo++;
		System.out.println("Novo nível: " + this.nivelCargo);
	}
	
	public double salarioAnual() {
		return salario * 12;
	}
	
}
