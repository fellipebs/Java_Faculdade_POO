import java.util.List;

public class Loja {

	public String nome;
	public String endereco;
	public String cnpj;
	public String tipoLoja;
	public List<Funcionario> func;

	
	
	public void verficarFuncionarios() {
		for(int i = 0; i < func.size(); i++) {
			System.out.println(func.get(i).nome);
		}
	}
	
	
}
