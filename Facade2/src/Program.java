
public class Program {
	
	public static void main(String[] args) {
		//Utilizando o método fachada para que possa
		// simplificar a visualização das classes de carros!
		
		FazedorCarro a = new FazedorCarro();
		a.mostrarFerrari();
		a.mostrarPagani();
		a.mostrarLambo();
		
	}
}
