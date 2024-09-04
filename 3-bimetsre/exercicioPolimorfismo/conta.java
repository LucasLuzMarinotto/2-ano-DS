package exercicio1;

public class conta {
	
	private String nome;
	private String cpf;
	private String numeroConta;
	private double saldo;
	
	public double getSaldo() {
		return this.saldo;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String getCpf() {
		return this.cpf;
	}
	
	public String getNumeroConta() {
		return this.numeroConta;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setNumeroConta(String numeroConta) {
		this.numeroConta = numeroConta;
	}
	
	public void depositar(double quantia) {
		this.saldo = this.saldo + quantia;
	}
	
	public void sacar(double quantia) {
		this.saldo = this.saldo - quantia;
	}
	
	public String imprimirSaldo() {
		return "O saldo da conta é: R$"+saldo;
	}
}
