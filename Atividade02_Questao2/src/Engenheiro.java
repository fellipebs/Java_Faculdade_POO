
public class Engenheiro extends Funcionario{

	private String materialEngenharia;
	private String crea;
	
	public Engenheiro(String nome, String matricula, String cpf, String departamento, String empresa, double salario, int nivelCargo, String materialEngenharia, String crea) {
		super(nome, matricula, cpf, departamento, empresa, salario, nivelCargo);
		this.materialEngenharia = materialEngenharia;
		this.crea = crea;
	}
	
	
	
	public void realizaCalculoEngenharia() {
		System.out.println("O engenheiro " + getNome() + " calcula utilizando o material: " + materialEngenharia);
	}


	public String getMaterialEngenharia() {
		return materialEngenharia;
	}


	public void setMaterialEngenharia(String materialEngenharia) {
		this.materialEngenharia = materialEngenharia;
	}



	public String getCrea() {
		return crea;
	}


	public void setCrea(String crea) {
		this.crea = crea;
	}
	
	
}


