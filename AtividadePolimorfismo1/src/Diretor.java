
public class Diretor extends Gerente {

	public Diretor() {
		
	}
	
	@Override
	public void exibirMenu() {
		super.exibirMenu();
		System.out.println("5. Gerenciar Financeiro");
		System.out.println("6. Emitir Relat�rio");
		System.out.println("6.1. Emitir Relat�rio por Produto");
		System.out.println("6.2. Emitir Relat�rio por Produto e Cliente");
		System.out.println("6.3. Emitir Relat�rio por Produto e Cliente e Vendedor");
		
		String s = "7";
		
		if(s.equals("6.1")) {
			emitirRelatorio("Pastel");
		}else if(s.equals("6.2")) {
			emitirRelatorio("Pastel", "Maria");
		}else if(s.equals("6.3")) {
			emitirRelatorio("Pastel", "Maria", "Luc�o do pastel");
		}
		
		//scanner
	}
	
	private void gerenciarFinanceiro() {
		
	}
	
	public void emitirRelatorio() {
		System.out.println("Ser� exibido relat�rio gen�rico.");
	}
	
	public void emitirRelatorio(String produto) {
		System.out.println("Ser� exibido relat�rio por produto: " + produto);
	}
	
	public void emitirRelatorio(String produto, String cliente) {
		System.out.println("Ser� exibido relat�rio por produto: " + produto + " e cliente " + cliente);
	}
	
	public void emitirRelatorio(String produto, String cliente, String vendedor) {
		System.out.println("Ser� exibido relat�rio por produto: " + produto + " e cliente " + cliente + " e vendedor: " + vendedor);
	}
	
	
}
