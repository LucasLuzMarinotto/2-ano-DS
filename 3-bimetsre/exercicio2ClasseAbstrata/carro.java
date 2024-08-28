package exercicio2;

public class carro extends veiculo{
	
	public carro(String modelo, double valorTabela, String cor, String combustivel) {
		super(modelo, valorTabela, cor, combustivel);
	}
	
	@Override
	public void calculaIPVA() {
		super.ipva = this.getValorTabela() * 4/100;
	}
}
