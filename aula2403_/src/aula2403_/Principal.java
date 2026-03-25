package aula2403_;

public class Principal {

	public static void main(String[] args) {
		// chama uma classe >> instanciar a classe
		Pessoas p1 = new Pessoas();
		Pessoas p2 = new Pessoas (30, "Ana");
		// atualizar os dados
		
		//imprimir
		System.out.println("Nome....." +p1.getNome());
		System.out.println("Idade;....." +p1.getIdade());
		
		System.out.println("Nome....." +p2.getNome());
		System.out.println("Idade;....." +p2.getIdade());
	}

}
