
public class tipoAbstratoDados {
	
	// sem usar tipo abstrato de dados
	
	public static int[] soma(int a, int b, int c, int d) {
		int [] fracao = new int [2];
		
		fracao[0]= a*d + c*b;
		fracao[1] = b*d;
		
		return fracao;
	}
	
	public static void main(String[] args) {
		int [] fracao = soma(3, 4, 1, 2);
		System.out.println("soma = " + fracao[0] + "/" + fracao[1]);
	}

}
