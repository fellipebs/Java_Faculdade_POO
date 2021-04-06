
public class SingletonObject {

	private static SingletonObject instance = new SingletonObject();
	
	public SingletonObject() {
		
	}
	
	public static SingletonObject getInstance() {
		return instance;
	} 
	
	public void showMessage() {
		System.out.println("Retornando a instance da Single Object");
	}
	
}
