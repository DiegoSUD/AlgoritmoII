package leitor;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.net.SocketTimeoutException;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class TESTE {

	public static void main(String[] args) throws IOException {

		// Abrir um arquivo

		FileReader arquivo = new FileReader("arquivo.txt");
		BufferedReader leitura = new BufferedReader(arquivo);

		String line = leitura.readLine();
		String linha;

		float somaLinha = 0;
		float somaColuna = 0;
		boolean primeiraInteracaoDeLinha = true;
		boolean primeiraInteracaoColuna = true;
		int linhaGravidade = 0;
		int colunaGravidade = 0;

		int x = Integer.parseInt((line.split(" "))[0]);
		int y = Integer.parseInt((line.split(" "))[1]);

		String[][] matriz = new String[x][y];
		for (int indiceLinha = 0; indiceLinha < x; indiceLinha++) {
			linha = leitura.readLine();
			for (int indiceColuna = 0; indiceColuna < y; indiceColuna++) {
				matriz[indiceLinha][indiceColuna] = linha.split(" ")[indiceColuna];
				System.out.printf("matriz[%d][%d]: %s\n", indiceLinha, indiceColuna, matriz[indiceLinha][indiceColuna]);
			}
		}
		leitura.close();

		for (int indiceLinha = 0; indiceLinha < x; indiceLinha++) {
			if (indiceLinha == 0 || indiceLinha == matriz.length - 1) {
				System.out.printf("Indice Linha Invalido  ");
				System.out.printf("matriz[%d][-]\n", indiceLinha);
			} else {
				float somaAtual = soma(indiceLinha, x, y, matriz);
				if (primeiraInteracaoDeLinha) {
					linhaGravidade = indiceLinha;
					somaLinha = somaAtual;
					primeiraInteracaoDeLinha = false;
				} else if (somaAtual < somaLinha) {
					linhaGravidade = indiceLinha;
					somaLinha = somaAtual;
				}

			}
		}
		System.out.println("\n Linha da Gravidade = " + linhaGravidade + 1 + "\n");

		for (int indiceColuna = 0; indiceColuna < y; indiceColuna++) {
			if (indiceColuna == 0 || indiceColuna == matriz[0].length - 1) {
				System.out.printf("Indice Coluna Invalido  ");
				System.out.printf("matriz[%d][-]\n", indiceColuna);
			} else {
				float somaAtual = somaColuna(indiceColuna, x, y, matriz);
//				System.out.println("soma= " + somaAtual);
				if (primeiraInteracaoColuna) {
					colunaGravidade = indiceColuna;
					somaColuna = somaAtual;
					primeiraInteracaoColuna = false;
				} else if (somaAtual < somaColuna) { // < pega o primeiro e <= pega o ultimo
					colunaGravidade = indiceColuna;
					somaColuna = somaAtual;
				}
			}
		}
		System.out.println("\n Coluna da Gravidade = " + colunaGravidade + 1 + "\n");
		System.out.printf("\n Caso: 1: Centro(%d,%d)", linhaGravidade + 1, colunaGravidade + 1);
	}

	public static float soma(int indLinha, int quantidadeLinha, int quantidadeColuna, String[][] matriz) {
		float soma = 0;
		for (int i = 0; i < quantidadeLinha; i++) {
			if (i != indLinha) {
				for (int j = 0; j < quantidadeColuna; j++) {
					if (i < indLinha) {
						soma -= Float.parseFloat(matriz[i][j]);
					} else {
						soma += Float.parseFloat(matriz[i][j]);
					}
				}
			}
		}
		if (soma < 0) {
			soma *= -1;
		}
		return soma;
	}

	public static float somaColuna(int indColuna, int quantLinha, int quantColuna, String[][] matriz) {
		float somaCol = 0;

		for (int i = 0; i < quantLinha; i++) {
			for (int j = 0; j < quantColuna; j++) {
				if (j != indColuna) {
					if (j < indColuna) {
						somaCol -= Float.parseFloat(matriz[i][j]);
					} else if (j != indColuna || j > indColuna) {
						somaCol += Float.parseFloat(matriz[i][j]);
					}
				}
			}
		}
		if (somaCol < 0) {
			somaCol *= -1;
		}
		return somaCol;

	}
}
