import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Empresa superEmpresa = new Empresa("Super empresa", "Rua Célio de Castro 482", "1234567", 100000);
		
		Departamento dev = new Departamento(1, "Desenvolvimento");
		Departamento sup = new Departamento(2, "Suporte");
		Departamento rh = new Departamento(3, "Recursos Humanos");
		Departamento fin = new Departamento(4, "Financeiro");
		
		superEmpresa.d = new ArrayList<Departamento>(); 
		superEmpresa.d.add(dev);
		superEmpresa.d.add(sup);
		superEmpresa.d.add(rh);
		superEmpresa.d.add(fin);
		
		Funcionario joao = new Funcionario(1, "Joao", 1, "123454687", "01/03/2020", 2000, dev);
		Funcionario paula = new Funcionario(2, "Paula", 1, "123454687", "01/01/2020", 1200, sup);
		
		superEmpresa.exibirAtributos();
		superEmpresa.exibirDepartamentos();
		
		dev.mostrarDepartamento();
		
		joao.bonificarFuncionario(10);
		
		System.out.println(joao.d.nome);
		joao.trocarDepartamento(rh);
		System.out.println(joao.d.nome);
		
		joao.promover();
		
		double salariodojoao = joao.salarioAnual();
		System.out.println("O salário anual do joão é: " + salariodojoao);
		
	}

}
