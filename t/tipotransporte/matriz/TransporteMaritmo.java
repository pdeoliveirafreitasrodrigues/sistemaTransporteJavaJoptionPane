package t.tipotransporte.matriz;

public abstract class TransporteMaritmo extends Transporte { // Como a classe transporte é abstrata e os métodos Ficha técnica, valorDesc e 
	 														//  Valor de venda não se aplicam aqui, tornou-se esta classe abstrata também.  

	private int arqueacao; //volume dos compartimentos.


	
	
	//Getter and Setter
	public int getArqueacao() {
		return arqueacao;
	}

	public void setArqueacao(int arqueacao) {
		this.arqueacao = arqueacao;
	}

	
}
