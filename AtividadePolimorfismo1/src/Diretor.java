
public class Diretor extends Gerente {

	public Diretor() {
		
	}
	
	@Override
	public void exibirMenu() {
		super.exibirMenu();
		System.out.println("5. Gerenciar Financeiro");
		System.out.println("6. Emitir Relatório");
		System.out.println("6.1. Emitir Relatório por Produto");
		System.out.println("6.2. Emitir Relatório por Produto e Cliente");
		System.out.println("6.3. Emitir Relatório por Produto e Cliente e Vendedor");
		
		String s = "7";
		
		if(s.equals("6.1")) {
			emitirRelatorio("Pastel");
		}else if(s.equals("6.2")) {
			emitirRelatorio("Pastel", "Maria");
		}else if(s.equals("6.3")) {
			emitirRelatorio("Pastel", "Maria", "Lucão do pastel");
		}
		
		//scanner
	}
	
	private void gerenciarFinanceiro() {
		
	}
	
	public void emitirRelatorio() {
		System.out.println("Será exibido relatório genérico.");
	}
	
	public void emitirRelatorio(String produto) {
		System.out.println("Será exibido relatório por produto: " + produto);
	}
	
	public void emitirRelatorio(String produto, String cliente) {
		System.out.println("Será exibido relatório por produto: " + produto + " e cliente " + cliente);
	}
	
	public void emitirRelatorio(String produto, String cliente, String vendedor) {
		System.out.println("Será exibido relatório por produto: " + produto + " e cliente " + cliente + " e vendedor: " + vendedor);
	}
	
	
}
