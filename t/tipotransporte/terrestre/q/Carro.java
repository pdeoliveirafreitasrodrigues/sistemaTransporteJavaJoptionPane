package t.tipotransporte.terrestre.q;

public abstract class Carro extends QuatroRodas {    // Como a classe transporte � abstrata e os m�todos Ficha t�cnica, valorDesc e 
													//  Valor de venda n�o se aplicam aqui, tornou-se esta classe abstrata tamb�m.  

	private int qtdPortas;
	
	
	//Getter and Setter
	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	
	
}
