package t.tipotransporte.matriz;

public abstract class TransporteTerrestre extends Transporte{ // Como a classe transporte � abstrata e os m�todos Ficha t�cnica, valorDesc e 
	 														 //  Valor de venda n�o se aplicam aqui, tornou-se esta classe abstrata tamb�m.  

	private String marcaPneu;

	
	//Getter and Setter
	public String getMarcaPneu() {
		return marcaPneu;
	}

	public void setMarcaPneu(String marcaPneu) {
		this.marcaPneu = marcaPneu;
	}
	
	
	
	
	
}
