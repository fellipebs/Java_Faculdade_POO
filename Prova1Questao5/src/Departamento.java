
public class Departamento {
	public int idDepartamento;
	public String nome;
	
	public void mostrarDepartamento() {
		System.out.println("Nome: " + this.nome);
	}
	
	public Departamento(int idDepartamento, String nome) {
		this.idDepartamento = idDepartamento;
		this.nome = nome;
	}
}
