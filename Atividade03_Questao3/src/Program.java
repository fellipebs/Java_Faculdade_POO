
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multiplicacao a = new Multiplicacao("Calc");
		Divisao b = new Divisao("Calc");
		Adicao c = new Adicao("Calc");
		Subtracao d = new Subtracao("Calc");
		
		a.Calcular(10, 10);
		a.Calcular(5.2, 10);
		a.Calcular(10, 5.2);
		a.Calcular(10.1, 10.1);
		
		b.Calcular(10, 10);
		b.Calcular(5.2, 10);
		b.Calcular(10, 5.2);
		b.Calcular(10.1, 10.1);
		
		c.Calcular(10, 10);
		c.Calcular(5.2, 10);
		c.Calcular(10, 5.2);
		c.Calcular(10.1, 10.1);
		
		d.Calcular(10, 10);
		d.Calcular(5.2, 10);
		d.Calcular(10, 5.2);
		d.Calcular(10.1, 10.1);
	}

}
