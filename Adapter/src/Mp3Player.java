
public class Mp3Player implements TocadorAvancado {

	@Override
	public void tocaWebm(String nomeArquivo) {
		
	}
	
	@Override
	public void tocaMp3(String nomeArquivo) {
		System.out.println("Tocando MP3, nome: " + nomeArquivo);
	}
}
