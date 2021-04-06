
public class MotorEletrico extends Equipamento{

	String tempoCarregamento;
	public MotorEletrico(int serial, int idade, String nome, double peso, String tempoCarregamento) {
		super(serial, idade, nome, peso);
		// TODO Auto-generated constructor stub
		this.tempoCarregamento = tempoCarregamento;
	}
	public String getTempoCarregamento() {
		return tempoCarregamento;
	}
	public void setTempoCarregamento(String tempoCarregamento) {
		this.tempoCarregamento = tempoCarregamento;
	}

	public void motorEletricoFaz() {
		System.out.println("O motor elétrico é muito eficiente porém demora " + getTempoCarregamento() + " para carregar!");
	}
}
