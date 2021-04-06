
public class Desktop extends Computador{
	
	private String marca;
	
	public Desktop(int memoria, String processador, String sistema, String marca) {
		super(memoria, processador, sistema);
		// TODO Auto-generated constructor stub
		this.marca = marca;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void informaCaracterísticas() {
		System.out.println("Info do Desktop:");
		System.out.println("Memoria: " + super.getMemoria());
		System.out.println("Processador: " + super.getProcessador());
		System.out.println("Sistema: " + this.getSistema());
		System.out.println("Cor: " + this.getCor());
		System.out.println("Tamanho da Tela: " + this.getTamanhoTela());
		System.out.println("Marca: " + this.getMarca());
	}
	
	public void AlimentaPC(String cor) { // metodo com overload para cor e tamanho tela
		this.setCor(cor);
	}
	
	public void AlimentaPC(double tamanhoTela) { // metodo com overload para cor e tamanho tela
		this.setTamanhoTela(tamanhoTela);
	}
	
	public void AlimentaPC(String cor, double tamanhoTela) { // metodo com overload para cor e tamanho tela
		this.setCor(cor);
		this.setTamanhoTela(tamanhoTela);
	}
	public void AlimentaPC(double tamanhoTela, String cor) { // metodo com overload para cor e tamanho tela
		this.setCor(cor);
		this.setTamanhoTela(tamanhoTela);
	}
	
}
