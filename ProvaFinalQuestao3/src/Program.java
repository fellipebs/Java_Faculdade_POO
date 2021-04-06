
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Desktop a = new Desktop(8, "Ryzen 7 2700", "Windows", "AMD");
		a.AlimentaPC(22.00, "Azul");
		a.informaCaracterísticas();
		
		Notebook b = new Notebook(8, "Ryzen 5 2600U", "Windows", "Dell");
		b.AlimentaPC("Preto", 14.00);
		b.informaCaracterísticas();
		
		Ultrabook c = new Ultrabook(8, "Ryzen 3 2200U", "Windows", "Acer");
		c.AlimentaPC(17.00);
		c.AlimentaPC("Verde Escuro");
		c.informaCaracterísticas();
	}

}
