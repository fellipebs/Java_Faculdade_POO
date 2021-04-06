
public abstract class Veiculo {
	protected boolean ligado;
	protected double speed;
	public abstract void ligar();
	public abstract void acelerar(double velocidade);
	public abstract void parar();
}
