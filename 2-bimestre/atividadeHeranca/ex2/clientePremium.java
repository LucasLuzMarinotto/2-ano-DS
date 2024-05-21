package exercicio2;

public class clientePremium extends cliente{
	
	@Override
	public double calcularDesconto() {
		return 0.15 * super.getValor_pedido();
	}
}
