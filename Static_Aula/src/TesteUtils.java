import java.util.ArrayList;
import java.util.List;

public class TesteUtils {

	public static void imprimeTeste() {
		System.out.println("Imprime teste!");
	}
	
	private static int valorMAX = 20;
	
	public static int calculaValores(int x, int y) {
		if(x < valorMAX && y < valorMAX) {
			if(x > y) {
				return x;
			}
			else {
				return y;
			}
		}else {
			return 0;
		}
	}
	
	public static int nomeNum(String nome) {	
		return nome.length();
	}
	
	public static void proxNum(int num) {

		if(num < 0 || num > 10) {
			System.out.println("Erro!");
		}else{
			int ct = 0;
			for(int i = num; i < 10; i++) {
				System.out.println(numerosString().get(i));
				ct++;
				if(ct == 5)
					break;
			}
		}

	}
	
	public static String numAnte(int num) {
		String numeros = "";
		if(num < 0 || num > 10) {
			numeros = "Erro!";
		}else{
			int ct = 0;
			for(int i = num; i > 0; i--) {
				System.out.println(numerosString().get(i - 2));
				ct++;
				if(ct == 5)
					break;
			}
		}
		
		return numeros;
	}
	
	private static List<String> numerosString(){
		List<String> lista = new ArrayList<String>();
		lista.add("Um");
		lista.add("Dois");
		lista.add("Três");
		lista.add("Quatro");
		lista.add("Cinco");
		lista.add("Seis");
		lista.add("Sete");
		lista.add("Oito");
		lista.add("Nove");
		lista.add("Dez");
		return lista;
	}
}
