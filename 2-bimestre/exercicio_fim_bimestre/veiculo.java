package exercicio1;

public class veiculo {
	private String modelo;
	private double valorTabela;
	private String cor;
	private String combustivel;
	private double ipva;
	
	public void veiculo(String modelo, double valorTabela, String cor, String combustivel) {
		this.modelo = modelo;
		this.valorTabela = valorTabela;
		this.cor = cor;
		this.combustivel = combustivel;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setValorTabela(double valorTabela) {
		this.valorTabela = valorTabela;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setCombustivel(String combustivel) {
		this.combustivel = combustivel;
	}
	
	public void calculaIPVA() {
		this.ipva = this.valorTabela * 0.5;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public double getValorTabela() {
		return valorTabela;
	}
	
	public String getCor() {
		return cor;
	}
	
	public String combustivel() {
		return combustivel;
	}
	
	public double getIPVA() {
		return ipva;
	}
	
	public String imprimirFicha() {
		return "O modelo do veículo é: "+this.modelo+". O valor de tabela é: "+this.valorTabela+". A cor do veículo é: "+this.cor+". O combustível usado é: "+this.combustivel+". o valor do IPVA é: "+this.ipva;
	}
}
