package exercicio_1;

public class veiculo {
	private String marca;
	private String modelo;
	private String cor;
	private int ano;

	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}
	
	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public String getMarca(){
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public 	String getCor() {
		return cor;
	}
	
	public int getAno() {
		return ano;
	}
}
