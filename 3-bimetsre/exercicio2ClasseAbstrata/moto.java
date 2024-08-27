package exercicio2;

public class moto extends veiculo{
	
	public moto(String modelo, double valorTabela, String cor, String combustivel) {
		super(modelo, valorTabela, cor, combustivel);
	}

	private double ipva;
	private double valorTabela;
	
	@Override
	public void calculaIPVA() {
		this.ipva = this.valorTabela * 0.2;
	}
}