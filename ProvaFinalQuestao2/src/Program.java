
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ControleRemoto ct = new ControleRemoto("Sony", 0, 12);
		
		ct.aumentaVolume();
		System.out.println(ct.getVolume());
		ct.aumentaVolume();
		System.out.println(ct.getVolume());
		ct.diminuiVolume();
		System.out.println(ct.getVolume());
		
	}

}
