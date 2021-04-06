import java.util.ArrayList;
import java.util.List;

public class Agenda {

	private final int MAX_PESSOAS = 10;
	private List<Pessoa>  pessoas;
	
	public Agenda() {
		pessoas = new ArrayList<Pessoa>();
	}
	
	public void armazenaPessoa(String nome, int idade, double altura) {
		Pessoa pessoa = new Pessoa();
		pessoa.setNome(nome);
		pessoa.setIdade(idade);
		pessoa.setAltura(altura);
		armazenaPessoa(pessoa);
	}
	
	public void armazenaPessoa(Pessoa pessoa) {
		if (pessoas.size() < MAX_PESSOAS){
			pessoas.add(pessoa);
		}else {
			System.out.println("Agenda lotada...");
		}
	}
	
	public void removePessoa(String nome) {
		for(int i =0; i<pessoas.size(); i++) {
			if(pessoas.get(i).getNome().equals(nome))
				pessoas.remove(i);	
		}

	}
	
	public int buscaPessoa(String nome) {
		for(int i =0; i<pessoas.size(); i++) {
			if(pessoas.get(i).getNome().equals(nome))
				return i+1;
		}
		return -1;
	}
	
	public void imprimeAgenda() {
		for(int i =0; i<pessoas.size(); i++) {
			pessoas.get(i).imprimeDadosPessoa();
		}
	}
	
	public void imprimePessoa(int index) {
		pessoas.get(index).imprimeDadosPessoa();
	}
}
