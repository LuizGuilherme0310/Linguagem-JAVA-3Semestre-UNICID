//lista 8 jadir


public class Conta {
    // Atributos
    public double saldo;
    public String nrAgencia;
    public String titular;
    public String nrConta;
    public int codBanco;

    // 1. Método Construtor
    public Conta(double saldo, String nrAgencia, String titular, String nrConta, int codBanco) {
        this.saldo = saldo;
        this.nrAgencia = nrAgencia;
        this.titular = titular;
        this.nrConta = nrConta;
        this.codBanco = codBanco;
    }

    // 2. Método Saque
    public void saque(double valor) {
        // Verifica se o valor é positivo e se há saldo suficiente
        if (valor > 0 && valor <= this.saldo) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso!");
        } else {
            // Caso o saldo seja insuficiente ou o valor inválido
            System.out.println("Saldo Insuficiente ou valor inválido.");
        }
    }
}

// lista 9 exercicio 2 e 3
//exercicio 2 A
public class Eleitoral {
    // Atributos
    public String nome;
    public int idade;

    // Método Imprimir
    public void imprimir() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade);
        verificar(); // Chama o método verificar como último comando
    }

    // Método Verificar (Lógica de votação)
    public void verificar() {
        if (this.idade < 16) {
            System.out.println("O Eleitor não pode votar");
        } else if (this.idade >= 16 && this.idade <= 65) {
            System.out.println("O Eleitor deve Votar");
        } else {
            System.out.println("Voto facultativo");
        }
    }
}
//Exercicio 2 B
public class PrincipalEleitoral {
    public static void main(String[] args) {
        // Criando o objeto e atribuindo valores
        Eleitoral e1 = new Eleitoral();
        e1.nome = "Luiz Guilherme";
        e1.idade = 20;

        // Executando o método imprimir
        e1.imprimir();
    }
}

//EXERCICIO 3 A
public class Lampada {
    // Atributo
    public boolean status; // true para ligada, false para desligada

    public void ligar() {
        this.status = true;
    }

    public void desligar() {
        this.status = false;
    }

    public String observar() {
        if (this.status) {
            return "Ligada";
        } else {
            return "Desligada";
        }
    }
}

//EXERCICIO 3 B
public class UsaLampada {
    public static void main(String[] args) {
        // Instanciando dois objetos
        Lampada lampada1 = new Lampada();
        Lampada lampada2 = new Lampada();

        // Operações solicitadas
        lampada1.ligar();
        lampada2.desligar();

        // Exibindo o status de cada uma
        System.out.println("Status Lâmpada 1: " + lampada1.observar());
        System.out.println("Status Lâmpada 2: " + lampada2.observar());
    }
}
