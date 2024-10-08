package atividade;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		contaBancaria contaB1 = new contaBancaria(1000);
		contaCorrente contaC1 = new contaCorrente(1000);
		contaPoupanca contaP1 = new contaPoupanca(1000);
		
		// Conta Bancaria
		System.out.println("Conta Bancaria");
		
		System.out.println("");
		
		System.out.println("Seu saldo é de: R$"+contaB1.getSaldo());
		
		System.out.println("");
		
		System.out.println("Você está sacando: R$500.0");
		
		System.out.println("");
		
		contaB1.sacar(500);
		
		System.out.println("");
		
		System.out.println("Seu saldo agora é de: R$"+contaB1.consultarSaldo());
		
		System.out.println("");
		
		// Conta Corrente
		
		System.out.println("Conta Corrente");
		
		System.out.println("");
		
		System.out.println("Seu limite é de: R$2000");
		
		contaC1.limite();
		
		System.out.println("Seu saldo é de: R$"+contaC1.getSaldo());
		
		System.out.println("");
		
		System.out.println("Você está sacando: R$500.0");
		
		System.out.println("");
		
		contaC1.sacar(500);
		
		System.out.println("");
		
		System.out.println("Seu saldo agora é de: R$"+contaC1.consultarSaldo());
		
		
	}

}
