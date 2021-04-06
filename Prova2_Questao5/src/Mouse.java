
public class Mouse extends Produto{
	
	String tipo;
	
	public Mouse(String nomeloja, double preco, String descricao, String tipo) {
		super(nomeloja, preco, descricao);
		// TODO Auto-generated constructor stub
		this.tipo = tipo;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Override
	public String getDescricao() {
		return "Tipo: " + this.tipo + " Descricao: " + descricao;
	}
	

}
