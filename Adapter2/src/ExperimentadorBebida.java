
public class ExperimentadorBebida implements Experimentador{
	Adaptador ad;
	@Override
	public void experimentar(String tipoBebida, String nomeBebida) {
		if(tipoBebida.equalsIgnoreCase("vinho")) {
			System.out.println("Tomando vinho: " + nomeBebida);
		}else if(tipoBebida.equalsIgnoreCase("whiskey")) {
			ad = new Adaptador(tipoBebida);
			ad.experimentar(tipoBebida, nomeBebida);
		}else {
			System.out.println("Tipo de bebida não conhecido...");
		}
	}
}
