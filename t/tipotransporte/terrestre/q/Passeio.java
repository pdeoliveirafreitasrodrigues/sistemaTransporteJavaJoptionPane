package t.tipotransporte.terrestre.q;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;

public class Passeio extends Carro {
	
	private boolean conversivel;
	
	
	DecimalFormat deci = new DecimalFormat("000,000.00");
	DecimalFormat decimin = new DecimalFormat("00,000.00");
	

	//Construtor padr�o
	public Passeio() {
		
	}
	
	//Construtor s� da classe 
	public Passeio(boolean conversivel) {
		super();
		this.setConversivel(conversivel);
	}
	
	
	
	//Construtor dos atributos
	public Passeio(String nome, int velocidade, String cor, double peso, double valorCusto, TipoCombustivel combustivel, double fatorLucro,
						String marcaPneu, boolean conversivel, String tipoTracao, int qtdPortas) {
		
		setNome(nome);
		setVelocidadeMax(velocidade);
		setCor(cor);
		setPeso(peso);
		setValorCusto(valorCusto);
		setCombustivel(combustivel);
		setFatorLucro(fatorLucro);
		
		
		setMarcaPneu(marcaPneu);
		setTipoTracao(tipoTracao);
		setQtdPortas(qtdPortas);
		
		this.conversivel = conversivel;
		
	}	
	
	
	
	
	//Ficha t�cnica
	public void fichaTecnica() {	
		
		System.out.println("Nome/Modelo: " + getNome() +
									"\nCor: " + getCor() + 
										"\nPeso do carro: " + getPeso() + "Kg" +
											"\nTipo de tra��o: " + getTipoTracao()+  
												"\nConvers�vel?: " + isConversivel() + 
													"\nQuantidade de portas: " + getQtdPortas() + 
														"\nVelocidade M�xima: " + getVelocidadeMax() + "Km/h" +   
															"\nMarca do pneu: " + getMarcaPneu() +
																"\nCombustivel utilizado: " + getCombustivel() + 
																	"\nValor de venda: R$" + (deci.format(valorVenda())) + 
																		"\nValor � vista com desconto: R$" + decimin.format(valorDesc())); }
	
	
	
	
	//Pre�o de venda
	public double valorVenda() {
		return getValorCusto() * getFatorLucro(); // getFatorLucro envia o fator de multiplica��o definido na classe CriaObjetos		
	}
	
	//Historia
	public void historia() {
		JOptionPane.showMessageDialog(null, "	A hist�ria do autom�vel tem in�cio por volta de 1769, com a cria��o do motor a vapor de autom�veis capazes de transportar humanos. ... "
										+ 	"\nO ano de 1886 � considerado o ano de nascimento do autom�vel moderno - com o Benz Patent-Motorwagen, pelo inventor alem�o Karl Benz.");
	}
	
	//Venda Com desconto
	
	public double valorDesc() {
		return valorVenda() * getDESCONTO(); // getDesconto envia o fator de multiplica��o definido na classe CriaObjetos
	}	

	


	
	//Getter and Setter
	public boolean isConversivel() {
		return conversivel;
	}

	public void setConversivel(boolean conversivel) {
		this.conversivel = conversivel;
	}	
	
}
