package t.tipotransporte.terrestre.d;

public abstract class Moto extends DuasRodas {  // Como a classe transporte � abstrata e os m�todos Ficha t�cnica, valorDesc e 
											   //  Valor de venda n�o se aplicam aqui, tornou-se esta classe abstrata tamb�m.  

	public boolean partidaEletrica;	
	
	
	
	
	//getter and setter
	public boolean isPartidaEletrica() {
		return partidaEletrica;
	}

	public void setPartidaEletrica(boolean partidaEletrica) {
		this.partidaEletrica = partidaEletrica;
	}	
	
	
}
