package com.company;

public class Conta {

    private String titular;
    private int numConta;
    private double saldo;

    public Conta(String titular, int numConta) {
        this.titular = titular;
        this.numConta = numConta;
    }

    public Conta(String titular, int numConta, double depositoInicial) {
        this.titular = titular;
        this.numConta = numConta;
        deposito(depositoInicial);
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public int getNumConta() {
        return numConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void deposito (double quantidade){
        saldo = quantidade;
    }
    public void sacar(double quantidade){
        saldo -= quantidade + 5.0;
    }

    @Override
    public String toString() {
        return " Conta "
                + " titular= "
                + titular
                + '\''
                + ", num Conta = "
                + numConta
                + ", saldo ="
                + String.format("%.2f", saldo);
    }
}



