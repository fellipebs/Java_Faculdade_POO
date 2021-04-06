
public abstract class FactoryMethod {

	public String nome;
	public String tipoarquivo;

}

class PDF extends FactoryMethod {

	public PDF(String nome) {
		this.nome = nome;
		System.out.println("Isso é um pdf - " + this.nome);
	}
}

class Xlsx extends FactoryMethod {

	public Xlsx(String nome) {
		this.nome = nome;
		System.out.println("Isso é um excel - " + this.nome);
	}

}


class FactoryPessoa {

	public FactoryMethod getPessoa(String nome, String sexo) {
		if (sexo.equals("pdf"))
			return new PDF(nome);
		if (sexo.equals("xlsx"))
			return new Xlsx(nome);
		return null;
	}

}
