import java.util.ArrayList;
import java.util.List;

public class Banco {

	public String nome;
	public String endereco;
	public String cnpj;
	public double SaldoBanco = 0;
	public List<Cliente> clientes;
	
	public Banco() {
		clientes = new ArrayList<Cliente>();
	}
	
	public void buscarEndereco() {
		System.out.println("O endereço desse banco é:" + this.endereco);
	}
	
	public void verificarSaldoBanco() {
		System.out.println("Saldo do banco: " + SaldoBanco);
	}
	
	public void adicionarSaldoBanco(double dindin) {
		this.SaldoBanco	+= dindin; 
		System.out.println("Saldo do banco: " + SaldoBanco);
	}
	
	public void retirarDinheiroBanco(double dindin){
		this.SaldoBanco	-= dindin; 
		System.out.println("Saldo do banco: " + SaldoBanco);
	}
	
}
