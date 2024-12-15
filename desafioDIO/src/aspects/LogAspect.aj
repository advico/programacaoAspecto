// Arquivo LogAspect.aj
package aspects;

import java.time.LocalDateTime;

public aspect LogAspect {
    pointcut saqueInsuficiente(Conta conta, double valor) :
        call(void Conta.sacar(double)) && target(conta) && args(valor);

    after(Conta conta, double valor) : saqueInsuficiente(conta, valor) {
        if (valor > conta.getSaldo()) {
            System.out.println("[LOG ERRO] " + LocalDateTime.now() +
                " - Saldo insuficiente na conta " + conta.getTipoConta() +
                ". Tentativa de saque: R$ " + valor +
                ", Saldo atual: R$ " + conta.getSaldo());
        }
    }
}
