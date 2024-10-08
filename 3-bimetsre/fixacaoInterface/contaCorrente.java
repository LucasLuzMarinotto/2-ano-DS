package atividade;

public class contaCorrente extends contaBancaria{
	private double limite;
	private double saldo;
	
	public contaCorrente(double saldo) {
		super(saldo);
	}
	
	//construtor
	
	public void limite() {
		limite = saldo + 1000;
	}
	
	// get
	
	public double getLimite() {
		return limite;
	}
	
	//set ´
	
	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	// metodo sacar
	
	@Override
	public void sacar (double valor) {
		if(valor <= limite) {
			saldo = saldo - valor;
			System.out.println("Saque feito com sucesso");
				}else {
					System.out.println("Saldo ou Limite insuficiente.");
		}
	}

	@Override
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public double consultarSaldo() {
		return saldo;
	}
	
}

