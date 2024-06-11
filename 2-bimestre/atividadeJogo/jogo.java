package exercicio1;

public class jogo {
	private String nome;
	private double preco;
	private String distribuidora;
	
	// Construtor
	
	public void jogo(String nome, double preco, String distribuidora) {
		this.nome = nome;
		this.preco = preco;
		this.distribuidora = distribuidora;
	}
	
	// método SET
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void setDistribuidora(String distribuidora) {
		this.distribuidora = distribuidora;
	}
	
	// método GET
	
	public String getNome() {
		return this.nome;
	}
	
	public double getPreco() {
		return this.preco;
	}
	
	public String getDistribuidora() {
		return this.distribuidora;
	}
}
