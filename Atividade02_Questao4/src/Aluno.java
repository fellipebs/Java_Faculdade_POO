
public class Aluno extends Pessoa{

	private String matricula;
	private int ano;
	
	public Aluno(String nome, int idade, String endereco, String matricula, int ano) {
		super(nome, idade, endereco);
		// TODO Auto-generated constructor stub
		this.matricula = matricula;
		this.ano = ano;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	
}
