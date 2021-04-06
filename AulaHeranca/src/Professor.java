
public class Professor extends Pessoa{

	private double salario;
	private String curriculo;
	// Alt+shift+S+R
	
	public Professor(String nome) {
		//super(nome);
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
