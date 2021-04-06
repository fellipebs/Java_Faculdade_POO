import java.util.List;

public class Escola {

	
	public String nome;
	public String endereco;
	public String cnpj;
	public int nFuncionarios;
	public int telefone;
	public List<Turma> turmas;
	
	public Escola(String nome, String endereco, String cnpj, int nFuncionarios, int telefone) {
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.nFuncionarios = nFuncionarios;
		this.telefone = telefone; 
	}
	
	public void admitirFuncionario() {
		this.nFuncionarios++;
		System.out.println("Número de funcionarios: " + this.nFuncionarios);
	}
	
	public void demitirFuncionario() {
		this.nFuncionarios--;
		System.out.println("Número de funcionarios: " + this.nFuncionarios);
	}
	
	public void dados() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Endereço: " + this.endereco);
		System.out.println("Telefone: " + this.telefone);
	}
}
