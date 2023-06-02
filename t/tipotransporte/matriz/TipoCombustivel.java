package t.tipotransporte.matriz;

public enum TipoCombustivel {

	GASOLINA("Gasolina"), ETANOL("�lcool(Etanol)"), FLEX("Flex (�lcool e gasolina)"), DIESEL("Diesel"), AVGAS("AVGAS-Combustivel parar aeronaves"), ENERGIA("Energia el�trica"), NA("N�o aplicado para este transporte.");
	
	private String descricao;
	
	TipoCombustivel(String descricao){
		this.descricao = descricao;
	}
		
		
	public String getDescricao() {
		return descricao;
	}
	
	
	
	
}
