
public class Engenheiro extends Funcionario{

	public Engenheiro(String nome, String cpf, String matricula) {
		super(nome, cpf, matricula);
		
	}
	
	public void realizaCalculos() {
		System.out.println("Cad� a calculadora?");
	}
	
	@Override
	public void realizaFuncao() {
		realizaCalculos();
	}

}
