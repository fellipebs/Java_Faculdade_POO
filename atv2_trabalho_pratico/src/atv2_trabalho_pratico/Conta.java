package atv2_trabalho_pratico;

public class Conta {

	public int numConta;
	public String agencia;
	public double saldo = 0;
	
	public Conta(int numConta, String agencia, double saldo) {
		this.numConta = numConta;
		this.agencia = agencia;
		this.saldo = saldo;
	}
	
	public void Sacar(double num) {
		if(num > this.saldo) {
			System.out.println("Não pode sacar! ficará negativo");
		}else{
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

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getAgencia() {
		return agencia;
	}

	public void setAgencia(String agencia) {
		this.agencia = agencia;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	
	
}
