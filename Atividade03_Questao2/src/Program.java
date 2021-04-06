
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Agua agua = new Agua(10, "H20", 1);
		Amonia amonia = new Amonia(10,"NH3", 1);
		Alcool alcool = new Alcool(10, "C2H5OH", 100);
		
		agua.entrarPontoDeEbulicao(101.1);
		agua.entrarPontoDeFusao(-1);
		
		agua.entrarPontoDeEbulicao(10);
		agua.entrarPontoDeFusao(10);
		
		amonia.entrarPontoDeEbulicao(10);
		amonia.entrarPontoDeFusao(-80);
		
		amonia.entrarPontoDeEbulicao(-80);
		amonia.entrarPontoDeFusao(10);
		
		alcool.entrarPontoDeEbulicao(100);
		alcool.entrarPontoDeFusao(-1.1);
		
		alcool.entrarPontoDeEbulicao(77);
		alcool.entrarPontoDeFusao(10);


		

	}

}
