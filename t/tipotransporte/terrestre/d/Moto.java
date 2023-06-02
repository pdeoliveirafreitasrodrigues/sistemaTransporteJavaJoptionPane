package t.tipotransporte.terrestre.d;

public abstract class Moto extends DuasRodas {  // Como a classe transporte é abstrata e os métodos Ficha técnica, valorDesc e 
											   //  Valor de venda não se aplicam aqui, tornou-se esta classe abstrata também.  

	public boolean partidaEletrica;	
	
	
	
	
	//getter and setter
	public boolean isPartidaEletrica() {
		return partidaEletrica;
	}

	public void setPartidaEletrica(boolean partidaEletrica) {
		this.partidaEletrica = partidaEletrica;
	}	
	
	
}
