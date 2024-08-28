package exercicio2;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		carro carro1 = new carro("Impala 67", 300000 , "preto", "gasolina");
		carro carro2 = new carro("Porsche Spyder" , 1300000 , "Prata" , "Etanol");
		
		moto moto1 = new moto("XRE 2013", 16000 , "Prata" , "Etanol");
		moto moto2 = new moto("FZ15", 22000, "Azul", "Diesel");
		
		moto1.calculaIPVA();
		moto2.calculaIPVA();
		carro1.calculaIPVA();
		carro2.calculaIPVA();
		
		
		System.out.println(carro1.imprimirFicha());
		System.out.println("");
		System.out.println(carro2.imprimirFicha());
		System.out.println("");
		System.out.println(moto1.imprimirFicha());
		System.out.println("");
		System.out.println(moto2.imprimirFicha());
	}

}