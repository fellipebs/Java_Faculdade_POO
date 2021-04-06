import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Carrinho a = new Carrinho();
		
		Livro lv1 = new Livro("Leitura", 10, "Dom quixote", "Alguem");
		Livro lv2 = new Livro("Leitura", 15, "Viagem ao centro da terra", "Alguem2");
		
		Mouse m1 = new Mouse("Leitura",200, "Razer Deathadder", "Gamer");
		Mouse m2 = new Mouse("Leitura", 15, "Multilaser 500 dpi", "Normal");
		
		a.adiciona(lv1);
		a.adiciona(lv2);
		
		a.adiciona(m1);
		a.adiciona(m2);
		
		a.verCarrinho();
	}

}
