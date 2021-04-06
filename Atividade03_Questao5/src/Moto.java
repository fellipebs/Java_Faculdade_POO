
public class Moto extends Veiculo{

	private int cilindrada;
	private String tipo;
	
	public Moto(int velocidade, int marchaAtual, int velocidadeMaxima, int ano, String cor, int capacidadePessoas, int cilindrada, String tipo) {
		super(velocidade, marchaAtual, velocidadeMaxima, ano, cor, capacidadePessoas);
		// TODO Auto-generated constructor stub
		this.cilindrada = cilindrada;
		this.tipo = tipo;
	}

	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

	public void aumentarVelocidade(int velocidade, int marcha) {
		if((velocidade > getVelocidade() && marcha > getMarchaAtual()) && (velocidade <= 100 && marcha <= 4)) {
			setVelocidade(velocidade);
			setMarchaAtual(marcha);
			System.out.println("Nova velocidade da moto: " + velocidade + " Nova marcha: " + marcha);
		}else{
			System.out.println("Algum dos pre-requisitos não foi preenchido corretamente!");
		}
	}
	
	public void diminuirVelocidade(int velocidade, int marcha) {
		if((velocidade < getVelocidade() && marcha < getMarchaAtual()) && (velocidade > 0 && marcha >= 1)) {
			setVelocidade(velocidade);
			setMarchaAtual(marcha);
			System.out.println("Nova velocidade da moto: " + velocidade + " Nova marcha: " + marcha);
		}else{
			System.out.println("Algum dos pre-requisitos não foi preenchido corretamente!");
		}
	}

}
