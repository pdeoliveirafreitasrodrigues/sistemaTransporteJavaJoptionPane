package t.tipotransporte.maritmo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;
import t.tipotransporte.matriz.TransporteMaritmo;

public class BarcoPesca extends TransporteMaritmo {

	DecimalFormat deci = new DecimalFormat("0,000.00");
	
	private String tipoPesca; //Esportiva, maritma, profissional.... 

	

	
		//Construtor padr�o
		public BarcoPesca() {
			
		}
		
		//Construtor s� da classe 
		public BarcoPesca(String tipoPesca) {
			super();
			this.setTipoPesca(tipoPesca);		
		}
		
		
		//Construtor dos atributos
		public BarcoPesca(String nome, int velocidade, String cor, double peso, double valorCusto, TipoCombustivel combustivel, double fatorLucro,
							int arqueacao, String tipoPesca ) {
			
			setNome(nome);
			setVelocidadeMax(velocidade);
			setCor(cor);
			setPeso(peso);
			setValorCusto(valorCusto);
			setCombustivel(combustivel);
			setFatorLucro(fatorLucro);
			
			setArqueacao(arqueacao);

			
			this.tipoPesca = tipoPesca;
			
		}
		
		
		
	
	//Ficha t�cnica
	public void fichaTecnica() {	
		
		System.out.println("Nome/Modelo: " + getNome() + 
								"\nArquea��o: " + getArqueacao() + "m�" + 
									"\nVoltado ao tipo de pesca: " + getTipoPesca() + 
										"\nCor: " + getCor() + 
											"\nPeso do barco: " + getPeso() + "Kg" + 
												"\nVelocidade M�xima: " + getVelocidadeMax() + "Km/h" + 
													"\nCombustivel utilizado: " + getCombustivel() + 
														"\nValor de venda: R$" + (deci.format(valorVenda())) + 
															"\nValor � vista com desconto: R$" + deci.format(valorDesc())); }
	
	
	

	public double valorVenda() {
		return getValorCusto() * getFatorLucro();	// getFatorLucro envia o fator de multiplica��o definido na classe CriaObjetos	
	}


	public void historia() {
		JOptionPane.showMessageDialog(null, "Tudo come�ou no final da Pr�-hist�ria quando surgiam as primeiras atividades agropecu�rias da Idade M�dia."
				+ "\nA produ��o em alta escala ocasionou um excedente de produ��o, que precisava ser distribu�do n�o s� por via terrestre como tamb�m pelos grandes rios,"
				+ "\ncomo por exemplo, o Rio Nilo." 			
				+ "Surgia, a partir de ent�o, os primeiros barcos, as caravelas (1.255) � principal transporte de produ��o da �poca e personagem "
				+ "\ncentral do com�rcio fluvial, principalmente nos pa�ses como �ndia, China e Egito.");
	}
	
	
	//Venda Com desconto
	
	public double valorDesc() {
		return valorVenda() * getDESCONTO(); // getDesconto envia o fator de multiplica��o definido na classe CriaObjetos
	}
	
	
	
	//Getter and Setter
	public String getTipoPesca() {
		return tipoPesca;
	}

	public void setTipoPesca(String tipoPesca) {
		this.tipoPesca = tipoPesca;
	}
	
	
}
