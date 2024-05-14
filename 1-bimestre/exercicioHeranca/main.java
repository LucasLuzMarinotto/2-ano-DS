package exercicio_1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		moto moto1 = new moto();
		carro carro1 = new carro();
		
		//moto
		
		moto1.setModelo("CB-500F");
		moto1.setMarca("Honda");
		moto1.setCor("Preto");
		moto1.setAno(2014);
		moto1.setCilindrada("471 cc");
		
		// carro
		
		carro1.setModelo("Chevy impala 67");
		carro1.setMarca("Chevrolet");
		carro1.setCor("Preto Brilhante");
		carro1.setAno(1965);
		carro1.setPortas(2);
		
	    //informações da moto
		
		System.out.println("Informações da Moto:" + moto1.getModelo());
		System.out.println("Modelo: " + moto1.getModelo());
		System.out.println("Marca: " + moto1.getMarca());
		System.out.println("Cor: " + moto1.getCor());
		System.out.println("Ano: " + moto1.getAno());
		System.out.println("Cilindro: " + moto1.getCilindrada());
		
		System.out.println(" ");
		
		//informações do carro
		
		System.out.println("Informações do Carro: " + carro1.getModelo());
		System.out.println("Modelo: " + carro1.getModelo());
		System.out.println("Marca: " + carro1.getMarca());
		System.out.println("Cor: " + carro1.getCor());
		System.out.println("Ano: " + carro1.getAno());
		System.out.println("Portas: " + carro1.getPortas());
		
	}

}
