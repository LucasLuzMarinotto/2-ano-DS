package exercicio1;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	jogoEletronico jogoE1 = new jogoEletronico();
	jogoFisico jogoF1 = new jogoFisico();
	
	jogoE1.jogo("Genshin Impact", 0, "HoyoVerse");
	jogoF1.jogo("Uno", 19.00, "Mattel");
	
	System.out.println(jogoE1.getNome()+jogoE1.getPreco()+jogoE1.getDistribuidora());
	System.out.println(jogoF1.getNome()+jogoF1.getPreco()+jogoF1.getDistribuidora());
	}

}
