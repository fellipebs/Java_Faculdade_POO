
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Banda acdc = new Banda();
		acdc.setNome("ACDC");
		acdc.setEstilo("Rock");
		acdc.setDataCriacao("1980");
		
		Cantores cantor = new Cantores();
		cantor.setBanda(acdc);
		cantor.setNome("Nome Artistaa");
		cantor.setModeloMicrofone("Panasonic");
		cantor.setRegistro("12345");
		
		Tecladistas tecla = new Tecladistas();
		tecla.setBanda(acdc);
		tecla.setNome("Nome Artistaa");
		tecla.setModeloTeclado("Yamaha");
		tecla.setRegistro("12342");
		
		cantor.emitemSom();
		tecla.emitemSom();
		
		Bateristas batera = new Bateristas();
		batera.emitemSom();
	}

}
