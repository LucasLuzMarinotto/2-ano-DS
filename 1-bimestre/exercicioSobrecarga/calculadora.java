package exercicio1;

public class calculadora {
	
	private String nome;
	private double resultado;
	
	void soma(int valor1, int valor2) {
		this.resultado = valor1 + valor2;
	}
	
	void soma(double valor1, double valor2) {
		this.resultado = valor1 + valor2; 
	}
	
	double getResultado() {
		return resultado;
	}
	
}
