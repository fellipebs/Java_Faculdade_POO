
public class CordenadorProfessor extends Professor{

	public CordenadorProfessor(String nome, int idade, String endereco, double salario, String curriculo) {
		super(nome, idade, endereco, salario, curriculo);
		// TODO Auto-generated constructor stub
	}

	public void cordenadorFaz() {
		System.out.println("O cordenador de nome: " + getNome() + " olha os alunos e também é professor!");
	}
	
}
