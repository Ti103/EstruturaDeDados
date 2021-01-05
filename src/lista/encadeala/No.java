package lista.encadeala;

public class No {
	
	private int e;
	private No prox;
	
	public No(int e) {
		this.e = e;
		this.prox = null;
	}

	public int getE() {
		return e;
	}

	public void setE(int e) {
		this.e = e;
	}

	public No getProx() {
		return prox;
	}

	public void setProx(No prox) {
		this.prox = prox;
	}
	
	
}
