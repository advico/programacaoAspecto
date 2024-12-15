// Classe Main.java
public class Main {
    public static void main(String[] args) {
        Conta poupanca = new ContaPoupanca(100.0);
        Conta investimento = new ContaInvestimento(200.0);

        System.out.println("=== Testando Conta Poupança ===");
        poupanca.sacar(50.0);
        poupanca.sacar(100.0); // Deve gerar log de saldo insuficiente
        poupanca.depositar(20.0);

        System.out.println("\n=== Testando Conta Investimento ===");
        investimento.sacar(50.0);
        investimento.sacar(300.0); // Deve gerar log de saldo insuficiente
        investimento.depositar(100.0);
    }
}
