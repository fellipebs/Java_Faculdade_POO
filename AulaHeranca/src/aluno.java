//			subclass		superclass
public class aluno extends Pessoa{

	private int matricula;
	private String curso;
	
	public aluno() {
		
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getCurso() {
		return "O curso da " + getNome() + " é : " + curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	
	
}
