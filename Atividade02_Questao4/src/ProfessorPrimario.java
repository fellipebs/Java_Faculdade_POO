
public class ProfessorPrimario extends Professor{

	public ProfessorPrimario(String nome, int idade, String endereco, double salario, String curriculo) {
		super(nome, idade, endereco, salario, curriculo);
		// TODO Auto-generated constructor stub
	}
	
	public void professorPrimario() {
		System.out.println("O professor " + getNome() + " de curriculo " + getCurriculo() + " é do primario!");
	}

}
