
public class FazedorForma {
	
	private Forma triangulo;
	private Forma retangulo;
	private Forma quadrado;

	public FazedorForma() {
		triangulo = new Triangulo();
		retangulo = new Retangulo();
		quadrado = new Quadrado();
	}
	
	public void mostrarTriangulo() {
		triangulo.carregar();
	}
	
	public void mostrarRetangulo() {
		retangulo.carregar();
	}
	
	public void mostrarQuadrado() {
		quadrado.carregar();
	}
}
