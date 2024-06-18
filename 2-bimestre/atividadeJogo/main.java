package exercico;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		jogoEletronico jogoE1 = new jogoEletronico();
		jogoEletronico jogoE2 = new jogoEletronico();
		jogoFisico jogoF1 = new jogoFisico();
		jogoFisico jogoF2 = new jogoFisico();
		
		jogoE1.setNome("Genshin Impact");
		jogoE1.setPreco(0);
		jogoE1.setDistribuidora("HoyoVerse");
		jogoE1.setPlataforma("pc/ps5/mobile");
		jogoE1.setGenero("RPG");
		
		jogoE2.setNome("God of War III");
		jogoE2.setPreco(89.99);
		jogoE2.setDistribuidora("Santa Monica");
		jogoE2.setPlataforma("PS3/PS4/PS5");
		jogoE2.setGenero("Ação");
		
		jogoF1.setNome("Dama");
		jogoF1.setPreco(35.00);
		jogoF1.setQuantJogadores(2);
		jogoF1.setTempoPartida(15);
		
		jogoF2.setNome("Uno");
		jogoF2.setPreco(25.00);
		jogoF2.setDistribuidora("Mattel");
		jogoF2.setQuantJogadores(4);
		jogoF2.setTempoPartida(10);
		
		System.out.println(jogoE1.exibirDetalhes());
		System.out.println(jogoE1.jogarOnline(4));
		System.out.println("");
		System.out.println(jogoE2.exibirDetalhes());
		System.out.println(jogoE2.jogarOnline(2));
		System.out.println("");
		System.out.println(jogoF1.exibirDetalhes());
		System.out.println("");
		System.out.println(jogoF2.exibirDetalhes());
	}

}
