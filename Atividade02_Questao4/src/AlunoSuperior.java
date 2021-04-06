
public class AlunoSuperior extends Aluno{

	public AlunoSuperior(String nome, int idade, String endereco, String matricula, int ano) {
		super(nome, idade, endereco, matricula, ano);
		// TODO Auto-generated constructor stub
	}
	

	public void alunoSuperior() {
		System.out.println("O aluno " + getNome() + " de matricula " + getMatricula() + " é do superior!");
	}

}
