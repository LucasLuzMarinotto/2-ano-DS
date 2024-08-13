package exercicio1;

public class Quadrado extends FormaGeometrica {

	private double altura;
	private double comprimento;
	
	public Quadrado(double a, double c) {
		altura = a;
		comprimento = c;
	}
	
	public String forma() {
		return "Quadrado: Comprimento = "+comprimento+"; Altura = "+altura;
	}
	
	public void mostrar() {
		System.out.println(forma());
	}
}