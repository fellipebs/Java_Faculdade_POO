
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnimalImpl c1 = new AnimalImpl("Dog", "Pinscher"); 
		
		System.out.println(c1.getNomeEspecie());
		
		Gato ct = new Gato("Gato", "Persa");
		ct.fazBarulho();
	}

}
