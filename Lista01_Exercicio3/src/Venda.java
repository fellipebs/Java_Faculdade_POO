import java.util.List;

public class Venda {
	public int codVenda;
	Funcionario func;
	Cliente cli;
	public String DataVenda;
	public double valor;
	public List<Produto> produtos;

	
	public Venda(int codVenda, Funcionario func, Cliente cli, String DataVenda, double valor) {
		this.codVenda = codVenda;
		this.func = func;
		this.cli = cli;
		this.DataVenda = DataVenda;
		this.valor = valor;
		
		cli.decrementarSaldo(this.valor);
	}
	
	
	public void RemoveProduto(int idProduto){

		for(int i = 0; i < produtos.size(); i++){
			if(produtos.get(i).codigoProduto == idProduto) {
				produtos.remove(i);
			}	
			
		}
		
	}
	
	public void AdicionaProduto(Produto prod){
		int aux = produtos.size();
		
		if(aux > 5) {
			System.out.println("Limite maximo atingido!");
		}else{
			produtos.add(prod);
		}
		
	}
	
	public double valorVenda() {
		double aux = 0;
			for(int i = 0; i < produtos.size(); i++) {
				aux += produtos.get(i).preco;
			}
		
			return aux;
	}
}
