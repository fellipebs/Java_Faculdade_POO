
public class Divisao extends Calculadora{

	public Divisao(String nome) {
		super(nome);
		// TODO Auto-generated constructor stub
	}
	
	public void Calcular(int n1, int n2) {
		System.out.println("Resultado = " + (n1 / n2));
	}
	
	public void Calcular(double n1, double n2) {
		System.out.println("Resultado = " + (n1 / n2));
	}
	
	public void Calcular(double n1, int n2) {
		System.out.println("Resultado = " + (n1 / n2));
	}
	
	public void Calcular(int n1, double n2) {
		System.out.println("Resultado = " + (n1 / n2));
	}

}
