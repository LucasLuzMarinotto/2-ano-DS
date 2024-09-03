package polimorfismo;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		funcionario f1 = new funcionario();
		f1.setNome("Doni");
		f1.setCpf("44444.3333.4");
		f1.setSalario(2500);
		System.out.println(f1.getNome());
		System.out.println(f1.getCpf());
		System.out.println(f1.getSalario());
		
		gerente g1 = new gerente();
		g1.setNome("PEDRO");
		g1.setCpf("32323232");
		g1.setSalario(2500);
		g1.setSenha(2222);
		System.out.println("----------------------------------------");
		System.out.println(g1.getNome());
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		System.out.println(g1.autentica(2222));
		
		coordenador c1 = new coordenador();
		c1.setNome("Coord");
		c1.setCpf("32323232");
		c1.setSalario(3600);
		System.out.println("----------------------------------------");
		System.out.println(c1.getNome());
		System.out.println(c1.getCpf());
		System.out.println(c1.getSalario());
		
		System.out.println("----------------------------------------");
		controleBonificacao control1 = new controleBonificacao();
		
		control1.registra(f1);
		
		control1.registra(g1);
		
		control1.registra(c1);
		
		System.out.println("Gastos com bonificação "+control1.getSoma());
		
	}
}
