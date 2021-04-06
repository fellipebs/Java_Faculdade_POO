
public class Catiorro extends AnimalImpl implements Animal{

	public Catiorro(String nome, String especie) {
		super(nome, especie);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void fazBarulho() {
		System.out.println("au");
	}

}
