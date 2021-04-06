
public class Programa {

	public static void main(String[] args) {
		int x = 5;
		
		
		
		Veiculo palio = new Veiculo();
		
		Pessoa pessoa1 = new Pessoa("piu", "biu", 5, 0, "0101");
		//pessoa1.nome = "Piu";
		
		System.out.println(pessoa1.nome);
		pessoa1.falar();
		
		Animal ani = new Animal();
		ani.setNome("Ursão da jabiraca");
		
		System.out.println(ani.getNome());
	}

}
