package com.wagner;

public class ContaCorrente extends Conta {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirSaldo() {
        System.out.println("=== Extrato Conta Corrente ===");
        super.imprimirInfosComuns();
    }

}
