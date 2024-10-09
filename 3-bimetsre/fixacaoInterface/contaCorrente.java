package atividade;

public class contaCorrente extends contaBancaria {
	private double limite;

    public contaCorrente(double saldo) {
        super(saldo);
        this.limite = saldo + 1000; 
    }

    // get
    public double getLimite() {
        return limite;
    }

    // metodo sacar
    
    @Override
    public void sacar(double valor) {
        if (valor <= (getSaldo() + limite - getSaldo())) { 
            setSaldo(getSaldo() - valor);
            System.out.println("Saque feito com sucesso!");
        } else {
            System.out.println("Saldo ou Limite insuficiente.");
        }
    }
}
