package insertSort;

public class InsertSort {

	public static void main(String[] args) {

		int[] vetor = { 3, 5, 9, 11, 15, 17, 19, 7 };

		for (int i = 0; i < vetor.length; i++) {
			int j = i;
			int x = vetor[j];
			
			while (j > 0 && x < vetor[j -1]) {
				vetor[j] = vetor[j-1];
				j--;
			}
			vetor[j] = x;
				
		}

	}

}
