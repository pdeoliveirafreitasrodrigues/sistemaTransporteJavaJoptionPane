package t.tipotransporte.matriz;

public abstract class TransporteAereo extends Transporte{ // Como a classe transporte � abstrata e os m�todos Ficha t�cnica, valorDesc e 
														 //  Valor de venda n�o se aplicam aqui, tornou-se esta classe abstrata tamb�m.  

	private String categoriaAviao;
	private boolean tripulado;
	

	
	
	//Getter and Setter
	public String getCategoriaAviao() {
		return categoriaAviao;
	}

	public void setCategoriaAviao(String categoriaAviao) {
		this.categoriaAviao = categoriaAviao;
	}
	
	
	
	//Getter and Setter
	public boolean isTripulado() {
		return tripulado;
	}

	public void setTripulado(boolean tripulado) {
		this.tripulado = tripulado;
	
	}
}
