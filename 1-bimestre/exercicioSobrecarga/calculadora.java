package exercicio1;

public class calculadora {
	
	private String nome;
	private double resultado;	
	private int result;
	
	void setNome(String nom) {
		this.nome = nom;
	}
	
	void soma(int som1, int som2) {
		this.result = som1 + som2;
	}
	
	void soma(double sum1, double sum2) {
		this.resultado = sum1 + sum2; 
	}
	
	void subtracao(int sub1, int sub2) {
		this.result = sub1 - sub2;
	}
	
	void subtracao(double valor1, double valor2) {
		this.resultado = valor1 - valor2;
	}
	
	String getResultado() {
		if(resultado == 0){
			return nome+" "+result;
		}else if(result == 0) {
			return nome+" "+resultado;
		}else {
			return nome+" "+resultado+" "+result;
		}
	}
	
}
