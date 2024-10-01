package atividade;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		aluno aluno1 = new aluno("Rafael", "(11) 99999-2222", "Rua 10", "2344");
		aluno1.apresentar();
		
		System.out.println("");
		
		professor professor1 = new professor("Thayani", "(11) 98888-2222", "Rua 3", "TPA");
		professor1.apresentar();
		
		System.out.println("");
		
		// Interface não tem construtor e não pode ser instanciado. Por exemplo:
		// "pessoa pessoa1 = new pessoa();" este comando não funciona.
		
		pessoa pessoa1 = new professor("Thayani", "(11) 98888-2222", "Rua 3", "TPA");
		pessoa1.apresentar();
		
		System.out.println("");
		
		pessoa1 = new aluno("Rafael", "(11) 99999-2222", "Rua 10", "2344");
		pessoa1.apresentar();
	}

}