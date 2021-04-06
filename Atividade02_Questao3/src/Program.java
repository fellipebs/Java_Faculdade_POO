
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inseto inseto = new Inseto("Grilo", 0.05, "Verde", 6, 1, 0);
		inseto.insetoFaz();
		Peixe peixe = new Peixe("Bagre", 5.00, "Azul", 0, 0, 1);
		peixe.peixeFaz();
		Reptil reptil = new Reptil("Dragão de comodo", 170, "Camuflado", 4, 0, 1);
		reptil.reptilFaz();
		Ave ave = new Ave("Canário", 0.24, "Amarelo", 2, 1, 0);
		ave.aveFaz();
		Mamifero mamifero = new Mamifero("Porco", 200, "Rosa", 4, 0, 1);
		mamifero.mamiferoFaz();
		Lobo lobo = new Lobo("Lobo guará", 27, "Cinza", 4, 0, "Amazônia");
		lobo.loboFaz();
		Coelho coelho = new Coelho("Coelho da floresta", 2, "Branco", 4, 0, 27);
		coelho.coelhoFaz();
		Cachorro cachorro = new Cachorro("Cachorro", 14, "Cinza e Branco", 4, 0, "Husky Siberiano");
		cachorro.cachorroFaz();
		Gato gato = new Gato("Gato", 2, "Laranja", 4, 0, "Persa");
		gato.gatoFaz();
		Crocodilo crocodilo = new Crocodilo("Crocodilo do papo amarelo", 60, "Amarelo", 4, 0, 70);
		crocodilo.crocodiloFaz();
		Tartaruga tartaruga = new Tartaruga("Tartaruga Marinha", 5, "Verde", 4, 0, 84);
		tartaruga.tartarugaFaz();
		Aguia aguia = new Aguia("Águia Rei", 7, "Branca", 2, 1, 17);
		aguia.aguiaFaz();
		Passaro passaro = new Passaro("Papagaio", 2, "Verde com Amarelo", 2, 1, 14751);
		passaro.passaroFaz();
		Borboleta borboleta = new Borboleta("Braboleta", 0.04, "Roxo", 6, 1, 1);
		borboleta.borboletaFaz();
		Formiga formiga = new Formiga("Formiga Armadeira", 0.001, "Marrom", 6, 0, 124632186);
		formiga.formigaFaz();
	}

}
