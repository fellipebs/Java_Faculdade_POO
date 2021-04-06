// Questão 1 - B
public class Conta {

		private int codigo;
		private double saldo;
		
		public Conta(int codigo) {
			this.codigo = codigo;
		}
		
		public void sacar(double valor, double juros) {
			if(this.saldo - (valor+juros) >= 0) {
				this.saldo = this.saldo - (valor+juros);
				System.out.println("Saque feito com sucesso!");
			}else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		public void transferir(double valor, Conta conta) {
			if(this.saldo - valor >= 0) {
				this.saldo = this.saldo - valor;
				conta.saldo = conta.saldo + valor;
				System.out.println("Transferencia feita com sucesso!");
			}else {
				System.out.println("Saldo insuficiente!");
			}
		}
		
		public int getCodigo() {
			return codigo;
		}
		public void setCodigo(int codigo) {
			this.codigo = codigo;
		}
		public double getSaldo() {
			return saldo;
		}
		public void setSaldo(double saldo) {
			this.saldo = saldo;
		}
		
		
		
}
