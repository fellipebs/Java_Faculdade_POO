
public class Produto {

	String nomeloja;
	double preco;
	String descricao;
	
	public Produto(String nomeloja, double preco, String descricao) {
		this.nomeloja = nomeloja;
		this.preco = preco;
		this.descricao = descricao;
	}
	
	public String getNomeloja() {
		return nomeloja;
	}
	public void setNomeloja(String nomeloja) {
		this.nomeloja = nomeloja;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public String getDescricao() {
		return "Produto de informática";
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	
}
