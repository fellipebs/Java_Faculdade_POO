
public class Diretor extends Pessoa{

	private String formacao;
	private String escolasTrabalhadas;
	
	public Diretor(String nome, int idade, String endereco, String formacao, String escolasTrabalhadas) {
		super(nome, idade, endereco);
		// TODO Auto-generated constructor stub
		this.formacao = formacao;
		this.escolasTrabalhadas = escolasTrabalhadas;
	}
	
	public void diretorFaz() {
		System.out.println("O diretor de nome: " + getNome() + " chama a atenção dos alunos!");
	}

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public String getEscolasTrabalhadas() {
		return escolasTrabalhadas;
	}

	public void setEscolasTrabalhadas(String escolasTrabalhadas) {
		this.escolasTrabalhadas = escolasTrabalhadas;
	}
	
	
}
