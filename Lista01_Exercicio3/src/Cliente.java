
public class Cliente {
	public String nome;
	public int telefone;
	public String cpf;
	public double saldo;
	
	
	public Cliente(String nome, int telefone, String cpf, double saldo) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
		this.saldo = saldo;
	}
	
	public void decrementarSaldo(double val){
		this.saldo -= val;
		System.out.println("Novo valor de saldo: " + this.saldo);
	}
	
	public double verificaSaldo() {
		return this.saldo;
	}
}
