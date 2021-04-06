import java.util.ArrayList;
import java.util.List;
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Testando classe empresa
		
		Empresa a = new Empresa("Empresinha", "Rua dos bobos n: 0", "", 10, 100);
		
		a.contratarFuncionario(2); //Contratando 2 funcionarios
		a.demitirFuncionario(1); //Demitindo um deles D: 					
		
		double saldo = 0;
		saldo = a.receber(100); // Recebendo dinheiro
		System.out.println("Saldo atual:" + saldo);
		
		saldo = a.pagarFuncionario(70.75); // Pagando a diaria dos funcionarios
		System.out.println("Saldo atual:" + saldo);
		Onibus buzu = new Onibus("Carlos", 150, 100, 10, "HFS-7000", "Passarinho do cerrado");
		Onibus buzu2 = new Onibus("Maria", 201, 201, 2, "HFS-7001", "Passarinho da amazonia");
		
		a.onibus_empresa = new ArrayList<Onibus>(); // Array de objetos adicionando na posição 0
		
		a.onibus_empresa.add(buzu);
		a.onibus_empresa.add(buzu2);
		//a.onibus_empresa.remove(buzu2);
		a.onibus_empresa.get(1).removePessoa();
		// a.onibus_empresa.size()
		//for utiliza-se para array list size!
	}



}
