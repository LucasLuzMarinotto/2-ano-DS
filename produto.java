package produtoExercicio1;

public class produto {
	
	private String nome;
	private Double precoCusto;
	private Double precoVenda;
	private Double margemLucro;
	
	
	public void getNome(String nome) {
		this.nome = nome;
	}
	String calcularMargemLucro() {
		this.margemLucro = precoVenda - precoCusto;
		return "A margem de lucro do produto, "+nome+" é: "+margemLucro;
	}
}
