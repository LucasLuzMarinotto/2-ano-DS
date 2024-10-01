package interface_praticar;

public class professor implements pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String materia;
	
	public professor (String nome, String endereco, String telefone, String materia) {
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.materia = materia;		
	}
	
	
	@Override
	public String getNome() {
		return null;
	}

	@Override
	public void setNome(String nome) {
		
	}

	@Override
	public String getEndereco() {
		return null;
	}

	@Override
	public void setEndereco(String endereco) {
		
	}

	@Override
	public String getTelefone() {
		return null;
	}

	@Override
	public void setTelefone(String telefone) {
		
	}

	@Override
	public void apresentar() {
		
	}

}
