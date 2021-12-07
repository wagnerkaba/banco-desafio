package com.wagner;

public class ContaPoupanca extends Conta {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("=== Extrato Conta Poupan�a ===");
        super.imprimirInfosComuns();
    }
}
