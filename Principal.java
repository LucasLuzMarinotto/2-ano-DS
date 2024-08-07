package exercicio1;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		Ponto p = new Ponto(2,  3);
		Circulo c = new Circulo (p, 10);
		Cilindro d = new Cilindro(c, 5);
		Quadrado q = new Quadrado(4, 6);
		
		p.mostrar();
		c.mostrar();
		d.mostrar();
		
		
	}

}
