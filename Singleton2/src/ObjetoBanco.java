
public class ObjetoBanco {
	
	//Singleton feito para devolver informações do banco de dados

	private static ObjetoBanco instance = new ObjetoBanco();
	
	public ObjetoBanco() {
		
	}
	
	public static ObjetoBanco getInstance() {
		return instance;
	} 
	
	public void showBDInfo() {
		System.out.println("Usuário: a; Endereço: aaa; Senha: aaaaa;");
	}
	
}
