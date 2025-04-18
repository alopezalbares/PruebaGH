package org.example;

/**
 * Esta clase define objetos CuentaBancaria para implementar las operaciones básicas de las cuentas bancarias
 * @author Antonio López Albares
 * @version 2
 */
public class CuentaBancaria {

    private double saldo;

    /**
     * @param saldoInicial Valor del saldo con el que se crea la cuenta
     */
    // Primer cambio
    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    /**
     * @param cantidad Importe que se quiere añadir a la cuenta en una operación de depósito
     */
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo = saldo + cantidad; // Se modifica el comentario para nuevo conflicto
        }
    }

    /**
     * @param cantidad Importe que se desea sacar de la cuenta en una retirada de efectivo
     * @return true en caso de que haya saldo suficiente, false en caso de que haya saldo insuficiente
     */
    public boolean retirar(double cantidad) {
        if (cantidad > 0 && saldo >= cantidad) {
            saldo -= cantidad;
            return true;
        }
        return false;
    }

    /**
     * @return Saldo disponible en la cuenta
     */
    public double consultarSaldo() {
        return saldo;
    }
}
