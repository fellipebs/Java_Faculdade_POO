
public class Program {

	public static void main(String[] args) {
		
		Carro ferrari = new Carro(0, 0, 360, 2015, "Vermelho", 2 , 2, "Pirelli");
		
		ferrari.aumentarVelocidade(100, 2);
		ferrari.aumentarVelocidade(50, 1);
		ferrari.diminuirVelocidade(50, 1);
		ferrari.diminuirVelocidade(10, 0);
		
		Moto bmwS1000 = new Moto(0,0,399,2017,"Tricolor", 2, 1000, "Esportiva Carenada");
		bmwS1000.aumentarVelocidade(99, 2);
		bmwS1000.aumentarVelocidade(100, 1);
		bmwS1000.diminuirVelocidade(70, 1);
		bmwS1000.diminuirVelocidade(80, 2);
		
		Aviao boing = new Aviao(0,0,1000,2010,"Branco", 200, 0, 50);
		boing.aumentarVelocidade(500, 1500, 12);
		boing.aumentarVelocidade(700, 1501, 20);
		boing.diminuirVelocidade(400, 1300, 150);
		boing.diminuirVelocidade(400, 1300, 90);
	}

}
