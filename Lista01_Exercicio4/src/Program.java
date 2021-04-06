import java.util.ArrayList;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empresa empresaTI = new Empresa();
		
		empresaTI.nome = "Nome empresa";
		empresaTI.endereco = "Alguma rua";
		empresaTI.cnpj = "123456";
		empresaTI.saldo = 100000;
		
		Departamento desenvolvimento = new Departamento(1, "Desenvolvimento");
		Departamento suporte = new Departamento(2, "Suporte");
		Departamento comercial = new Departamento(3, "Comercial");
		Departamento financeiro = new Departamento(1, "Financeiro");
		
		empresaTI.d = new ArrayList<Departamento>(); 
		empresaTI.d.add(desenvolvimento);
		empresaTI.d.add(suporte);
		empresaTI.d.add(comercial);
		empresaTI.d.add(financeiro);
		
		empresaTI.exibirAtributos();
		empresaTI.exibirDepartamentos();
		
		// desenvolvimento.mostrarDepartamento(); -- Exemplo de mostrar Departamento
		
		Funcionario joao = new Funcionario(1, "Joao Bonitao", 1, "123454687", "01/09/2020", 1200, desenvolvimento);
		
		joao.bonificarFuncionario(10);
		joao.trocarDepartamento(comercial);
		joao.promover();
		System.out.println(joao.salarioAnual());
		// Novo departamento de joao
		System.out.println(joao.d.nome);
		
	}

}
