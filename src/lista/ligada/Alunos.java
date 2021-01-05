package lista.ligada;

public class Alunos {
	private int nota;
	private Alunos prox;
	
	public void setNota(int nota) {
		this.nota =  nota;
	}
	
	public int getNota() {
		return this.nota;
	}
	
	public void setProximo(Alunos prox) {
		this.prox = prox;
	}
	
	public Alunos getProximo() {
		return this.prox;
	}

}
