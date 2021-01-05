package alocacao.estatica;

import java.util.Scanner;

public class Produtos {
	private int cod;
	private String descri;
	private double custo, venda;
	
	
	public Produtos(int cod, String descri, double custo, double venda) {
		this.cod = cod;
		this.descri = descri;
		this.custo = custo;
		this.venda = venda;
	}
	
	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}
	
	public String getDescri() {
		return descri;
	}
	
	public void setDescri(String descri) {
		this.descri = descri;
	}
	
	public double getCusto() {
		return custo;
	}

	public void setCusto(double custo) {
		this.custo = custo;
	}

	public double getVenda() {
		return venda;
	}

	public void setVenda(double venda) {
		this.venda = venda;
	}

	public String toString() {
		String str = "\n\nCod: "+cod;
		str += "\nDescrição: "+descri;
		str += "\nPreço de Custo: "+custo;
		str += "\nPreço de Venda: "+venda;
		return str;
	}
	
	/*public static Produtos cadastro() {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite o  nome: ");
		String nome = in.next();
		System.out.println("Digite o RA: ");
		String ra = in.next();
		in.close();
		Produtos a = new Produtos(cod, descri, custo, venda);
		return a;
	}*/
	
}
