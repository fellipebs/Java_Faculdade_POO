
public class Program {

	public static void main(String[] args) {
		// Design Pattern para adaptador de classes!
		// esse projeto em especifico visa tocar audios em diferentes
		// formatos

		TocadorAudio ta = new TocadorAudio();
		
		ta.tocar("mp3", "fearofhtedark.mp3");
		ta.tocar("webm", "fearofhtedark.webm");
		ta.tocar("mp4", "fearofhtedark.mp4");
	}

}
