public class ContaInvestimento extends Conta {
    public ContaInvestimento(double saldoInicial) {
        super("Investimento", saldoInicial);
    }

    @Override
    public double calculaValorTarifaManutencao() {
        return 10.0; // Tarifa fixa para contas investimento
    }
}
