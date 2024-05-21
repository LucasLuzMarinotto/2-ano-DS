package exercicio2;

public class cliente {
	private String nome;
	private String endereco;
	private int idade;
	private double valor_pedido;
	private double valor_promocional;
	
	public void setValor_pedido(double valor_pedido) {
		this.valor_pedido = valor_pedido;
	}
	
	public double getValor_pedido() {
		return this.valor_pedido;
	}
	
	public double calcularDesconto() {
		return 0.10 * valor_pedido;
	}
}
