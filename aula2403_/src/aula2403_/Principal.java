package aula2403_;

public class Principal {

	public static void main(String[] args) {
		// chama uma classe >> instanciar a classe
		Pessoas p = new Pessoas();
		// atualizar os dados
		p.setNome("Ana");
		p.setIdade(20);
		//imprimir
		System.out.println("Nome....." +p.getNome());
		System.out.println("Idade....." +p.getIdade());
		
	}

}
