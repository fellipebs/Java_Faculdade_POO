
public class AlunoPrimario extends Aluno{

	public AlunoPrimario(String nome, int idade, String endereco, String matricula, int ano) {
		super(nome, idade, endereco, matricula, ano);
		// TODO Auto-generated constructor stub
	}

	public void alunoPrimario() {
		System.out.println("O aluno " + getNome() + " de matricula " + getMatricula() + " é do primário!");
	}
}
