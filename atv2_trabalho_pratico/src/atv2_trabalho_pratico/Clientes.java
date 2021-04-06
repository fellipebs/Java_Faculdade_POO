package atv2_trabalho_pratico;

public class Clientes {
	private int codCliente;
	private String nome;
	private String cpf;
	private String endereco;
	public Conta conta;
	
	public Clientes(int codCliente, String nome, String cpf, String endereco) {
		this.codCliente = codCliente; 
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public void imprimirValores() {
		System.out.println("Dados da conta desse cliente:");
		System.out.println("Código: " + this.codCliente);
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Endereço: " + this.endereco);
	}

	public int getCodCliente() {
		return codCliente;
	}

	public void setCodCliente(int codCliente) {
		this.codCliente = codCliente;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public Conta getConta() {
		return conta;
	}

	public void setConta(Conta conta) {
		this.conta = conta;
	}
	
	
	
}
