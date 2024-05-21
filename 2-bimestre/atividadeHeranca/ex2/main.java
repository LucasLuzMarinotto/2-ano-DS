package exercicio2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		cliente cliente1 = new cliente();
		clientePremium clienteP1 = new clientePremium();
		
		cliente1.setValor_pedido(2000);
		clienteP1.setValor_pedido(2000);
		
		System.out.println("O valor do desconto para o cliente normal é:"+cliente1.calcularDesconto());
		System.out.println("O valor do desconto para o cliente premium é:"+clienteP1.calcularDesconto());
	}

}
