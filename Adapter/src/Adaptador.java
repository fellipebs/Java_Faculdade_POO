
public class Adaptador implements Tocador{

	TocadorAvancado ta;
	
	public Adaptador(String tipoAudio) {
		if(tipoAudio.equalsIgnoreCase("mp3")) {
			ta = new Mp3Player();
		}else if(tipoAudio.equalsIgnoreCase("webm")) {
			ta = new WebmPlayer();
		}
	}
	
	@Override
	public void tocar(String tipoAudio, String nomeArquivo) {
		if(tipoAudio.equalsIgnoreCase("mp3")) {
			ta.tocaMp3(nomeArquivo);
		}else if(tipoAudio.equalsIgnoreCase("webm")) {
			ta.tocaWebm(nomeArquivo);
		}
	}
	
}
