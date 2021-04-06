
public class Analista extends Funcionario{

	public Analista(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
	}
	
	public void analisaDados() {
		System.out.println("Dados animais!");
	}

}
