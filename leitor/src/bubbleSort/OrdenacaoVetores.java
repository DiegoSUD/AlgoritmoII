package bubbleSort;

public class OrdenacaoVetores {

	public static void main(String[] args) {

		int [] vetor = {3, 5, 9, 11, 15, 17, 19, 7};
		
		int j = vetor.length - 1;
		int x = vetor[j];
		
		
		while (j > 0 && x < vetor[j-1]) {
			vetor[j] = vetor[j-1];
			j--;
		}
		vetor[j] = x;
		System.out.println(vetor);
	}
	
	//-------------------------------------------------------
	
	
	
	
	
}
