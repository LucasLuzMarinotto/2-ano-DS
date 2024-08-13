package exercicio1;
import java.util.Scanner;
public class Principal {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		double resposta1,  resposta2;
		
		System.out.println("Qual a coordenada X do ponto?");
		resposta1 = in.nextDouble();
		
		System.out.println("E qual a X?");
		resposta2 = in.nextDouble();
		
		Ponto p = new Ponto(resposta1,  resposta2);
		
		System.out.println("Qual é o raio do circulo?");
		resposta1 = in.nextDouble();
		
		Circulo c = new Circulo (p, resposta1);
		
		System.out.println("Qual a altura do cilindro?");
		resposta1 = in.nextDouble();
		
		Cilindro d = new Cilindro(c, resposta1);
		
		System.out.println("Qual o comprimento do quadrado?");
		resposta1 = in.nextDouble();
		
		System.out.println("Qual a altura do mesmo?");
		resposta2 = in.nextDouble();
		
		Quadrado q = new Quadrado(resposta1, resposta2);
		
		System.out.println("E a altura?");
		resposta2 = in.nextDouble();
		
		Cubo l = new Cubo(q, resposta2);
		
		p.mostrar();
		c.mostrar();
		d.mostrar();
		q.mostrar();
		l.mostrar();
		
		in.close();
	}

}