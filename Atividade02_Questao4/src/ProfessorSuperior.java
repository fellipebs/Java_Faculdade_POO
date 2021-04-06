
public class ProfessorSuperior extends Professor{

	public ProfessorSuperior(String nome, int idade, String endereco, double salario, String curriculo) {
		super(nome, idade, endereco, salario, curriculo);
		// TODO Auto-generated constructor stub
	}
	
	public void professorSuperior() {
		System.out.println("O professor " + getNome() + " de curriculo " + getCurriculo() + " é do superior!");
	}


}
