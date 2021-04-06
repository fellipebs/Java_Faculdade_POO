package atv2_trabalho_pratico;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		
		//Menu inicial
		int i = 0;
		List<Clientes> clientes = new ArrayList<Clientes>();
		
		while(i != 3) {
			Scanner ler = new Scanner(System.in); 
			System.out.println("Digite um dos números abaixo para prosseguir!");
			System.out.println("1 - Gerenciar CLIENTES");
			System.out.println("2 - Gerenciar CONTAS");
			System.out.println("3 - Sair");
			i = ler.nextInt();
			
			
			if(i == 1) {
				int n = 0;
				while(n != 5) {
					System.out.println("Digite um dos números abaixo para prosseguir!");
					System.out.println("1 - Cadastrar CLIENTE");
					System.out.println("2 - Consultar CLIENTE");
					System.out.println("3 - Remover CLIENTE");
					System.out.println("4 - Atualizar CLIENTE");
					System.out.println("5 - Voltar");
					n = ler.nextInt();
					if(n == 1){
						
						int codCliente = 0;
						String nome = "";
						String cpf = "";
						String endereco = "";
						System.out.println("Cadastro de clientes, digite:");
						
						System.out.println("Código do cliente:");
						codCliente = ler.nextInt();
						
						System.out.println("Nome do cliente:");
						nome = ler.next();
						
						System.out.println("CPF do cliente:");
						cpf = ler.next();
						
						System.out.println("Endereço do cliente:");
						endereco = ler.next();
						
						Clientes c = new Clientes(codCliente, nome, cpf, endereco);
						clientes.add(c);
						
					}else if(n == 2){
						System.out.println("Consulta de clientes, digite o código do cliente:");
						int cod = 0;
						int flag = 0;
						cod = ler.nextInt();
						for (int j = 0; j < clientes.size(); j++) {
							if(clientes.get(j).getCodCliente() == cod) {
								clientes.get(j).imprimirValores();
								flag++;
							}
						}
						if(flag == 0) {
							System.out.println("Código de cliente não encontrado.");
						}
						
					}else if(n == 3){
						System.out.println("Remoção de clientes, digite o código do cliente:");
						int cod = 0;
						int flag = 0;
						cod = ler.nextInt();
						for (int j = 0; j < clientes.size(); j++) {
							if(clientes.get(j).getCodCliente() == cod) {
								clientes.remove(j);
								flag++;
							}
						}
						if(flag == 0) {
							System.out.println("Código de cliente não encontrado.");
						}else {
							System.out.println("Cliente removido com sucesso!");
						}
						
					}else if(n == 4){
						System.out.println("Atualização de clientes, digite o código do cliente:");
						int cod = 0;
						int flag = 0;
						int codCliente;
						String nome = "";
						String cpf = "";
						String endereco = "";
						cod = ler.nextInt();
						for (int j = 0; j < clientes.size(); j++) {
							if(clientes.get(j).getCodCliente() == cod) {
								System.out.println("Antigos valores:");
								clientes.get(j).imprimirValores();
								
								System.out.println("Favor redigita-los! ");
								System.out.println("Código do cliente:");
								codCliente = ler.nextInt();
								clientes.get(j).setCodCliente(codCliente);
								System.out.println("Nome do cliente:");
								nome = ler.next();
								clientes.get(j).setNome(nome);
								System.out.println("CPF do cliente:");
								cpf = ler.next();
								clientes.get(j).setCpf(cpf);
								System.out.println("Endereço do cliente:");
								endereco = ler.next();
								clientes.get(j).setEndereco(endereco);
								flag++;
							}
						}
						if(flag == 0) {
							System.out.println("Código de cliente não encontrado.");
						}else {
							System.out.println("Cliente atualizado com sucesso!");
						}
						
					}else if(n == 5){
						System.out.println("Voltando ao menu inicial!");
					}else {
						System.out.println("Número não identificado!");
					}
				}
			}else if(i == 2) {
				int n = 0;
				while(n != 6) {
					System.out.println("Digite um dos números abaixo para prosseguir!");
					System.out.println("1 - Cadastrar CONTA para um CLIENTE");
					System.out.println("2 - Sacar dinheiro de uma CONTA de um CLIENTE");
					System.out.println("3 - Depositar dinheiro para uma CONTA de um CLIENTE");
					System.out.println("4 - Verificar saldo de uma CONTA de um CLIENTE");
					System.out.println("5 - Transferir dinheiro de uma CONTA de um CLIENTE para outro CLIENTE");
					System.out.println("6 - Voltar");
					n = ler.nextInt();
					if(n == 1){
						System.out.println("Cadastro de conta para cliente, digite o código do cliente:");
						int cod = 0;
						int flag = 0;
						cod = ler.nextInt();
						for (int j = 0; j < clientes.size(); j++) {
							if(clientes.get(j).getCodCliente() == cod) {
								int numConta;
								String agencia;
								double saldo = 0;
								
								System.out.println("Digite o número da conta:");
								numConta = ler.nextInt();
								
								System.out.println("Digite o nome da agência:");
								agencia = ler.next();
								
								System.out.println("Digite o saldo inicial da conta, caso não tenha, favor digitar 0:");
								saldo = ler.nextDouble();
								
								Conta conta = new Conta(numConta, agencia, saldo);
								clientes.get(j).setConta(conta);
								flag++;
							}
						}
						if(flag == 0) {
							System.out.println("Código de cliente não encontrado.");
						}else {
							System.out.println("Conta cadastrada com sucesso!");
						}
					}else if(n == 2){
						
						System.out.println("Saque de dinheiro de uma conta de um clientes, digite o código do cliente:");
						int cod = 0;
						int flag = 0;
						cod = ler.nextInt();
						for (int j = 0; j < clientes.size(); j++) {
							if(clientes.get(j).getCodCliente() == cod) {
								System.out.println("Digite quanto você deseja sacar:");
								double saque = ler.nextDouble();
								clientes.get(j).conta.Sacar(saque);
								flag++;
							}
						}
						if(flag == 0) {
							System.out.println("Código de cliente não encontrado.");
						}
						
					}else if(n == 3){
						
						System.out.println("Depósito de dinheiro de uma conta de um clientes, digite o código do cliente:");
						int cod = 0;
						int flag = 0;
						cod = ler.nextInt();
						for (int j = 0; j < clientes.size(); j++) {
							if(clientes.get(j).getCodCliente() == cod) {
								System.out.println("Digite quanto você deseja depositar:");
								double depos = ler.nextDouble();
								clientes.get(j).conta.Depositar(depos);
								flag++;
							}
						}
						if(flag == 0) {
							System.out.println("Código de cliente não encontrado.");
						}
					}else if(n == 4){
						System.out.println("Verificar o saldo uma conta de um cliente, digite o código do cliente:");
						int cod = 0;
						int flag = 0;
						cod = ler.nextInt();
						for (int j = 0; j < clientes.size(); j++) {
							if(clientes.get(j).getCodCliente() == cod) {
								clientes.get(j).conta.VerificarSaldo();
								flag++;
							}
						}
						if(flag == 0) {
							System.out.println("Código de cliente não encontrado.");
						}
					}else if(n == 5){
						System.out.println("Transferência de dinheiro entra contas:");
						System.out.println("Digite o código do cliente que irá ceder o dinheiro:");
						int cod = 0;
						int cod2 = 0;
						int flag = 0;
						cod = ler.nextInt();
						System.out.println("Digite o código do cliente que irá receber o dinheiro:");
						cod2 = ler.nextInt();
						for (int j = 0; j < clientes.size(); j++) {
							if(clientes.get(j).getCodCliente() == cod || clientes.get(j).getCodCliente() == cod2) {
								flag++;
							}
						}
						
						if(flag == 2) {
							double valor;
							System.out.println("Digite o valor de transferência:");
							valor = ler.nextDouble();
							int flag2 = 0;
							for (int j = 0; j < clientes.size(); j++) {
								if(clientes.get(j).getCodCliente() == cod) {
									if(clientes.get(j).conta.getSaldo() >= valor){
										clientes.get(j).conta.Sacar(valor);
										flag2++;
									}
								}
							}
							if(flag2 == 1){
								for (int j = 0; j < clientes.size(); j++) {
									if(clientes.get(j).getCodCliente() == cod2) {
										clientes.get(j).conta.Depositar(valor);
									}
								}
							}else{
								System.out.println("Saldo insuficiente na conta que sacará!");
							}
							
						}else{
							System.out.println("Favor conferir os códigos dos clientes!");
						}
						
						
					}else if(n == 6){
						System.out.println("Voltando ao menu inicial!");
					}else{
						System.out.println("Número não identificado!");
					}
				}
			}else if(i == 3){
				System.out.println("Saindo!");
			}else{
				System.out.println("Número não identificado!");
			}
		}
		
		
		
		

	}

}
