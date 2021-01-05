package alocacao.estatica;

public class ListaDeInteiros {
	private int[] dados;
	private int tamanho = 0;
	
	public ListaDeInteiros(int capMax) {
		dados = new int[capMax];
	}
	
	public boolean vazia() {
		if(dados.length == 0) {
			return true;
		}else{
			return false;
		}
	}
	
	public boolean cheia() {
		if(dados.length == tamanho) {
			return true;
		}else{
			return false;
		}
	}
	
	public void adicionaInicio(int e){
		if (!cheia()) {
			for (int i = tamanho; i>=1; i--){
				dados[i] = dados[i-1];
			}
			dados[0] = e;
			tamanho = tamanho + 1;
		}else{
			System.out.println("ERRO! Lista Cheia");
		}
	}
	
	public void adicionaFinal(int e){
		if(!cheia()) {
			dados[tamanho] = e;
			tamanho = tamanho + 1;
		}else{
			System.out.println("ERRO! Lista Cheia");
		}
	}
	
	public void adiciona(int e, int posicao) {
		if(!cheia()) {
			for (int i = tamanho; i>posicao; i--){
				dados[i] = dados[i-1];
			}
			dados[posicao] = e;
			tamanho++;
		}else {
			System.out.println("ERRO! Lista Cheia");
		}
	}
	
	public int removeInicio() {
		if(!vazia()) {
			int[] aux = new int[tamanho-1];
			int ret = dados[0];
			for(int i=1; i<tamanho;i++) {
				aux[i-1] = dados[i];
			}
			tamanho--;
			dados = aux;
			return ret;
		}else {
			System.out.println("ERR0! Lista Vazia");
			return 99999;
		}
	}
	
	public int removeFinal() {
		if(!vazia()) {
			int[] aux = new int[tamanho-1];
			int ret = dados[tamanho-1];
			for(int i=0; i<tamanho-1;i++) {
				aux[i] = dados[i];
			}
			tamanho--;
			dados = aux;
			return ret;
		}else {
			System.out.println("ERR0! Lista Vazia");
			return 99999;
		}
	}
	
	public int remove(int posicao) {
		if(!vazia()) {
			int ret = dados[posicao];
			for (int i = posicao; i<tamanho-1; i++){
				dados[i] = dados[i+1];
			}
			tamanho--;
			return ret;
		}else {
			System.out.println("ERRO! Lista Vazia");
			return 99999;
		}
	}
	
	public int faz() {
		int resp = -1;
		if(vazia()) {
			System.out.println("Erro");
		}else {
			resp = dados[0];
			desloca(dados, dados.length-2);
			tamanho--;
		}
		return resp;
	}
	
	public void desloca(int vetor[], int i) {
		if(i>=0) {
			vetor[i] = vetor[i+1];
			desloca(vetor, i-1);
		}
	}
	
	public int obtemPrimeira() {
		return dados[0];
	}
	
	public int obtemUltima() {
		return dados[tamanho];

	}
	
	public int obtemTamanho() {
		return dados.length;

	}	public String toString() {
		String str = "";
		for(int i=0; i<obtemTamanho(); i++) {
			str += Integer.toString(dados[i]);
			if(i<obtemTamanho()-1) {
				str += " - ";
			}
		}
		return str;
	}
	
	public static void main(String[] args) {
		ListaDeInteiros li = new ListaDeInteiros(5);
		li.adicionaFinal(0);
		li.adicionaFinal(3);
		li.adicionaFinal(2);
		li.faz();
		li.adicionaFinal(1);
		li.faz();
		System.out.println(li.toString());
	}
}
