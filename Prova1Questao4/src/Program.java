
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Professor, nessa questão coloquei alguns objetos com métodos também, porém só mostrei 3 deles.
		Aluno a = new Aluno("João", "123456", "150124521", "Turma B");
		
		
		Veiculo palio = new Veiculo("Palio", "Fiat", 2009, "Azul", 
				"1234", 4, "Carro");
		
		Animal cachorro = new Animal("Aslan", "Husky Siberiano - Cahorro", 17, "Cinza");
		
		a.informations();
		
		palio.informacoes();
		
		cachorro.info();
	}

}
