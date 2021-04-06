
public class ObjetoBanco {
	
	//Singleton feito para devolver informa��es do banco de dados

	private static ObjetoBanco instance = new ObjetoBanco();
	
	public ObjetoBanco() {
		
	}
	
	public static ObjetoBanco getInstance() {
		return instance;
	} 
	
	public void showBDInfo() {
		System.out.println("Usu�rio: a; Endere�o: aaa; Senha: aaaaa;");
	}
	
}
