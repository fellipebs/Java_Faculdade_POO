
public class FazedorCarro {

	
	private Carro ferrari;
	private Carro pagani;
	private Carro lambo;

	public FazedorCarro() {
		ferrari = new Ferrari();
		pagani = new Pagani();
		lambo = new Lambo();
	}
	
	public void mostrarFerrari() {
		ferrari.mostrarCarro();
	}
	
	public void mostrarPagani() {
		pagani.mostrarCarro();
	}
	
	public void mostrarLambo() {
		lambo.mostrarCarro();
	}
	
	
}
