
public class Professor extends Pessoa{
	
	private double salario;
	private String curriculo;
	// Alt+shift+S+R
	
	public Professor(String nome, int idade, String endereco, double salario, String curriculo) {
		super(nome, idade, endereco);
		// TODO Auto-generated constructor stub
		this.salario = salario;
		this.curriculo = curriculo;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getCurriculo() {
		return curriculo;
	}

	public void setCurriculo(String curriculo) {
		this.curriculo = curriculo;
	}
	
}
