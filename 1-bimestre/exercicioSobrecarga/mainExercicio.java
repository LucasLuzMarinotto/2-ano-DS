package exercicio1;

import java.util.Scanner;

public class mainSobrecarga {

	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		calculadora calc1 = new calculadora();
		calculadora calc2 = new calculadora();
		calculadora calc3 = new calculadora();
		calculadora calc4 = new calculadora();
		
		calc1.soma(2.7, 3.4);
		calc1.setNome("Soma Decimal");
		
		calc2.soma(2, 3);
		calc2.setNome("Soma Inteira");
		
		calc3.subtracao(5.5, 3.5);
		calc3.setNome("Subtração Decimal");
		
		calc4.subtracao(4, 3);
		calc4.setNome("Subtração Inteira");
		
		System.out.println(calc1.getResultado());
		System.out.println(calc2.getResultado());
		System.out.println(calc3.getResultado());
		System.out.println(calc4.getResultado());
		
		in.close();
	}
    
}
