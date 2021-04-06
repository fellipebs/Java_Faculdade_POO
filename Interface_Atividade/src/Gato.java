
public class Gato extends AnimalImpl implements Animal{

	public Gato(String nome, String especie) {
		super(nome, especie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fazBarulho() {
		System.out.println("miao");
		
	}

}
