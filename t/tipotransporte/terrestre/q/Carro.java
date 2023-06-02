package t.tipotransporte.terrestre.q;

public abstract class Carro extends QuatroRodas {    // Como a classe transporte é abstrata e os métodos Ficha técnica, valorDesc e 
													//  Valor de venda não se aplicam aqui, tornou-se esta classe abstrata também.  

	private int qtdPortas;
	
	
	//Getter and Setter
	public int getQtdPortas() {
		return qtdPortas;
	}

	public void setQtdPortas(int qtdPortas) {
		this.qtdPortas = qtdPortas;
	}
	
	
}
