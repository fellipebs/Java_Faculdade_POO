import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		/* Questão 1
		int n;
		System.out.printf("Informe o número: \n");
		n = ler.nextInt();
		
		int prox, ant;
		
		prox = n + 1;
		ant = n - 1;
		
		System.out.println("Anterior: " + ant);
		System.out.println("Proximo: " + prox);
		*/
		
		//Questão 2
		/*
		double n1, n2, n3;
		System.out.printf("Informe o número 1 : \n");
		n1 = ler.nextDouble();
		
		System.out.printf("Informe o número 2 : \n");
		n2 = ler.nextInt();
		
		System.out.printf("Informe o número 3 : \n");
		n3 = ler.nextInt();
		
		double resultado = (n1+n2+n3)/3;
		System.out.println("Média Aritmética: " + resultado);
		*/
		
		//Questão 3
		
		
		// Questão 6
		/*int n;
		System.out.printf("Informe o número: \n");
		n = ler.nextInt();
		if(n > 20) {
			System.out.println("Maior q 20!");
		}
		*/
		
		//Questão 7
		/*
		int n, n2, soma;
		System.out.printf("Informe o número: \n");
		n = ler.nextInt();
		System.out.printf("Informe o número 2: \n");
		n2 = ler.nextInt();
		
		soma = n + n2;
		if(soma > 10)
			System.out.println("Maior q 10!");
		else
			System.out.println("Menor q 10 essa soma...");
		*/
		//Questão 16
		/*
		int i = 0;
		while(i < 51) {
			System.out.println(i);
			i++;
		}
		*/
		//Questão 17
		/*
		int i = 100;
		while(i < 201) {
			System.out.println(i);
			i++;
		}
		*/
		//Questão 25
		/*
		int n;
		System.out.println("Digite o mês!");
		n = ler.nextInt();
		descricaoMes(n);
		*/
		
		//Questão 25
		int value = questao25("0exto".charAt(0));
		System.out.println(value);
	}

	
	public static int questao25(char c) {
		if(Character.isLetter(c)) {
			return 1;
		}else {
			return 0;
		}

	}
	
	public static void descricaoMes(int mes) {
		if(mes == 1)
			System.out.println("Janeiro");
		else if(mes == 2)
			System.out.println("Fevereiro");
		else if(mes == 3)
			System.out.println("Março");
		else if(mes == 4)
			System.out.println("Abril");
		else if(mes == 5)
			System.out.println("Maio");
		else if(mes == 6)
			System.out.println("Junho");
		else if(mes == 7)
			System.out.println("Julho");
		else if(mes == 8)
			System.out.println("Agosto");
		else if(mes == 9)
			System.out.println("Setembro");
		else if(mes == 10)
			System.out.println("Outubro");
		else if(mes == 11)
			System.out.println("Novembro");
		else if(mes == 12)
			System.out.println("Dezembro");
		else
			System.out.println("Mês desconhecido");
			
	}
}
