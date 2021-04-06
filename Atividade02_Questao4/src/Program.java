
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AlunoPrimario joao = new AlunoPrimario("Joao", 10, "Rua", "1234", 5);
		joao.alunoPrimario();
		
		AlunoSuperior maria = new AlunoSuperior("Maria", 22, "Rua", "12324", 3);
		maria.alunoSuperior();
		
		ProfessorPrimario carlos = new ProfessorPrimario("Carlim", 27, "Rua 123", 3000.00, "Formado na PUC");
		carlos.professorPrimario();
		
		ProfessorSuperior mariazinha = new ProfessorSuperior("Mariazinha", 43, "Rua 123", 7000.00, "Formada na PUC");
		mariazinha.professorSuperior();
		
		CordenadorProfessor tulio = new CordenadorProfessor("Túlio", 49, "Rua", 4370.00, "Formado em Gestão de Pessoas");
		tulio.cordenadorFaz();
		
		CordenadorDiretor daniel = new CordenadorDiretor("Daniel", 49, "Rua", "Formado em Gestão de Pessoas", "CNSD");
		daniel.diretorFaz();
		
	}

}
