package exercicios.recursividade;

public class Potencia {
	
	public int potencia(int base, int expoente) {
		if(expoente==0) {
			return 1;
		}else if(expoente == 1) {
			return base;
		}
		return base * potencia(base, expoente - 1);
	}
	
	public static void main(String[] args) {
		Potencia p = new Potencia();
		System.out.println(p.potencia(5, 2));
	}
}
