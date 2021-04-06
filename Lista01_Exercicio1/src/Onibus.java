
public class Onibus {
	
	public String nomeMotorista;
	public int quilometragem;
	public int velocidade;
	public int pessoasDentro = 0;
	public String placa = "";
	public String nomeOnibus = "";

	
	
	public Onibus(String nomeMotorista, int quilometragem, int velocidade,int pessoasDentro, String placa, String nomeOnibus) {
		this.nomeMotorista = nomeMotorista;
		this.quilometragem = quilometragem;
		this.velocidade = velocidade;
		this.pessoasDentro = pessoasDentro;
		this.placa = placa;
		this.nomeOnibus = nomeOnibus;
	}
	
	
	public void verificaKM() {
		if(this.quilometragem > 200) {
			System.out.println("Onibus com quilometragem acima de 200KM!! Atualmente bloqueado.");
			this.velocidade = 0;
		}else {
			System.out.println("Tudo OK nesse onibus! Rodou até agora: " + this.quilometragem + "km/h");
		}
	}
	
	public void InserePessoa(int numPessoas) {
		if((this.pessoasDentro + numPessoas) > 60) {
			System.out.println("Numero maximo de pessoas (60), atingido!");
		}else{
			this.pessoasDentro += numPessoas; 
			System.out.println("Numero de pessoas dentro desse onibus agora: " + this.pessoasDentro); 
		}
	}
	
	public void removePessoa() {
		if(this.pessoasDentro == 0) {
			System.out.println("Numero minimo de pessoas(0) atingido!");
		}else{
			this.pessoasDentro--;
			System.out.println("Pessoa saiu do onibus, total atual: "+ this.pessoasDentro);
		}
	}
	
	public void trocarMotorista(String NovoMotorista) {
		System.out.println(this.nomeMotorista + ": Saindo do Onibus, ");
		this.nomeMotorista = NovoMotorista;
		System.out.println(this.nomeMotorista + ": Entrou no Onibus!");
	}
}
