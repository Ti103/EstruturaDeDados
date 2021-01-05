package pilhas.filas;

public class Pilha {
	private int[] dados;
	private int topo;
	
	public Pilha(int capMax) {
		this.dados = new int[capMax];
		this.topo = -1;
	}
	
	public boolean cheia() {
		if(topo == dados.length-1) {
			return true;
		}else {
			return false;
		}
	}

	public boolean vazia() {
		if(topo == -1) {
			return true;
		}else {
			return false;
		}
	}

	public void empilha(int e) {
		if(!cheia()) {
			dados[++topo] = e;
		}else {
			System.out.println("ERR0! L15T4 CH314");
		}
	}
	public int desempilha() {
		if(!vazia()) {
			int excluido = dados[topo]; 
			int[] aux = new int[topo];
			for(int i = 0; i <= topo; i++) {
				aux[i] = dados[i];
			}
			dados = aux;
			topo--;
			return excluido;
		}else {
			System.out.println("ERR0! L15T4 V4Z14");
			return (Integer) null;
		}	
	}
	public String toString() {
		String str = "";
		for(int i = topo; i >= 0; i--) {
			str += Integer.toString(dados[i]);
			str += "\n-\n";
		}
		return str;
	}
	public static void main(String[] args) {
		Pilha p = new Pilha(5);
		for(int i=0; i<5; i++) {
			p.empilha(i);
		}
		System.out.println(p.toString());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
