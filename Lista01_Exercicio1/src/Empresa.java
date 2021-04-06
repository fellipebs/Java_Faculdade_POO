import java.util.List;

public class Empresa {
	
	public String nome;
	public String endereco;
	public String cnpj;
	public int Qtd_Funcionarios = 0;
	public double Saldo = 0;
	//Onibus onibus_empresa[] = new Onibus[10]; // Criando um array de objetos para essa empresa
	public List<Onibus> onibus_empresa;
	
	public Empresa(String nome, String endereco, String cnpj, int Qtd_Funcionarios, double Saldo) {
		this.nome = nome;
		this.endereco = endereco ;
		this.cnpj = cnpj;
		this.Qtd_Funcionarios = Qtd_Funcionarios ;
		this.Saldo = Saldo;	
	}
	
	
	public void contratarFuncionario(int numFuncionarios) {
		Qtd_Funcionarios = Qtd_Funcionarios + numFuncionarios;
		System.out.println("Total de funcionarios da empresa: "+Qtd_Funcionarios);
	}
	
	public void demitirFuncionario(int numFuncionarios) {
		Qtd_Funcionarios = Qtd_Funcionarios - numFuncionarios;
		System.out.println("Total de funcionarios da empresa: "+Qtd_Funcionarios);
	}
	
	
	public double receber(double dindin) {
		this.Saldo += dindin;
		return this.Saldo; // Retornando saldo da empresa pós recebimento
	}
	
	public double pagarFuncionario(double dindin) {
		this.Saldo -= dindin;
		return this.Saldo; // Retornando saldo da empresa pós pagamento
	}
	

}
