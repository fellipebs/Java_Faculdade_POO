
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Professor, nessa quest�o coloquei alguns objetos com m�todos tamb�m, por�m s� mostrei 3 deles.
		Aluno a = new Aluno("Jo�o", "123456", "150124521", "Turma B");
		
		
		Veiculo palio = new Veiculo("Palio", "Fiat", 2009, "Azul", 
				"1234", 4, "Carro");
		
		Animal cachorro = new Animal("Aslan", "Husky Siberiano - Cahorro", 17, "Cinza");
		
		a.informations();
		
		palio.informacoes();
		
		cachorro.info();
	}

}
