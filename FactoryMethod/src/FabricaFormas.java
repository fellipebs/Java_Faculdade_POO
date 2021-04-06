
public class FabricaFormas {

	public Forma getForm(String forma) {
		if(forma.equalsIgnoreCase("Retangulo")) {
			return new Retangulo();
		}else if(forma.equalsIgnoreCase("Circulo")) {
			return new Circulo();
		}else if(forma.equalsIgnoreCase("Quadrado")) {
			return new Quadrado();
		}else {
			return null;
		}
		
	}
}
