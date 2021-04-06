import java.util.ArrayList;

public class Carrinho {
	
	ArrayList<Livro> livro = new ArrayList<Livro>(); 
	ArrayList<Mouse> mouse = new ArrayList<Mouse>(); 

	public void adiciona(Livro a) {
		livro.add(a);
	}
	
	public void adiciona(Mouse b) {
		mouse.add(b);
	}
	
	public void verCarrinho() {
		for(int i = 0; i < livro.size(); i++) {
			System.out.println(livro.get(i).getDescricao());
		}
		for(int i = 0; i < mouse.size(); i++) {
			System.out.println(mouse.get(i).getDescricao());
		}
	}
	
}
