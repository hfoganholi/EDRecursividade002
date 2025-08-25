/*
 * Exercício de recursividade, verificação do menor
 * valor em um vetor.
 * versão 1.0
 * data 17/08/2025
 * programador Henrique Foganholi de Oliveira
 */

package controller;

public class AcharMenorValorController {

	public AcharMenorValorController() {
		
		super();
	}
	
	public int acharMenorRecursividade(int[] vetor, int tamanhoVetor, int menorAtual) {
		
		// Condição de parada
		// Quando o tamanho do vetor chegar a zero, retorna o menor valor.
		if (tamanhoVetor == 0) {
			
			return menorAtual;
		}
		
		// Enquanto o tamanho não chegar a zero, o valor do vetor da posição atual
		// será comparado ao valor da posição anterior do vetor, e se menor,
		// será o novo menor valor e retorna, chamando a função recursiva.
		int ultimoElemento = vetor[tamanhoVetor - 1];
		if (ultimoElemento < menorAtual) {
			menorAtual = ultimoElemento;
		}
		return acharMenorRecursividade(vetor, tamanhoVetor - 1, menorAtual);
	}
}
