package lista.encadeala;

public class ListaDeInteiros {
	private No inicio;
	private No ultimo;
	private int tamanho;
	
	public ListaDeInteiros() {
		inicio = null;
		ultimo = null;
		tamanho = 0;
	}
	
	public boolean vazia() {
		return inicio == null;
	}
	
	public void adicionarInicio(int e) {
		No novo = new No(e);
		if(vazia()) {
			ultimo = novo;
		}
		novo.setProx(inicio);
		inicio = novo;
		tamanho++;
		
	}
	
	public void adicionaFinal(int e) {
		No novo = new No(e);
		if(vazia()) {
			inicio = novo;
		}else {
			ultimo.setProx(novo);
		}
		ultimo = novo;
		tamanho++;
	}
	
	public int removeInicio() {
		if(vazia()) {
			return (Integer)null;
		}else {
			int ret = inicio.getE();
			inicio = inicio.getProx();
			tamanho--;
			return ret;
		}
	}
	public int removeFinal() {
		if(vazia()) {
			return (Integer)null;
		}else {
			int ret = ultimo.getE();
			No atual = inicio;
			while(atual.getProx() != ultimo) {
				atual = atual.getProx();
			}
			atual.setProx(null);
			ultimo = atual;
			return ret;
		}
	}
	
	
}
