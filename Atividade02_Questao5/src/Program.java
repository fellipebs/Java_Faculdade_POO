
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Eletrodomestico eletro = new Eletrodomestico(1234, 3, "Fogão", 200, 1.01);
		eletro.eletrodomesticoFaz();
		
		Eletromecanico eletromeca = new Eletromecanico(3211, 1, "Eletromecanico", 200, 220);
		eletromeca.eletromecanicoFaz();
		
		Hidraulico hidraulico = new Hidraulico(3211, 1, "Macaco", 2, 4562);
		hidraulico.hidraulicoFaz();
		
		Torneira torneira = new Torneira(3234, 0, "Torneira", 0.50, "Chuveirinho");
		torneira.torneiraFaz();
		
		MotorEletrico motoreletrico = new MotorEletrico(3123, 0, "Torneira", 0.50, "6 horas");
		motoreletrico.motorEletricoFaz();
		
		TV tv = new TV(7234, 0, "TV Samsung", 12, 42);
		tv.tvFaz();
		
		DVD dvd = new DVD(9723, 0, "DVD", 0.30, 0);
		dvd.dvdFaz();

		Radio radio = new Radio(8234, 0, "Rádio", 1, 98);
		radio.radioFaz();
		
		
	}

}
