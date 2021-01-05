package atividade.catorze;

import java.util.Scanner;

public class Lista {
	
	public static int soma(int i, int res, int num) {
		if(i > 99) {
			return res;
		}
		res += num;
		i ++;
		num += 2;
		return soma(i, res, num);
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Insira um valor: ");
		int posicao = in.nextInt();
		int i = 0;
		int valor = 0;
		int resultado = soma(i, valor, posicao);
		System.out.println(resultado);
	}
}
