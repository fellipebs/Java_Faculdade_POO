
public class DVD extends Equipamento{

	int possuiUsb;
	public DVD(int serial, int idade, String nome, double peso, int possuiUsb) {
		super(serial, idade, nome, peso);
		// TODO Auto-generated constructor stub
		this.possuiUsb = possuiUsb;
	}
	public int getPossuiUsb() {
		return possuiUsb;
	}
	public void setPossuiUsb(int possuiUsb) {
		this.possuiUsb = possuiUsb;
	}
	
	public void dvdFaz() {
		if(this.possuiUsb == 0)
			System.out.println("Esse tipo de DVD não possui usb! Filmes só podem ser vistos via CD");
		else
			System.out.println("Esse tipo de DVD possui usb! Filmes  podem ser vistos via CD e USB!");
		
	}

}
