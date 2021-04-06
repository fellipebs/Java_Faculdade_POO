
public class Program {

	public static void main(String[] args) {
		// Design Pattern para adaptador de classes!
		// esse projeto em especifico visa experimentar diferentes
		// bebidas, seria utilizado por um provador!

		ExperimentadorBebida ta = new ExperimentadorBebida();
				
		ta.experimentar("vinho", "tinto");
		ta.experimentar("whiskey", "whiskey 12 anos");
		ta.experimentar("cerveja", "skol");
	}

}
