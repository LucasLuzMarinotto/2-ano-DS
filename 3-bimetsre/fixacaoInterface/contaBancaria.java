CLASSE CONTABANCARIA

package atividade;

public class contaBancaria implements conta {
	private double saldo;
	
	// construtor
	
	public contaBancaria(double saldo) {
		this.saldo = saldo;
	}
	
	//get
	public double getSaldo() {
		return saldo;
	}
	
	//set
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	//metodo depositar
	
	public void depositar (double valor ) {
		saldo = saldo + valor;
	}
	
	//metodo sacar
	
	public void sacar (double valor) {
		if(valor <= saldo) {
			saldo = saldo - valor;
			System.out.println("Saque feito com sucesso!");
		}else {
			System.out.println("Não há saldo suficiente disponivel...");
		}
	}
	
	//metodo consultar saldo

	@Override
	public double consultarSaldo() {
		return saldo;
	}
}
