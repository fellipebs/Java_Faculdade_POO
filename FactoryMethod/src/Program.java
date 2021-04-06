
public class Program {

	public static void main(String[] args) {
		// Programa feito para identificar formas geométricas, com uma classe para cada
		// Usando o desing pattern: Factory Method!
		
		FabricaFormas fabrica = new FabricaFormas();
		
		Forma circ = fabrica.getForm("Circulo");
		
		Forma retangulo = fabrica.getForm("Quadrado");
		
		Forma quadrado = fabrica.getForm("Retangulo");
		
		circ.mostrarForma();
		retangulo.mostrarForma();
		quadrado.mostrarForma();

	}

}
