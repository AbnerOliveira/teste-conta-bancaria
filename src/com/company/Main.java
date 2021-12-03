package com.company;

import java.util.Locale;
import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        final Locale us = Locale.US;
        Scanner sc = new Scanner(System.in);
        Conta conta;
        
        System.out.println(" Digite o número da conta: ");
         int numConta = sc.nextInt();

        System.out.println(" Insira o titular da conta: ");
        sc.nextLine();
        String titular = sc.nextLine();

        System.out.println(" Existe um depósito inicial (s / n)?: ");
        char resposta = sc.next().charAt(0);
        if (resposta == 's' ){
            System.out.println("Inserir valor do deposito inicial: ");
            double depositoInicial = sc.nextDouble();
            conta = new Conta(titular,numConta,depositoInicial);
        }
        else {
            conta = new Conta(titular,numConta);
        }
        System.out.println();
        System.out.println("Dados da conta:");
        System.out.println(conta);

        System.out.println();
        System.out.println(" Digite um valor de depósito: ");
        double depositoInicial = sc.nextDouble();
        conta.deposito(depositoInicial);
        System.out.println(" Dados atualizados da conta:: ");
        System.out.println(conta);

        System.out.println();
        System.out.println(" Insira um valor de retirada: ");
        double sacar = sc.nextDouble();
        conta.deposito(depositoInicial - sacar);
        System.out.println(" Dados atualizados da conta: ");
        System.out.println(conta);

        sc.close();

    }
}
