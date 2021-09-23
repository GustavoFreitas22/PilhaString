package palindromosController;

import model.Pilha;

public class ControllerPalindromos {

	public ControllerPalindromos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String invert(String palavra, Pilha pilha) {
		String resultado="";
		resultado =  inverter(palavra, palavra.length(), resultado);
		palavra = resultado;
		pilha.push(palavra);
		return palavra;
	}

	public Boolean comparar(String palavraOriginal, String palavraInvertida ) {
		boolean result = false;
		if(palavraOriginal.equals("") || palavraInvertida.equals("") ) {
			System.err.println("VALORES INVALIDOS PARA COMPARAÇÃO!");
			return false;
		}else if(palavraOriginal.equals(palavraInvertida)) {
			result = true;
		}else {
			return result;
		}
		return result;
	}

	public String inverter(String palavra, int tamanho, String resultado) {
		if (tamanho == 0 ) {
			return "";
		} else{
			resultado = palavra.substring(tamanho - 1, tamanho);
			return resultado + inverter(palavra, tamanho - 1, resultado );
		}
	}
}
