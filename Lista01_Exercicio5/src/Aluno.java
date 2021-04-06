
public class Aluno {
	public String nome, matricula;
	public double notaMat, notaPort, notaCienc;
	Turma t;
	
	public Aluno(String nome, String matricula) {
		this.nome = nome;
		this.matricula = matricula;
	}
	
	public void lancarNotaMat(double notaMat ) {
		
		if(notaMat > 100) {
			System.out.println("Nota de matem�tica est� errada, deve ser menos que 100!");
		}else{
			this.notaMat = notaMat; 
		}
		
	}
	
	public void lancarNotaPort( double notaPort) {
		if(notaPort > 100) {
			System.out.println("Nota de portugu�s est� errada, deve ser menos que 100!");
		}else{
			this.notaPort = notaPort; 
		}
	}
	
	public void lancarNotaCienc(double notaCienc) {
		if(notaCienc > 100) {
			System.out.println("Nota de ci�ncias est� errada, deve ser menos que 100!");
		}else{
			this.notaCienc = notaCienc; 
		}
	}
	
	
	public void trocarTurma(Turma turma1, Turma turma2, Aluno a){
		if(turma1.verificaQtdMaxima() == true && turma2.verificaQtdMaxima() == true) {
				turma1.alunos.remove(a);
				turma2.alunos.add(a);
			}

		}
	}
	

