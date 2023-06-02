package t.tipotransporte.terrestre.d;

import t.tipotransporte.matriz.TransporteTerrestre;

public abstract class DuasRodas extends TransporteTerrestre {  // Como a classe transporte � abstrata e os m�todos Ficha t�cnica, valorDesc e 
															  //  Valor de venda n�o se aplicam aqui, tornou-se esta classe abstrata tamb�m.  

	private int tamanhoAro;
	
	private int cilindradas;

	
	
	
	
	//getter and setter
	public int getTamanhoAro() {
		return tamanhoAro;
	}

	public void setTamanhoAro(int tamanhoAro) {
		this.tamanhoAro = tamanhoAro;
	}
	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}	
	
}
