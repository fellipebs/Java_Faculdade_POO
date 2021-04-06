
public class Veiculo {

	public String modelo;
	public String marca;
	public int ano;
	public String cor;
	public String placa;
	public int ligado = 0;
	public int qtdCilindros;
	public String tipoVeiculo;
	
	public Veiculo(String modelo, String marca, int ano, String cor, 
			String placa, int qtdCilindros, String tipoVeiculo ) {
		
		this.modelo = modelo;
		this.marca = marca;
		this.ano = ano;
		this.cor = cor;
		this.placa = placa;
		this.qtdCilindros = qtdCilindros;
		this.tipoVeiculo = tipoVeiculo;
		
	}
	
	public void ligar() {
		this.ligado = 1;
	}
	
	public void desligar() {
		this.ligado = 0;
	}
	
	public void informacoes() {
		System.out.println("Modelo: " + this.modelo);
		System.out.println("Marca: " + this.marca);
		System.out.println("Ano: " + this.ano);
		System.out.println("Cor: " + this.cor);
		System.out.println("Placa: " + this.placa);
		if(this.ligado == 1) {
			System.out.println("Ligado: SIM!");
		}else {
			System.out.println("Ligado: NÃO!");
		}
		
		System.out.println("Cilindros do motor: " + this.marca);
		System.out.println("Tipo do veiculo: " + this.tipoVeiculo);
	}
	
}
