
public class Carro extends Veiculo{

	private int numPortas;
	private String marcaPneus;
	
	public Carro(int velocidade, int marchaAtual, int velocidadeMaxima, int ano, String cor, int capacidadePessoas, int numPortas, String marcaPneus) {
		super(velocidade, marchaAtual, velocidadeMaxima, ano, cor, capacidadePessoas);
		// TODO Auto-generated constructor stub
		this.numPortas = numPortas;
		this.marcaPneus = marcaPneus;
	}
	
	
	public int getNumPortas() {
		return numPortas;
	}


	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}


	public String getMarcaPneus() {
		return marcaPneus;
	}



	public void setMarcaPneus(String marcaPneus) {
		this.marcaPneus = marcaPneus;
	}



	public void aumentarVelocidade(int velocidade, int marcha) {
		if((velocidade > getVelocidade() && marcha > getMarchaAtual()) && (velocidade <= 200 && marcha <= 5)) {
			setVelocidade(velocidade);
			setMarchaAtual(marcha);
			System.out.println("Nova velocidade do carro: " + velocidade + " Nova marcha: " + marcha);
		}else{
			System.out.println("Algum dos pre-requisitos não foi preenchido corretamente!");
		}
	}
	
	public void diminuirVelocidade(int velocidade, int marcha) {
		if((velocidade < getVelocidade() && marcha < getMarchaAtual()) && (velocidade > 0 && marcha >= 1)) {
			setVelocidade(velocidade);
			setMarchaAtual(marcha);
			System.out.println("Nova velocidade do carro: " + velocidade + " Nova marcha: " + marcha);
		}else{
			System.out.println("Algum dos pre-requisitos não foi preenchido corretamente!");
		}
	}
	

}
