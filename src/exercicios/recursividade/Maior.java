package exercicios.recursividade;

public class Maior {
	public int maiorConvencional(int[] array) {
		int maior = Integer.MIN_VALUE;
		for(int i = 0; i < array.length; i++) {
			if(array[i] > maior) {
				maior = array[i];
			}
		}
		return maior;
	}
	
	int maiorRecursivo(int pos, int vetor[]) {
		int x;
		if(pos==1) {
			x = vetor[0];
			//System.out.println(x);
			return x;
		}else {
			x = maiorRecursivo(pos-1, vetor);
			if(x < vetor[pos-1]) {
				x = vetor[pos-1];
			}
		}
		System.out.println(x);
		return x;
	}
	
	public static void main(String[] args) {
		Maior m = new Maior();
		int v[] = {0, 1, 5}; 
		//System.out.println(m.maiorConvencional(v));
		m.maiorRecursivo(v.length, v);
		
	}
}
