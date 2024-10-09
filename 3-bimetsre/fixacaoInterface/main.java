package atividade;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Conta Bancaria
        System.out.println("Criando Conta Bancaria...");
        System.out.print("Digite o saldo inicial: R$ ");
        double saldoBancario = scanner.nextDouble();
        
        contaBancaria contaB1 = new contaBancaria(saldoBancario);
        System.out.println("");

        System.out.println("Seu saldo é de: R$" + contaB1.getSaldo());
        System.out.println("");
        

        System.out.print("Digite o valor para saque: R$ ");
        double saqueBancario = scanner.nextDouble();
        
        contaB1.sacar(saqueBancario);
        System.out.println("");

        System.out.println("Seu saldo agora é de: R$" + contaB1.consultarSaldo());
        
        System.out.println("");

        // Conta Corrente
        System.out.println("Criando Conta Corrente...");
        System.out.print("Digite o saldo inicial: R$ ");
        double saldoCorrente = scanner.nextDouble();
        contaCorrente contaC1 = new contaCorrente(saldoCorrente);
        
        System.out.println("");

        System.out.println("Seu saldo é de: R$" + contaC1.getSaldo());
        
        System.out.println("");

        System.out.print("Digite o valor para saque: R$ ");
        double saqueCorrente = scanner.nextDouble();
        contaC1.sacar(saqueCorrente);
        
        System.out.println("");

        System.out.println("Seu saldo agora é de: R$" + contaC1.consultarSaldo());
        System.out.println("");
        System.out.println("Seu saldo (incluindo limite) é de: R$" + (contaC1.consultarSaldo() + contaC1.getLimite()));
        
        System.out.println("");

        // Conta Poupança
        System.out.println("Criando Conta Poupança...");
        System.out.print("Digite o saldo inicial: R$ ");
        double saldoPoupanca = scanner.nextDouble();
        contaPoupanca contaP1 = new contaPoupanca(saldoPoupanca);
        
        System.out.println("");

        System.out.println("Seu saldo é de: R$" + contaP1.getSaldo());
        System.out.println("");

        System.out.print("Digite o valor para rendimento (taxa em %): ");
        
        double taxa = scanner.nextDouble();
        contaP1.rendimentoValor(taxa);
        System.out.println("");

        System.out.println("Seu saldo após rendimento é de: R$" + contaP1.consultarSaldo());
        
        System.out.println("");
        System.out.println("");
        
        scanner.close();
    }
}
