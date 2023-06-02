package t.tipotransporte.aereo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;


public class AviaoCombate extends Aviao {


	DecimalFormat deci = new DecimalFormat("000,000.00");
	
	private String modeloMissil;
	
	
	//Construtor padr�o
	public AviaoCombate() {
		
	}

	
	//Construtor s� da classe 
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
		
	
	//Ficha t�cnica
		
		public void fichaTecnica() {	
			
			System.out.println("Nome/Modelo: " + getNome() + 
								"\nCategoria do avi�o: " + getCategoriaAviao() + 
									"\nAvi�o tripulado?: " + isTripulado() + 
										"\nModelo do m�ssil instalado: " + getModeloMissil() + 
											"\nQuantidade de Turbinas: " + getQtdturbinas() + 
												"\nCor: " + getCor() + 
													"\nPeso do avi�o: " + getPeso() + "Kg" + 
														"\nVelocidade M�xima: " + getVelocidadeMax() + "Km/h" + 
															"\nCombustivel utilizado: " + getCombustivel() + 
																"\nValor de venda: R$" + deci.format(valorVenda()) + 
																	"\nValor � vista com desconto: R$" + deci.format(valorDesc()));}

	

		//pre�o venda
		public double valorVenda() {
			return getValorCusto() * getFatorLucro(); // getFatorLucro envia o fator de multiplica��o definido na classe CriaObjetos		
		}
		
		
		//Historia
		public void historia() {
			JOptionPane.showMessageDialog(null, "It�lia foi o primeiro pa�s a usar avi�es em combate, em 1911, contra o antigo Imp�rio Otomano."
												+ "\nO primeiro voo do 14 Bis em Paris aconteceu em 23 de outubro de 1906, "
												+ "\nsurpreendendo de imediato toda a Europa e o mundo. Estava provado, o homem podia voar.");
		}
		
		//Venda Com desconto
		
		public double valorDesc() {
			return valorVenda() * getDESCONTO(); // getDesconto envia o fator de multiplica��o definido na classe CriaObjetos
		}
		
		
		
	//Getter and  Setter
	public String getModeloMissil() {
		return modeloMissil;
	}

	public void setModeloMissil(String modeloMissil) {
		this.modeloMissil = modeloMissil;
	}

	
}
