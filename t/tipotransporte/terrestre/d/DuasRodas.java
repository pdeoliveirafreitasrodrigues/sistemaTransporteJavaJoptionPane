package t.tipotransporte.terrestre.d;

import t.tipotransporte.matriz.TransporteTerrestre;

public abstract class DuasRodas extends TransporteTerrestre {  // Como a classe transporte é abstrata e os métodos Ficha técnica, valorDesc e 
															  //  Valor de venda não se aplicam aqui, tornou-se esta classe abstrata também.  

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
