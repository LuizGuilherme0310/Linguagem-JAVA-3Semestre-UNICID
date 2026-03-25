package aula2403_;

public class Agencia {
	//atributos
	private String nrAgencia;
	private int codBanco;
	// construtores 
	public Agencia() {
	}
	public Agencia(String nrAgencia, int codBanco) {
		this.nrAgencia = nrAgencia;
		this.codBanco = codBanco;
	}
	// getters e setters
	public String getNrAgencia() {
		return nrAgencia;
	}
	public void setNrAgencia(String nrAgencia) {
		this.nrAgencia = nrAgencia;
	}
	public int getCodBanco() {
		return codBanco;
	}
	public void setCodBanco(int codBanco) {
		this.codBanco = codBanco;
	}
	
	
	}

}
