/*
 * Exercício de recursividade, verificação do menor
 * valor em um vetor.
 * versão 1.0
 * data 17/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package view;

import controller.AcharMenorValorController;

public class Principal {

	public static void main(String[] args) {
		
		AcharMenorValorController controle = new AcharMenorValorController();
		int[] meuVetor= {8, 16, 14, 6, 11};
		int pontoDePartida = meuVetor[meuVetor.length - 1];
		int menorValor = controle.acharMenorRecursividade(meuVetor, meuVetor.length - 1, pontoDePartida);
		System.out.println("O menor valor no vetor é " + menorValor + ".");
	}
}
