
public class Eletrodomestico extends Equipamento{

	private double altura;
	public Eletrodomestico(int serial, int idade, String nome, double peso, double altura) {
		super(serial, idade, nome, peso);
		this.altura = altura;
		// TODO Auto-generated constructor stub
	}
	
	
	
	public double getAltura() {
		return altura;
	}



	public void setAltura(double altura) {
		this.altura = altura;
	}



	public void eletrodomesticoFaz() {
		System.out.println("O eletroméstico de nome: " + getNome() + " e altura: " + getAltura() + " ajuda nas tarefas de casa!");
	}

}
