package exercicio1;

public class calculadora {
	
	private String nome;
	private double resultado;
	
	void setNome(String nom) {
		this.nome = nom;
	}
	
	void soma(int valor1, int valor2) {
		this.resultado = valor1 + valor2;
	}
	
	void soma(double valor1, double valor2) {
		this.resultado = valor1 + valor2; 
	}
	
	void subtracao(int valor1, int valor2) {
		this.resultado = valor1 - valor2;
	}
	
	void subtracao(double valor1, double valor2) {
		this.resultado = valor1 - valor2;
	}
	
	String getResultado() {
		return nome+" "+resultado;
	}
	
}
