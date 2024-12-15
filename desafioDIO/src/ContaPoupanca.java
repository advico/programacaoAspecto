// Classe ContaPoupanca.java
public class ContaPoupanca extends Conta {
    public ContaPoupanca(double saldoInicial) {
        super("Poupança", saldoInicial);
    }

    @Override
    public double calculaValorTarifaManutencao() {
        return 5.0; // Tarifa fixa para contas poupança
    }
}
