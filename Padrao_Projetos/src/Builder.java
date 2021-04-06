abstract class Builder {
 	public void mostraCaracter(char c) {
 		// vazio
 	}

 	public void mostraNumero(int n) {
 		// vazio
 	}

 }

 class Mostraletra extends Builder {
 	public void mostraCaracter(char c) {
 		System.out.print("Caractere:" + c);
 	}

 	public void mostraNumero(int n) {
 		System.out.print("Número:" + n);
 	}

 	public static void main(String[] args) {

 		Builder conversor;
 		conversor = new Mostraletra();
 		conversor.mostraCaracter('a');
 		conversor = new Mostranum();
 		conversor.mostraNumero(1);
 	
 	}
 	
 	
 }

 class Mostranum extends Builder {
	 public void mostraCaracter(char c) {
	 	System.out.print("Caractere:" + c);
	 }

	 public void converterParagrafo(int n) {
	 	System.out.print("Número:" + n);
	 }
 }


 
 
