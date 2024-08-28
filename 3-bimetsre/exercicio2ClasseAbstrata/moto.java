package exercicio2;


public class moto extends veiculo{


	private double valorTabela;
	
	public moto(String modelo, double valorTabela, String cor, String combustivel) {
		super(modelo, valorTabela, cor, combustivel);
	}
	
	@Override
	public void calculaIPVA() {
		super.ipva= this.getValorTabela() * 2/100;
	}
}