package t.tipotransporte.terrestre.d;

public abstract class Bicicleta extends DuasRodas {  // Como a classe transporte é abstrata e os métodos Ficha técnica, valorDesc e 
	 												//  Valor de venda não se aplicam aqui, tornou-se esta classe abstrata também.  
	
	private String marcaPedal;

	
	
	//getter and Setter
	public String getMarcaPedal() {
		return marcaPedal;
	}

	public void setMarcaPedal(String marcaPedal) {
		this.marcaPedal = marcaPedal;
	}
	
}
