
public class Livro extends Produto{

	String autor;
	
	public Livro(String nomeloja, double preco, String descricao, String autor) {
		super(nomeloja, preco, descricao);
		// TODO Auto-generated constructor stub
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	@Override
	public String getDescricao() {
		return "Autor: " + this.autor + " Descricao: " + descricao;
	}
}
