package t.tipotransporte.terrestre.q;

import t.tipotransporte.matriz.TransporteTerrestre;

public abstract class QuatroRodas extends TransporteTerrestre {  // Como a classe transporte � abstrata e os m�todos Ficha t�cnica, valorDesc e 
																//  Valor de venda n�o se aplicam aqui, tornou-se esta classe abstrata tamb�m.  
	
	
	private String tipoTracao;

	
	//Getter and Setter
	public String getTipoTracao() {
		return tipoTracao;
	}

	public void setTipoTracao(String tipoTracao) {
		this.tipoTracao = tipoTracao;
	}
	
	
	
	
}
