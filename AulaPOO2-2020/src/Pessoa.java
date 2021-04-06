
public class Pessoa {
	//Atributos
	public String nome;
	private String endereco;
	private int idade;
	private int telefone;
	private String cpf;
	
	//Metodos construtor
	
	public Pessoa(String nome, String endereco, int idade, int telefone, String cpf) {
		this.nome = nome;
		this.endereco = endereco;
		this.idade = idade;
		this.telefone = telefone;
		this.cpf = cpf;
	}
	
	
	// Metodous
	public void falar() {
		// comandos
		System.out.println("A pessoa: "+this.nome+" FALOU!");
	}
	
	public void andar() {
		
	}
	
	public void estudar() {
		
	}
	
	public int fazAniversario() {
		return idade++;
	}
}

//- Animal
//- Computador
//- Veículo