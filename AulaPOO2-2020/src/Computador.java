
public class Computador {

	public String modelo;
	public String processador;
	public int memoriaRAM;
	public int memoriaHD;
	public int tipo;
	public double clock;
	
	public void ligar() {
		int i = 0;
		while (i < 100) {
			System.out.print(this.clock);
			this.clock = i++;
		}
	}
	
	
	public void desligar() {
		
	}
	
	
	public void hibernar() {
		
	}
	
}
