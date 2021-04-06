
public class Singleton {
	// Classe singleton que só poderá ser intaciada uma unica vez
	private static Singleton instance;

	private Singleton() {}

	public static Singleton getInstance() {
		if(instance == null) {
			synchronized(Singleton.class) {
				if(instance == null) {
					instance = new Singleton();
				}
			}
		}
		return instance;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}
}	
	
