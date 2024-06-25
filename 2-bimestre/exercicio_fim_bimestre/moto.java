package exercicio1;

public class moto extends veiculo{
	private double ipva;
	private double valorTabela;
	
	@Override
	public void calculaIPVA() {
		this.ipva = this.valorTabela * 0.2;
	}
}
