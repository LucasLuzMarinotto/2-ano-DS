package exercicio1;
import java.util.Scanner;
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner (System.in);
		
		String modelo, cor, combustivel, resposta;
		double valorTabela;
		
		carro carro1 = new carro();
		carro carro2 = new carro();
		
		moto moto1 = new moto();
		moto moto2 = new moto();
		
		System.out.println("Escreva o modelo do carro 1:");
		modelo = in.next();
		
		System.out.println("Escreva a cor do carro 1:");
		cor = in.next();
		
		System.out.println("Escreva o tipo de combustível do carro 1:");
		combustivel = in.next();
		
		System.out.println("Escreva o valor de tabela do carro 1:");
		valorTabela = in.nextDouble();
		
		carro1.veiculo(modelo, valorTabela, cor, combustivel);
		
		System.out.println("Escreva o modelo do carro 2:");
		modelo = in.next();
		
		System.out.println("Escreva a cor do carro 2:");
		cor = in.next();
		
		System.out.println("Escreva o tipo de combustível do carro 2:");
		combustivel = in.next();
		
		System.out.println("Escreva o valor de tabela do carro 2:");
		valorTabela = in.nextDouble();
		
		carro2.veiculo(modelo, valorTabela, cor, combustivel);
		
		System.out.println("Escreva o modelo da moto 1:");
		modelo = in.next();
		
		System.out.println("Escreva a cor da moto 1:");
		cor = in.next();
		
		System.out.println("Escreva o tipo de combustível da moto 1:");
		combustivel = in.next();
		
		System.out.println("Escreva o valor de tabela da moto 1:");
		valorTabela = in.nextDouble();
		
		moto1.veiculo(modelo, valorTabela, cor, combustivel);
		
		System.out.println("Escreva o modelo da moto 2:");
		modelo = in.next();
		
		System.out.println("Escreva a cor da moto 2:");
		cor = in.next();
		
		System.out.println("Escreva o tipo de combustível da moto 2:");
		combustivel = in.next();
		
		System.out.println("Escreva o valor de tabela da moto 2:");
		valorTabela = in.nextDouble();
		
		moto2.veiculo(modelo, valorTabela, cor, combustivel);
		
		carro1.calculaIPVA();
		carro2.calculaIPVA();
		moto1.calculaIPVA();
		moto2.calculaIPVA();
		
		System.out.println("Deseja ver a informação de algum veículo?");
		resposta = in.next();
		if(resposta.equalsIgnoreCase("sim")) {
			System.out.println("Das motos ou dos carros?");
			resposta = in.next();
			if(resposta.equalsIgnoreCase("motos")) {
				moto1.imprimirFicha();
				moto2.imprimirFicha();
			}else {
				carro1.imprimirFicha();
				carro2.imprimirFicha();
			}
		}
		
		in.close();
	}
}
