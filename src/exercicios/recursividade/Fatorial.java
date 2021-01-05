package exercicios.recursividade;

public class Fatorial {
	
	public int fatorial(int num) {
		if(num <= 1) {
			return 1;
		}else {
			return num * fatorial(num-1);
		}
	}
	public static void main(String[] args) {
		Fatorial n = new Fatorial();
		System.out.println(n.fatorial(5));
	}

}
