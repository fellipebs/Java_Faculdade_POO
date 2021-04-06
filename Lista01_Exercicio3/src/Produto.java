
public class Produto {

	public int codigoProduto;
	public String descricao;
	public double preco;
	
	public Produto(int codigoProduto, String descricao, double preco) {
		this.codigoProduto = codigoProduto;
		this.descricao = descricao;
		this.preco = preco;
	}
	
	public void descontoProduto() {
		preco = preco * 0.90;
		System.out.println("Novo preço desse produto é: "+preco);
	}
	
	public double verificaPreco() {
		return this.preco;
	}
}
