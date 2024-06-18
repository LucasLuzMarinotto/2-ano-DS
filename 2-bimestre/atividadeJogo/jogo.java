package exercico;

public class jogo {
	private String nome;
	private double preco;
	private String distribuidora;
	
	
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
	
	public String exibirDetalhes() {
		System.out.println("Nome: "+nome);
		System.out.println("Preço: "+preco);
		System.out.println("Distribuidora: "+distribuidora);
		return"";
	}
}
