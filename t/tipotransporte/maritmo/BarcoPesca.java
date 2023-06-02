package t.tipotransporte.maritmo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;
import t.tipotransporte.matriz.TransporteMaritmo;

public class BarcoPesca extends TransporteMaritmo {

	DecimalFormat deci = new DecimalFormat("0,000.00");
	
	private String tipoPesca; //Esportiva, maritma, profissional.... 

	

	
		//Construtor padrão
		public BarcoPesca() {
			
		}
		
		//Construtor só da classe 
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
		
		
		
	
	//Ficha técnica
	public void fichaTecnica() {	
		
		System.out.println("Nome/Modelo: " + getNome() + 
								"\nArqueação: " + getArqueacao() + "m³" + 
									"\nVoltado ao tipo de pesca: " + getTipoPesca() + 
										"\nCor: " + getCor() + 
											"\nPeso do barco: " + getPeso() + "Kg" + 
												"\nVelocidade Máxima: " + getVelocidadeMax() + "Km/h" + 
													"\nCombustivel utilizado: " + getCombustivel() + 
														"\nValor de venda: R$" + (deci.format(valorVenda())) + 
															"\nValor à vista com desconto: R$" + deci.format(valorDesc())); }
	
	
	

	public double valorVenda() {
		return getValorCusto() * getFatorLucro();	// getFatorLucro envia o fator de multiplicação definido na classe CriaObjetos	
	}


	public void historia() {
		JOptionPane.showMessageDialog(null, "Tudo começou no final da Pré-história quando surgiam as primeiras atividades agropecuárias da Idade Média."
				+ "\nA produção em alta escala ocasionou um excedente de produção, que precisava ser distribuído não só por via terrestre como também pelos grandes rios,"
				+ "\ncomo por exemplo, o Rio Nilo." 			
				+ "Surgia, a partir de então, os primeiros barcos, as caravelas (1.255) – principal transporte de produção da época e personagem "
				+ "\ncentral do comércio fluvial, principalmente nos países como Índia, China e Egito.");
	}
	
	
	//Venda Com desconto
	
	public double valorDesc() {
		return valorVenda() * getDESCONTO(); // getDesconto envia o fator de multiplicação definido na classe CriaObjetos
	}
	
	
	
	//Getter and Setter
	public String getTipoPesca() {
		return tipoPesca;
	}

	public void setTipoPesca(String tipoPesca) {
		this.tipoPesca = tipoPesca;
	}
	
	
}
