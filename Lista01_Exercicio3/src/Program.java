import java.util.ArrayList;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Cliente c = new Cliente("Cliente 1", 100, "1234", 1050);
		//Cliente tem seu saldo decrementado ao realizar uma compra
		
		
		//Cadastrando 6 produtos
		Produto havaina = new Produto(1, "havaina", 10);
		Produto sapatoNike = new Produto(2, "nike", 100);
		Produto farinha = new Produto(3, "farinha", 5);
		Produto goiabada = new Produto(4, "goiabada", 7);
		Produto fone = new Produto(5, "fone", 300);
		Produto ferrari = new Produto(6, "havaina", 7000000);
		
		//Dando um desconto na ferrari a vida
		
		ferrari.descontoProduto();
		double precoferrari = ferrari.verificaPreco();
		System.out.println(precoferrari);
		
		//Cadastrando 3 funcionario para nossa loja!
		
		Funcionario func1 = new Funcionario(1, "Luke Skywalker", 7000);
		Funcionario func2 = new Funcionario(2, "Kylo Ren", 3000);
		Funcionario func3 = new Funcionario(1, "Han Solo", 15000);
	
		//Testando metodo para aumentar o salario de han!
		
		func3.aumentaSalario();
		double salarioHan = func3.verificaSalario();
		System.out.println(salarioHan);
		
		
		//Criando nossa loja:
		
		Loja lojinha = new Loja();
		lojinha.nome = "Lojinha enterprise";
		lojinha.endereco = "Rua dos bobos número 0";
		lojinha.cnpj = "153.124.00.-000";
		lojinha.tipoLoja = "Produtos variados!";
		lojinha.func = new ArrayList<Funcionario>();
		lojinha.func.add(func1);
		lojinha.func.add(func2);
		lojinha.func.add(func3);
		
		//Verificando os funcionarios
		lojinha.verficarFuncionarios();
		
		Venda v = new Venda(1, func1, c, "31/08/2020", 422);
		
		v.produtos = new ArrayList<Produto>();
		v.produtos.add(havaina);
		v.produtos.add(sapatoNike);
		v.produtos.add(farinha);
		v.produtos.add(goiabada);
		v.produtos.add(fone);
		
		
		System.out.println(v.valorVenda());
		v.RemoveProduto(1);
		
		v.AdicionaProduto(ferrari);
		
		//Valor da venda com a ferrari
		System.out.println(v.valorVenda());
	}

}
