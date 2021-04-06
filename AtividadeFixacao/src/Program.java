
public class Program {
	
	public static void main(String[] args) {
		
		atividade1();
		atividade2();
		atividade3();
	}
	
	
	private static void atividade1() {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Fellipe");
		pessoa.setDataNascimento("02/03/2002");
		pessoa.setAltura(1.68);
		
		pessoa.imprimeDadosPessoa();
		pessoa.coverteIdade();
	}
	
	private static void atividade2() {
		Agenda agenda = new Agenda();
		agenda.armazenaPessoa("Pipiu",10,1.20);
		agenda.armazenaPessoa("prei",10,1.20);
		agenda.armazenaPessoa("pru",10,1.20);
		agenda.armazenaPessoa("pra",10,1.20);
		agenda.armazenaPessoa("Preina",10,1.20);
		agenda.armazenaPessoa("Pripiriri",10,1.20);
		agenda.armazenaPessoa("Pripiriri",10,1.20);
		agenda.armazenaPessoa("Pripiriri",10,1.20);
		agenda.armazenaPessoa("Pripiriri",10,1.20);
		agenda.armazenaPessoa("Pripiriri",10,1.20);
		agenda.armazenaPessoa("Pripiriri",10,1.20);
		
		agenda.imprimePessoa(4);
	}
	
	private static void atividade3() {
		
	}
}
