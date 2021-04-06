
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Programa feito para identificar carros com uma classe para cada
		// Usando o desing pattern: Factory Method!
		
		FabricaCarro fabrica = new FabricaCarro();
		
		Carro vectra = fabrica.getCarro("Vectra");
		
		Carro gol = fabrica.getCarro("Gol");
		
		Carro palio = fabrica.getCarro("Palio");
		
		vectra.mostrarCarro();
		gol.mostrarCarro();
		palio.mostrarCarro();

		
	}

}
