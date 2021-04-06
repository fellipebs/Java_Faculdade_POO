
public class Aviao extends Veiculo{

	private double altura;
	private double resistenciaAr;
	
	public Aviao(int velocidade, int marchaAtual, int velocidadeMaxima, int ano, String cor, int capacidadePessoas, double altura, double resistenciaAr) {
		super(velocidade, marchaAtual, velocidadeMaxima, ano, cor, capacidadePessoas);
		// TODO Auto-generated constructor stub
		this.altura = altura;
		this.resistenciaAr = resistenciaAr;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getResistenciaAr() {
		return resistenciaAr;
	}

	public void setResistenciaAr(double resistenciaAr) {
		this.resistenciaAr = resistenciaAr;
	}
	
	public void aumentarVelocidade(int velocidade, double altitude, double resistencia) {
		if(velocidade > getVelocidade() && altitude > getAltura() && resistencia < getResistenciaAr() && velocidade <= 1000 && altitude <= 3000 && resistencia < 50) {
			setVelocidade(velocidade);
			setAltura(altitude);
			setResistenciaAr(resistencia);
			System.out.println("Nova velocidade do avião: " + velocidade + " nova altitude: " + altitude + " nova resistência: " + resistencia);
		}else{
			System.out.println("Algum dos pre-requisitos não foi preenchido corretamente!");
		}
	}
	
	public void diminuirVelocidade(int velocidade, double altitude, double resistencia) {
		if(velocidade < getVelocidade() && altitude < getAltura() && resistencia > getResistenciaAr() && velocidade >= 100 && altitude >= 1000 && resistencia > 100) {
			setVelocidade(velocidade);
			setAltura(altitude);
			setResistenciaAr(resistencia);
			System.out.println("Nova velocidade do avião: " + velocidade + " nova altitude: " + altitude + " nova resistência: " + resistencia);
		}else{
			System.out.println("Algum dos pre-requisitos não foi preenchido corretamente!");
		}
	}


}
