

import java.util.Scanner;

public class App1
{
	public static void main(String[] args) {
			try (//Entrada de dados
		Scanner sc = new Scanner(System.in)) {
			System.out.println("Digite seu nome");
			String nome= sc.nextLine();
			System.out.println("Digite sua Idade:");
			int idade= sc.nextInt();
			System.out.println("Digite sua nota:");
			double nota = sc.nextDouble();
			//imprimir
			System.out.println("Nome......:" + nome);
			System.out.println("Idade.....:" + idade);
			System.out.println("nota......:"+ nota);
		}
		}
	

	}

