package t.tipotransporte.terrestre.d;

public abstract class Bicicleta extends DuasRodas {  // Como a classe transporte � abstrata e os m�todos Ficha t�cnica, valorDesc e 
	 												//  Valor de venda n�o se aplicam aqui, tornou-se esta classe abstrata tamb�m.  
	
	private String marcaPedal;

	
	
	//getter and Setter
	public String getMarcaPedal() {
		return marcaPedal;
	}

	public void setMarcaPedal(String marcaPedal) {
		this.marcaPedal = marcaPedal;
	}
	
}
