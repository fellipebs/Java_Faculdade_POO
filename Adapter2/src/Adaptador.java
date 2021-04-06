
public class Adaptador implements Experimentador{
	ExperimentadorAvancado ta;
	
	public Adaptador(String bebida) {
		if(bebida.equalsIgnoreCase("vinho")) {
			ta = new Vinho();
		}else if(bebida.equalsIgnoreCase("whiskey")) {
			ta = new Whiskey();
		}
	}
	
	@Override
	public void experimentar(String tipoBebida, String nomeBebida) {
		if(tipoBebida.equalsIgnoreCase("vinho")) {
			ta.experimentaVinho(nomeBebida);
		}else if(tipoBebida.equalsIgnoreCase("whiskey")) {
			ta.experimentaWhiskey(nomeBebida);
		}
	}
}
