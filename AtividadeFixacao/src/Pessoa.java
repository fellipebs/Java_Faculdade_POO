
public class Pessoa {
	
	private String nome;
	private String dataNascimento;
	private int idade;
	private double altura;
	
	public Pessoa() {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}
	
	
	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void imprimeDadosPessoa() {
		System.out.println("Nome: " + this.nome + "\n altura: " + this.altura + "\n nascimento: " + this.dataNascimento);
	}

	public void coverteIdade() {
		String[] datasArray = new String[3];
		
		datasArray = this.dataNascimento.split("/");
		
		int dia = Integer.parseInt(datasArray[0]);
		int mes = Integer.parseInt(datasArray[1]);
		int ano = Integer.parseInt(datasArray[2]);
		Utils.calculaIdade(dia, mes, ano);
		
	}
}
