
public class Program {

	public static void main(String[] args) {
		
		Gerente gerente = new Gerente("Wilsom", "123456", "321654", "Financeiro", "Coca Cola", 10000, 10);

		Analista analista = new Analista("Fellipe", "020202", "123123", "Financeiro", "Coca Cola", 1000, 6, "Laptop da xuxa");
		Engenheiro engenheiro = new Engenheiro("Matheus", "030402", "123123", "Financeiro", "Coca Cola", 1000, 6, "Fita métrica", "1263");
		
		gerente.promoveFuncionario(analista);
		gerente.promoveFuncionario(engenheiro);
		
		System.out.println(analista.getNivelCargo());
		
		Diretor diretor = new Diretor("Bill", "123454326", "3123", "Financeiro", "Coca Cola", 40000, 10);

		diretor.promoveGerente(gerente);
		
		System.out.println(gerente.getNivelCargo());
	}

}
