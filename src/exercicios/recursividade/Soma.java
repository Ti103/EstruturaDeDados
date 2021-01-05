package exercicios.recursividade;

public class Soma {
	
	public int soma(int n) {
		if(n<2) {
			return n;
		}
		return n + soma(n-1);
	}
	
	public int somaArray(int array[], int tam, int x) {
		int aux;
		if(tam == 1) {
			x += array[0];
		}else {
			aux = somaArray(array, tam-1, x);
			System.out.println(aux);
			x += aux;
		}
		return x;
	}
	
	public static void main(String[] args) {
		Soma s = new Soma();
		System.out.println(s.soma(5));
		int a[] = {1, 2, 3, 4, 5, 8, 7};
		System.out.println(s.somaArray(a, a.length, 0));
	}
}
