
public class Aluno {
	public String nome, matricula, cpf, turma;
	
	public Aluno(String nome, String matricula, String cpf, String turma) {
		this.nome = nome;
		this.matricula = matricula;
		this.cpf = cpf; 
		this.turma = turma;
	}
	
	public void informations() {
		System.out.println("Nome: " + this.nome);
		System.out.println("Matrícula: " + this.matricula);
		System.out.println("CPF: " + this.cpf);
		System.out.println("Turma: " + this.turma);
	}
	
	public void trocaTurma(String novaTurma) {
		this.turma = novaTurma;
	}
	
}
