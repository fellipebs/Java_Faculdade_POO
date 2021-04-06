import java.util.List;

public class Empresa {

	public String nome;
	public String endereco;
	public String cnpj;
	public double saldo = 0;
	public List<Departamento> d;
	
	
	public Empresa(String nome, String endereco, String cnpj, double saldo) {
		this.nome = nome;
		this.endereco = endereco;
		this.cnpj = cnpj;
		this.saldo = saldo;
		
	}
	
	public void exibirAtributos() {
		System.out.println("Nome:" + this.nome);
		System.out.println("Endereço:" + this.endereco);
		System.out.println("Cnpj:" + this.cnpj);
		System.out.println("Saldo:" + this.saldo);
	}
	
	public void exibirDepartamentos() {
		for(int i = 0; i < d.size(); i++) {
			if(d.get(i) != null) {
				System.out.println("Nome:" + d.get(i).nome);
			}
		}
	}
}
