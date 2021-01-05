package alocacao.estatica;

public class ListaDeProdutos {
	private Produtos[] dados;
	private int tamanho = 0;

	public ListaDeProdutos(int capMax) {
		dados = new Produtos[capMax];
	}

	public boolean vazia() {
		if (dados.length == 0) {
			return true;
		} else {
			return false;
		}
	}

	public boolean cheia() {
		if (dados.length == tamanho) {
			return true;
		} else {
			return false;
		}
	}

	public void adicionaInicio(Produtos e) {
		if (!cheia()) {
			for (int i = tamanho; i >= 1; i--) {
				dados[i] = dados[i - 1];
			}
			dados[0] = e;
			tamanho = tamanho + 1;
		} else {
			System.out.println("ERRO! Lista Cheia");
		}
	}

	public void adicionaFinal(Produtos e) {
		if (!cheia()) {
			dados[tamanho] = e;
			tamanho = tamanho + 1;
		} else {
			System.out.println("ERRO! Lista Cheia");
		}
	}

	public void adiciona(Produtos e, int posicao) {
		if (!cheia()) {
			for (int i = tamanho; i > posicao; i--) {
				dados[i] = dados[i - 1];
			}
			dados[posicao] = e;
			tamanho++;
		} else {
			System.out.println("ERRO! Lista Cheia");
		}
	}

	public Produtos removeInicio() {

		Produtos[] aux = new Produtos[tamanho - 1];
		Produtos ret = dados[0];
		for (int i = 1; i < tamanho; i++) {
			aux[i - 1] = dados[i];
		}
		tamanho--;
		dados = aux;
		return ret;

	}

	public Produtos removeFinal() {

		Produtos[] aux = new Produtos[tamanho - 1];
		Produtos ret = dados[tamanho - 1];
		for (int i = 0; i < tamanho - 1; i++) {
			aux[i] = dados[i];
		}
		tamanho--;
		dados = aux;
		return ret;

	}

	public Produtos remove(int posicao) {
		Produtos ret = dados[posicao];
		for (int i = posicao; i < tamanho - 1; i++) {
			dados[i] = dados[i + 1];
		}
		tamanho--;
		return ret;
	}

	public Produtos obtemPrimeira() {
		return dados[0];
	}

	public Produtos obtemUltima() {
		return dados[tamanho];

	}

	public int obtemTamanho() {
		return dados.length;

	}
	public String toString() { 
		String str = "---------------------------\n"; 
		for(int i=0; i<obtemTamanho();i++) { 
			str += dados[i].toString();
		}
		return str;
	}
}