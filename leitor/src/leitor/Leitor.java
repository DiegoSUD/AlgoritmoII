package leitor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Leitor {

	public static void main(String[] args) throws IOException {

		// Abrir um arquivo

		FileReader arquivo = new FileReader("arquivo.txt");
		BufferedReader leitura = new BufferedReader(arquivo);

		String line = leitura.readLine();
		String linha;

		int i = Integer.parseInt((line.split(" "))[0]);
		int j = Integer.parseInt((line.split(" "))[1]);

		String[][] matriz = new String[i][j];
		for (int x = 0; x < i; x++) {
			linha = leitura.readLine();
			for (int y = 0; y < j; y++) {
				matriz[x][y] = linha.split(" ")[y];
				System.out.printf("matriz[%d][%d]: %s\n", x, y, matriz[x][y]);
			}
		}
		leitura.close();
	}

}
