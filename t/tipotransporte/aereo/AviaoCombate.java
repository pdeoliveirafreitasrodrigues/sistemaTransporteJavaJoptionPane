package t.tipotransporte.aereo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;


public class AviaoCombate extends Aviao {


	DecimalFormat deci = new DecimalFormat("000,000.00");
	
	private String modeloMissil;
	
	
	//Construtor padrão
	public AviaoCombate() {
		
	}

	
	//Construtor só da classe 
	public AviaoCombate(String modeloMissil) {
		super();
		this.setModeloMissil(modeloMissil);
	}
	
	//Construtor dos atributos
	public AviaoCombate(String nome, int velocidade, String cor, double peso, double valorCusto, TipoCombustivel combustivel, double fatorLucro, int qtdTurbinas,
						String categoriaAviao, boolean tripulado, String modeloMissil ) {
		
		setNome(nome);
		setVelocidadeMax(velocidade);
		setCor(cor);
		setPeso(peso);
		setValorCusto(valorCusto);
		setCombustivel(combustivel);
		setFatorLucro(fatorLucro);
		setQtdturbinas(qtdTurbinas);
		setCategoriaAviao(categoriaAviao);
		setTripulado(tripulado);
		this.modeloMissil = modeloMissil;
		
	}
		
	
	//Ficha técnica
		
		public void fichaTecnica() {	
			
			System.out.println("Nome/Modelo: " + getNome() + 
								"\nCategoria do avião: " + getCategoriaAviao() + 
									"\nAvião tripulado?: " + isTripulado() + 
										"\nModelo do míssil instalado: " + getModeloMissil() + 
											"\nQuantidade de Turbinas: " + getQtdturbinas() + 
												"\nCor: " + getCor() + 
													"\nPeso do avião: " + getPeso() + "Kg" + 
														"\nVelocidade Máxima: " + getVelocidadeMax() + "Km/h" + 
															"\nCombustivel utilizado: " + getCombustivel() + 
																"\nValor de venda: R$" + deci.format(valorVenda()) + 
																	"\nValor à vista com desconto: R$" + deci.format(valorDesc()));}

	

		//preço venda
		public double valorVenda() {
			return getValorCusto() * getFatorLucro(); // getFatorLucro envia o fator de multiplicação definido na classe CriaObjetos		
		}
		
		
		//Historia
		public void historia() {
			JOptionPane.showMessageDialog(null, "Itália foi o primeiro país a usar aviões em combate, em 1911, contra o antigo Império Otomano."
												+ "\nO primeiro voo do 14 Bis em Paris aconteceu em 23 de outubro de 1906, "
												+ "\nsurpreendendo de imediato toda a Europa e o mundo. Estava provado, o homem podia voar.");
		}
		
		//Venda Com desconto
		
		public double valorDesc() {
			return valorVenda() * getDESCONTO(); // getDesconto envia o fator de multiplicação definido na classe CriaObjetos
		}
		
		
		
	//Getter and  Setter
	public String getModeloMissil() {
		return modeloMissil;
	}

	public void setModeloMissil(String modeloMissil) {
		this.modeloMissil = modeloMissil;
	}

	
}
