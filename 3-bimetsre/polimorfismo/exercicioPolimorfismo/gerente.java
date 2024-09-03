package polimorfismo;

public class gerente extends funcionario{
	
	private int senha;
	
	public int senha() {
		return senha;
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}
		else {
			return false;
		}
	}
	
	@Override
	public double getBonificacao() {
		return super.salario * 0.15;
	}
}
