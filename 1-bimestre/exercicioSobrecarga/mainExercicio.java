package exercicio1;

import java.util.Scanner;

public class mainExercicio {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		calculadora calc1 = new calculadora();
		
		calc1.soma(2.7, 3.4);
		
		System.out.println(calc1.getResultado());
		
		in.close();
	}
    
}
