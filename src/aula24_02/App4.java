package aula24_02;

import java.util.Scanner; 

	public class App4 {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Digite seu nome...");
			String nome = sc.next();
			System.out.println("digite sua idade...");
			int idade = sc.nextInt();
			System.out.println("Digite sua nota...");
			double nota = sc.nextDouble();
			
			System.out.println(nome);
			System.out.println(idade);
			System.out.println(nota);
		}
}
	
	
