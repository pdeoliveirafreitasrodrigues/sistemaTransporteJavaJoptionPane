package t.tipotransporte.matriz;

public enum TipoCombustivel {

	GASOLINA("Gasolina"), ETANOL("Álcool(Etanol)"), FLEX("Flex (álcool e gasolina)"), DIESEL("Diesel"), AVGAS("AVGAS-Combustivel parar aeronaves"), ENERGIA("Energia elétrica"), NA("Não aplicado para este transporte.");
	
	private String descricao;
	
	TipoCombustivel(String descricao){
		this.descricao = descricao;
	}
		
		
	public String getDescricao() {
		return descricao;
	}
	
	
	
	
}
