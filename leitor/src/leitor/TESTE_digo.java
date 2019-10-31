package leitor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.SocketTimeoutException;

import javax.swing.text.StyledEditorKit.ForegroundAction;
import javax.swing.text.html.HTMLDocument.HTMLReader.ParagraphAction;

public class TESTE_digo {

	public static void main(String[] args) throws IOException {

		// Abrir um arquivo

		FileReader arquivo = new FileReader("arquivo.txt");
		BufferedReader leitura = new BufferedReader(arquivo);

		String line = leitura.readLine();
		String linha;

		float soma = 0;
		int linhaGravidade = 0;

		int x = Integer.parseInt((line.split(" "))[0]);
		int y = Integer.parseInt((line.split(" "))[1]);

		String[][] matriz = new String[x][y];
		for (int i = 0; i < x; i++) {
			linha = leitura.readLine();
			for (int j = 0; j < y; j++) {
				matriz[i][j] = linha.split(" ")[j];
				System.out.printf("matriz[%d][%d]: %s\n", i, j, matriz[i][j]);
			}
		}
		leitura.close();

//		for (int x = 0; x < i; x++) {
//			if (x == 0 || x == matriz.length - 1) {
//				
//				System.out.printf("indice invalido  ");
//				System.out.printf("matriz[%d][-]\n", x);
//			} else {
//				for (int y = 0; y < j; y++) {
//					float somaAtual = soma(x, i, j, matriz);
//					System.out.println("soma= " + somaAtual);
//					if (somaAtual > soma) {
//						linhaGravidade = x;
//						soma = somaAtual;
//					}
//				}
//			}
//		}

		for (int i = 0; i < x; i++) {
			if (i == 0 || i == matriz.length - 1) {
				System.out.printf("indice invalido  ");
				System.out.printf("matriz[%d][-]\n", i);
			} else {
				float somaAtual = soma(x, x, y, matriz);
				System.out.println(somaAtual);
				
				}

			}
		}
		

	public static float soma(int linha, int x, int y, String[][] matriz) {
		float somaInicial  = 0;
		for (int i = 0; i < x; i++) {
			if(i == linha) {
		
			}else if (i < linha || i != linha) {
				for (int j = 0; j < y; j++) {
					somaInicial+= Float.parseFloat(matriz[i][j]);
				}
			}
		}
		return somaInicial;
	}
}
