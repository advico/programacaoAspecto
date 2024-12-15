// Classe Conta.java
public abstract class Conta {
    private String tipoConta;
    private double saldo;

    public Conta(String tipoConta, double saldoInicial) {
        this.tipoConta = tipoConta;
        this.saldo = saldoInicial;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Valor de depósito inválido!");
        }
    }

    public void sacar(double valor) {
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        } else {
            System.out.println("Saldo insuficiente ou valor inválido!");
        }
    }

    public abstract double calculaValorTarifaManutencao();
}
