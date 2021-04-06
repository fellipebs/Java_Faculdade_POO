
public class Computador {

	private int memoria;
	private String processador;
	private String sistema;
	private String cor;
	private double tamanhoTela;
	
	public Computador(int memoria, String processador, String sistema) {
		this.memoria = memoria;
		this.processador = processador;
		this.sistema = sistema;
	}
	
	public int getMemoria() {
		return memoria;
	}
	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}
	public String getProcessador() {
		return processador;
	}
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getTamanhoTela() {
		return tamanhoTela;
	}
	public void setTamanhoTela(double tamanhoTela) {
		this.tamanhoTela = tamanhoTela;
	}
	
	
	public void informaCaracterísticas() {
		System.out.println("Info do computador:");
		System.out.println("Memoria: " + this.memoria);
		System.out.println("Processador: " + this.processador);
		System.out.println("Sistema: " + this.sistema);
		System.out.println("Cor: " + this.cor);
		System.out.println("Tamanho da Tela: " + this.tamanhoTela);
	}
	
	
}
