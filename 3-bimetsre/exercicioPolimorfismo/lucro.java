package exercicio1;

public class lucro {
	private double soma;
	
	public void registraConta(conta c) {
		double lucro = c.getSaldo();
		this.soma = this.soma + lucro;
	}
	
	public double getSoma() {
		return soma;
	}
}
