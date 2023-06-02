package t.tipotransporte.matriz;

public abstract class TransporteAereo extends Transporte{ // Como a classe transporte é abstrata e os métodos Ficha técnica, valorDesc e 
														 //  Valor de venda não se aplicam aqui, tornou-se esta classe abstrata também.  

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
