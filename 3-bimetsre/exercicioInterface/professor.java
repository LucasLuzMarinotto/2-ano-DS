package atividade;

public class professor implements pessoa {

	private String nome;
	private String endereco;
	private String telefone;
	private String materia;
	
	public professor (String nome, String endereco, String telefone, String materia) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.materia = materia;		
	}
	
	
	@Override
	public String getNome() {
		return nome;
	}

	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String getEndereco() {
		return endereco;
	}

	@Override
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	@Override
	public String getTelefone() {
		return telefone;
	}

	@Override
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setMateria(String materia) {
		this.materia = materia;
	}
	
	public String getMateria() {
		return materia;
	}

	@Override
	public void apresentar() {
		System.out.println("O nome do professor é: "+this.getNome());
		System.out.println("O telefone do professor é: "+this.getTelefone());
		System.out.println("O endereço do professor é: "+this.getEndereco());
		System.out.println("A matéria ensinada pelo professor é: "+this.getMateria());
	}
}