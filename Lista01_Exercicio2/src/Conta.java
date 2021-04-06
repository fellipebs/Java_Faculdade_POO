
public class Conta {

	public int numConta;
	public String agencia;
	public String cpfDono;
	public String dataCriacao; // procurar depois um tipo date para JAVA!
	public double saldo = 0;
	
	
	public Conta(int numConta, String agencia, String cpfDono, String dataCriacao, double saldo) {
		 this.numConta = numConta;
		 this.agencia = agencia;
		 this.cpfDono = cpfDono;
		 this.dataCriacao = dataCriacao; 
		 this.saldo = saldo;
	}
	
	public void Sacar(double num) {
		if(num > this.saldo) {
			System.out.println("Não pode sacar! ficará negativo");
		}else {
	
			this.saldo -= num;
			System.out.println("Saldo total na conta após o saque: "+this.saldo);
		}
	}
	
	public void Depositar(double num) {
		this.saldo += num;
		System.out.println("Saldo total na conta após o deposito: "+this.saldo);
	}
	
	public void VerificarSaldo() {
		System.out.println("Saldo atual da conta: "+this.saldo);
	}
}
