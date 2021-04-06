
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Gato gato = new Gato("Garfield", 111, "Laranja", 4, 0, "Verde");
		Cachorro cachorro = new Cachorro("Aslan", 12, "Branco", 4, 0, "Husky");
		Cavalo cavalo = new Cavalo("Pangaré", 200, "Branco", 4, 0, 42);
		Leao leao = new Leao("Simba", 200, "Laranja", 4, 0, 5);
		Boi boi = new Boi("Mimoso", 300, "Preto", 4, 0, 12);
		
		gato.emitirSom();
		cachorro.emitirSom();
		cavalo.emitirSom();
		leao.emitirSom();
		boi.emitirSom();
		
	}

}
