package atividade;

public class aluno implements pessoa{
	
	private String nome;
	private String telefone;
	private String endereco;
	private String matricula;
	
	public aluno(String nome, String telefone, String endereco, String matricula) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
		this.matricula = matricula;
	}
	
	@Override
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	@Override
	public String getEndereco() {
		return this.endereco;
	}
	
	@Override
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	@Override
	public String getTelefone() {
		return this.telefone;
	}
	
	@Override
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	public String getMatricula() {
		return this.matricula;
	}
	
	@Override
	public void apresentar() {
		System.out.println("O nome do aluno �: "+this.getNome());
		System.out.println("O telefone do aluno �: "+this.getTelefone());
		System.out.println("O endere�o do aluno �: "+this.getEndereco());
		System.out.println("O n�mero da matr�cula do aluno �: "+this.getMatricula());
	}
	
	
}
