
public class Funcionario {

	private String nome;
	private String matricula;
	private String cpf;
	private String departamento;
	private String empresa;
	private double salario;
	private int nivelCargo;
	
	public Funcionario(String nome,	String matricula, String cpf,
						String departamento, String empresa, double salario, int nivelCargo) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf;
		this.departamento = departamento;
		this.empresa = empresa;
		this.salario = salario; 
		this.nivelCargo = nivelCargo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public String getEmpresa() {
		return empresa;
	}

	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public int getNivelCargo() {
		return nivelCargo;
	}

	public void setNivelCargo(int nivelCargo) {
		this.nivelCargo = nivelCargo;
	}
	
	
	
}
