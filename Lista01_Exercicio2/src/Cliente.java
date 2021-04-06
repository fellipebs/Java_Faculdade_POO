
public class Cliente {

	private int codCliente;
	private String nome;
	private String cpf;
	private String endereco;
	public Conta conta;
	
	public Cliente(int codCliente, String nome, String cpf, String endereco) {
		this.codCliente = codCliente; 
		this.nome = nome;
		this.cpf = cpf;
		this.endereco = endereco;
	}
	
	public void imprimirValores() {
		System.out.println("Valores da conta desse cliente:");
		System.out.println("Código: " + this.codCliente);
		System.out.println("Nome: " + this.nome);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Endereço: " + this.endereco);
	}
	
	public void imprimirConta() {
		System.out.println(this.conta.numConta);
		System.out.println(this.conta.dataCriacao);
		System.out.println(this.conta.saldo);
	}
	
	public void tranferencia(Conta contas, double valor) {
		this.conta.Sacar(valor);
		contas.Depositar(valor);
	}
}
