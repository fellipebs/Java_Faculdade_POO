import java.util.List;

public class Turma {
	
	public int codTurma;
	public String turno;
	public String periodo;
	public int qtdAluno;
	public int qtdMax;
	public List<Aluno> alunos;
	
	public void definirDados(int codTurma, String turno,  String periodo, int qtdMax) {
		this.codTurma = codTurma;
		this.turno = turno;
		this.periodo = periodo;
		this.qtdMax = qtdMax;
	}
	
	public void definirNumeroAlunos(int qtdAluno) {
		this.qtdAluno = qtdAluno;
	}
	
	
	public boolean verificaQtdMaxima() {
		if(this.qtdAluno >= this.qtdMax) {
			System.out.println("Quantidade máxima atingida!");
			return false;
		}else{
			System.out.println("A turma ainda não está cheia!");
			return true;
		}
	}
	
	public boolean inserirAluno(Aluno a) {
		boolean flag = this.verificaQtdMaxima();
		if(flag == true) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
}
