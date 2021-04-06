
public class FabricaCarro {

	public Carro getCarro(String carro) {
		if(carro.equalsIgnoreCase("Vectra")) {
			return new Vectra();
		}else if(carro.equalsIgnoreCase("Palio")) {
			return new Palio();
		}else if(carro.equalsIgnoreCase("Gol")) {
			return new Gol();
		}else {
			return null;
		}
		
	}
	
}
