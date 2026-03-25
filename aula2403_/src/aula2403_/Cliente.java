package aula2403_;

public class Cliente {
	private String nomeCliente;
	private int cpfCliente;
	//construtores
	public Cliente() {
	}
	
	public Cliente(String nomeCliente, int cpfCliente) {
		this.nomeCliente = nomeCliente;
		this.cpfCliente = cpfCliente;
	}
	// Getters and setters
	

	public static void main(String[] args) {
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	public int getCpfCliente() {
		return cpfCliente;
	}

	public void setCpfCliente(int cpfCliente) {
		this.cpfCliente = cpfCliente;
	}

}
