
public class Program {
	public static void main(String[] args) {
		Multiplicacao a = new Multiplicacao("Calc");
		Divisao b = new Divisao("Calc");
		Adicao c = new Adicao("Calc");
		Subtracao d = new Subtracao("Calc");
		
		int AA1 = a.calcular(10, 10);
		double AA2 = a.calcular(10.1, 10.1);
		
		int BB1 = b.calcular(10, 10);
		double BB2 = b.calcular(10.1, 10.1);
		
		int CC1 = c.calcular(10, 10);
		double CC2 = c.calcular(10.1, 10.1);
		
		int DD1 = d.calcular(10, 10);
		double DD2 = d.calcular(10.1, 10.1);
	}
}
