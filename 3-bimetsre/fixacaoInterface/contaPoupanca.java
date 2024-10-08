package atividade;

public class contaPoupanca extends contaBancaria{
	private double saldo;
	
	public contaPoupanca(double saldo) {
		super(saldo);
	}

	@Override
	public double consultarSaldo() {
		return saldo;
	}
	
	public double rendimentoValor(double taxa) {
		double rendimento = saldo * (taxa / 100);
		saldo = saldo + rendimento;
		return saldo;
	}
	
}
