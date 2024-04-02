package atividade_exer1;

public class main_encapsulamento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		produto produto1 = new produto();
		produto1.getNome();
		produto1.getPrecoCusto();
		produto1.getPrecoVenda();
		produto1.calcularMargemLucro();
		
		produto1.setPrecoVenda(null);
		
		produto1.getMargemLucro();
		
		
	}

}
