package exercicio1;

public class Cubo {

	private double altura;
	private Quadrado base;
	
	public Cubo(Quadrado q, double h) {
		altura = h;
		base = q;
	}
	
	public String forma() {
		return "Quadrado: Base = "+base.forma()+"; Altura = "+altura;
	}
	
	public void mostrar() {
		System.out.println(forma());
	}
}
