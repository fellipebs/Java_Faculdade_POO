import java.util.Scanner;

public class Exercicios {

	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in); 
		/* Quest�o 1
		int n;
		System.out.printf("Informe o n�mero: \n");
		n = ler.nextInt();
		
		int prox, ant;
		
		prox = n + 1;
		ant = n - 1;
		
		System.out.println("Anterior: " + ant);
		System.out.println("Proximo: " + prox);
		*/
		
		//Quest�o 2
		/*
		double n1, n2, n3;
		System.out.printf("Informe o n�mero 1 : \n");
		n1 = ler.nextDouble();
		
		System.out.printf("Informe o n�mero 2 : \n");
		n2 = ler.nextInt();
		
		System.out.printf("Informe o n�mero 3 : \n");
		n3 = ler.nextInt();
		
		double resultado = (n1+n2+n3)/3;
		System.out.println("M�dia Aritm�tica: " + resultado);
		*/
		
		//Quest�o 3
		
		
		// Quest�o 6
		/*int n;
		System.out.printf("Informe o n�mero: \n");
		n = ler.nextInt();
		if(n > 20) {
			System.out.println("Maior q 20!");
		}
		*/
		
		//Quest�o 7
		/*
		int n, n2, soma;
		System.out.printf("Informe o n�mero: \n");
		n = ler.nextInt();
		System.out.printf("Informe o n�mero 2: \n");
		n2 = ler.nextInt();
		
		soma = n + n2;
		if(soma > 10)
			System.out.println("Maior q 10!");
		else
			System.out.println("Menor q 10 essa soma...");
		*/
		//Quest�o 16
		/*
		int i = 0;
		while(i < 51) {
			System.out.println(i);
			i++;
		}
		*/
		//Quest�o 17
		/*
		int i = 100;
		while(i < 201) {
			System.out.println(i);
			i++;
		}
		*/
		//Quest�o 25
		/*
		int n;
		System.out.println("Digite o m�s!");
		n = ler.nextInt();
		descricaoMes(n);
		*/
		
		//Quest�o 25
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
			System.out.println("Mar�o");
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
			System.out.println("M�s desconhecido");
			
	}
}
