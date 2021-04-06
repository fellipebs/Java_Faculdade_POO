import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Banco BB = new Banco();
		BB.nome = "Banco do Brasil";
		BB.endereco = "Rua Tamoios";
		BB.cnpj = "000000";
		BB.SaldoBanco = 100000;
		
		BB.buscarEndereco();
		BB.verificarSaldoBanco();
		BB.adicionarSaldoBanco(150);
		BB.retirarDinheiroBanco(150);
		
		
		Cliente cl1 = new Cliente(1, "Joao", "1001", "Rua");
		cl1.imprimirValores();
		Cliente cl2 = new Cliente(2, "Maria", "1002", "Rua");
		Cliente cl3 = new Cliente(3, "Loro", "1003", "Rua");
				
		Conta c1 = new Conta(1, "Agencia 1", "1001", "30/08/2020", 270);
		Conta c2 = new Conta(1, "Agencia 1", "1002", "30/08/2020", 1000);
		Conta c3 = new Conta(1, "Agencia 1", "1003", "30/08/2020", 500);
		
		cl1.conta = c1;
		cl2.conta = c2;
		cl3.conta = c3;
		
		BB.clientes.add(cl1);
		BB.clientes.add(cl2);
		BB.clientes.add(cl3);
		
		
		cl1.conta.Sacar(10);
		cl1.conta.Depositar(140);
		cl1.conta.VerificarSaldo();
		
		cl1.imprimirValores();
		
		cl3.tranferencia(c2, 10);
		
		//BB.tranferencia(1, 2, 100);
		
	}

}
