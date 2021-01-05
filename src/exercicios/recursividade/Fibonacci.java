package exercicios.recursividade;

public class Fibonacci {
	public int fibonacci(int stopPoint) {
		if(stopPoint < 2) {
			return stopPoint;
		}
		return fibonacci(stopPoint-2) + fibonacci(stopPoint-1);
	}
	
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		System.out.println(f.fibonacci(0));
	}
}
