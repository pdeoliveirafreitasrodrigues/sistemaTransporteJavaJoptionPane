package t.tipotransporte.terrestre.q;

import t.tipotransporte.matriz.TransporteTerrestre;

public abstract class QuatroRodas extends TransporteTerrestre {  // Como a classe transporte é abstrata e os métodos Ficha técnica, valorDesc e 
																//  Valor de venda não se aplicam aqui, tornou-se esta classe abstrata também.  
	
	
	private String tipoTracao;

	
	//Getter and Setter
	public String getTipoTracao() {
		return tipoTracao;
	}

	public void setTipoTracao(String tipoTracao) {
		this.tipoTracao = tipoTracao;
	}
	
	
	
	
}
