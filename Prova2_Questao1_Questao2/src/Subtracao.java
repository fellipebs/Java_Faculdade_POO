
public class Subtracao extends Calculadora{

	public Subtracao(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public int calcular(int n1, int n2) {
		System.out.println("Resultado = " + (n1 - n2));
		return n1 - n2;
	}
	
	public double calcular(double n1, double n2) {
		System.out.println("Resultado = " + (n1 - n2));
		return n1 - n2;
	}
	

}
