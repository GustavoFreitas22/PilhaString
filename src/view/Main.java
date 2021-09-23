package view;

import java.util.Scanner;

import model.Pilha;
import palindromosController.ControllerPalindromos;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner read = new Scanner(System.in);
		ControllerPalindromos controller = new ControllerPalindromos();
		Pilha pilha  = new Pilha();
		
		int opc;
		String palavra = "";
		String palavraInvertida = "";
		do {
			System.out.println("Digite a opcao desejada:\n1- Inverter palavra\n2- Verificar se é um palindromo\n3- Sair");
			opc = read.nextInt();
			switch(opc) {
				case 1: 
					System.out.println("Digite a palavra para ser invertida:");
					palavra = read.next();
					pilha.push(palavra);
					pilha.push(controller.invert( palavra,pilha));
					palavraInvertida = pilha.top();
					break;
				case 2:
					System.out.println("A palavra original: "+palavra+"\nA palavra invertida: "+ palavraInvertida);
					System.out.println("Palindromo = "+controller.comparar(palavra, palavraInvertida));
					break;
				case 3: 
					System.out.println("Valeu meu bom!");
					break;
				default:
					System.out.println("Opção inválida, tente novamente!");
			}
			
		}while(opc != 3);
	}
}
