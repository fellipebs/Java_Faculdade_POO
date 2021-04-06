import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Escola a = new Escola("Escolinha", "Rua", "1234-4", 10, 9999);
		a.admitirFuncionario();
		a.demitirFuncionario();
		a.dados();
		
		
		Turma t1 = new Turma();
		t1.definirDados(1, "Tarde", "Segundo Ano", 50);
		t1.definirNumeroAlunos(49);
		
		Turma t2 = new Turma();
		t2.definirDados(2, "Manhã", "Segundo Ano", 50);
		t2.definirNumeroAlunos(40);
		
		if(t2.verificaQtdMaxima() == true) {
			System.out.println("Turma "+t2.codTurma+" ainda não está cheia");
		}else {
			System.out.println("Turma "+t2.codTurma+" está cheia");
		}
		
		a.turmas = new ArrayList<Turma>();
		a.turmas.add(t1);
		a.turmas.add(t2);
		
		Aluno alberto = new Aluno("Albertim", "123");
		Aluno vanessa = new Aluno("Vanessa", "124");
		Aluno tulio = new Aluno("Tulio", "125");
		
		boolean aux = t1.inserirAluno(tulio);
		t1.alunos = new ArrayList<Aluno>();
		if(aux == true) {
			t1.alunos.add(tulio);
		}
		
		
		boolean aux2 = t2.inserirAluno(vanessa);
		t2.alunos = new ArrayList<Aluno>();
		if(aux2 == true) {
			t2.alunos.add(vanessa);
		}
		
		
		vanessa.trocarTurma(t2, t1, vanessa);
		
	}

}
