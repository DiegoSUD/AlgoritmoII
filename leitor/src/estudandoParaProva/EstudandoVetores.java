package estudandoParaProva;

public class EstudandoVetores {

	// BUSCA LINEAR
	public int vetor(int[] v, int x) {

		for (int i = 0; i < v.length; i++) {
			if (v[i] == x) {
				System.out.println("vetor [ " + i + " ] = " + x);
				return i;
			}
		}
		System.out.println("não encontrou");
		return -1;
	}

	// BUSCA BINÁRIA

	public int vetorBinario(int[] vetor, int numProcurado) {
		int meio;
		int inicio = 0;
		int fim = vetor.length - 1;

		while (inicio < fim) {
			meio = (inicio + fim) / 2;

			if (numProcurado == vetor[meio]) {
				return meio;
			} else if (numProcurado <= vetor[meio]) {
				fim = meio - 1;
			} else if (numProcurado >= vetor[meio]) {
				inicio = meio + 1;
			}

		}
		return -1;

	}

	public static int buscaCriticar(int x, int v[]) {
		int m = 0;

		while (v[m] < x && m < v.length)
			m++;
		if (v[m] == x)
			return m;
		else
			return -1;
	}

	public static void main(String[] args) {

		int[] a = { 10, 18, 23, 45, 66, 70  };

//		int[] a = { 10, 70, 23, 45, 3, 33 };

		EstudandoVetores vet = new EstudandoVetores();

//		vet.vetorBinario(a, 66);

		EstudandoVetores.buscaCriticar(23, a);
	}

}
