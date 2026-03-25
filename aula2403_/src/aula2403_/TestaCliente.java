package aula2403_;

public class TestaCliente {
	
	public static void main(String[] args) {
	Cliente a = new Cliente("FULANO",234232323);
	
	//imprimir
			System.out.println("-------------");
			System.out.println("Nome Cliente : " + a.getNomeCliente());
			System.out.println("CPF :" +a.getCpfCliente());
			System.out.println("-------------");
	}

}
