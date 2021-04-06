
public class TocadorAudio implements Tocador{
	Adaptador ad;
	@Override
	public void tocar(String tipoAudio, String nomeArquivo) {
		if(tipoAudio.equalsIgnoreCase("mp3")) {
			System.out.println("Tocando mp3: " + nomeArquivo);
		}else if(tipoAudio.equalsIgnoreCase("webm")) {
			ad = new Adaptador(tipoAudio);
			ad.tocar(tipoAudio, nomeArquivo);
		}else {
			System.out.println("Tipo de audio inválido.");
		}
	}
	
}
