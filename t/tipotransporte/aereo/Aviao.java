package t.tipotransporte.aereo;

import t.tipotransporte.matriz.TransporteAereo;

public abstract class Aviao extends TransporteAereo{ // Utilizada esta classse como Abstract para levar os m�todos  de ficha t�cnica e 
													//  c�lculo de venda para as classes abaixo desta.

	private int qtdturbinas;

	

	

	//Getter and Setter
	public int getQtdturbinas() {
		return qtdturbinas;
	}

	public void setQtdturbinas(int qtdturbinas) {
		this.qtdturbinas = qtdturbinas;
	}
	
	
}
