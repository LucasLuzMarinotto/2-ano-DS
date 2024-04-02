package atividade_exer1;

import java.util.Scanner;

public class produto {
	private String nome;
	private Double precoCusto;
	private Double precoVenda;
	private Double margemLucro;
	
	Scanner let = new Scanner(System.in);
	
	String getNome(){
		System.out.println("Escreva o nome do produto: ");
		nome = let.next();
		return this.nome;
	}
	
	void setNome(String nome) {
		this.nome = nome;
	}
	
	Double getPrecoCusto(){
		System.out.println("Escreva o quanto que o produto custou: ");
		precoCusto = let.nextDouble();
		return this.precoCusto;
	}
	
	void setPrecoCusto(Double precoCusto) {
		this.precoCusto = precoCusto;
	}
	
	Double getPrecoVenda(){
		System.out.println("Escreva o preço de venda: ");
		precoVenda = let.nextDouble();
		return this.precoVenda;
	}
	
	void setPrecoVenda(Double precoVenda) {
		this.precoVenda = precoVenda;
	}
	
	void calcularMargemLucro() {
		margemLucro = precoVenda / precoCusto;
	}
	String getMargemLucro() {
		return "A margem de lucro em porcentagem é: %"+(margemLucro*100);
	}
	
}
