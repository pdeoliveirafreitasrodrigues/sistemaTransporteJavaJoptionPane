package t.tipotransporte.matriz;

public abstract class TransporteMaritmo extends Transporte { // Como a classe transporte � abstrata e os m�todos Ficha t�cnica, valorDesc e 
	 														//  Valor de venda n�o se aplicam aqui, tornou-se esta classe abstrata tamb�m.  

	private int arqueacao; //volume dos compartimentos.


	
	
	//Getter and Setter
	public int getArqueacao() {
		return arqueacao;
	}

	public void setArqueacao(int arqueacao) {
		this.arqueacao = arqueacao;
	}

	
}
