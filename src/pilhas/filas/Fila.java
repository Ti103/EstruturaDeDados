package pilhas.filas;

public class Fila {
	private int[] dados;
	private int tamanho;
	
	public Fila(int capMax) {
		dados = new int[capMax];
		tamanho = 0;
	}
	
	public boolean cheia() {
		if(tamanho == dados.length) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean vazia() {
		if(tamanho == 0) {
			return true;
		}else {
			return false;
		}
	}
	
	public void adiciona(int e) {
		if(!cheia()) {
			dados[tamanho++] = e;
			System.out.println("Adicionado com Sucesso");
		}else {
			System.out.println("ERR0! Lista Cheia");
		}
	}
	
	public int remove() {
		if(!vazia()) {
			int excluido = dados[tamanho-1];
			int[] aux = new int[--tamanho];
			for(int i=0; i<=tamanho;i++) {
				aux[i]=dados[i];
			}
			dados = aux;
			System.out.println("removido com sucesso");
			return excluido;
		}else {
			System.out.println("ERR0! Lista Vazia");
			return (Integer) null;
		}
	}
	
	public String toString() {
		String str = "| ";
		for (int i = 0; i < tamanho; i++) {
			str += Integer.toString(dados[i]);
			str += " | ";
		}
		return str;
	}
	public static void main(String[] args) {
		Fila f = new Fila(5);
		for (int i = 0; i < 10; i++) {
			f.adiciona(i+1);
		}
		System.out.println(f.toString());
	}
}
