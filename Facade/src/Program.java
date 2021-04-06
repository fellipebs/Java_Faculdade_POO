
public class Program {

	public static void main(String[] args) {
		//Utilizando o método fachada para que possa
		// simplificar a impressão das formas geométricas
		
		FazedorForma a = new FazedorForma();
		a.mostrarQuadrado();
		a.mostrarRetangulo();
		a.mostrarTriangulo();
		
	}

}
