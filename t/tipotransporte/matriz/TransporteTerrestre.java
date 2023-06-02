package t.tipotransporte.matriz;

public abstract class TransporteTerrestre extends Transporte{ // Como a classe transporte é abstrata e os métodos Ficha técnica, valorDesc e 
	 														 //  Valor de venda não se aplicam aqui, tornou-se esta classe abstrata também.  

	private String marcaPneu;

	
	//Getter and Setter
	public String getMarcaPneu() {
		return marcaPneu;
	}

	public void setMarcaPneu(String marcaPneu) {
		this.marcaPneu = marcaPneu;
	}
	
	
	
	
	
}
