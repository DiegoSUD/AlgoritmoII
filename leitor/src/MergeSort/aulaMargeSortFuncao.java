package MergeSort;

public class aulaMargeSortFuncao {
//	 int v [] = {5,6,2,7,9,1};

	public static int teste(int v[], int p, int r) {
		int c, i, j;
		c = v[p];
		i = p+1;
		j = r;
		
		while(i <= j) {
			if(v[i] <= c) {
				i++;
			}
			else if(v[j] > c) {
				j--;
			}
			else {
				int t = v[i];
				v[i] = v[j];
				v[j] = t;
				i++;
				j--;
			}
		}
		v[p] = v[j];
		v[j]= c;
		return j;

	}

	public static void imprimir(int[] v) {
		for (int i = 0; i < v.length; i++) {
			System.out.print(v[i] + " ");
		}
	}

	public static void main(String[] args) {
		int v[] = { 5, 10, 4, 6, 3, 2 };
		teste(v,0, v.length-1);
		imprimir(v);
	}

}
