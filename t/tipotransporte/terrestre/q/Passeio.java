package t.tipotransporte.terrestre.q;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;

public class Passeio extends Carro {
	
	private boolean conversivel;
	
	
	DecimalFormat deci = new DecimalFormat("000,000.00");
	DecimalFormat decimin = new DecimalFormat("00,000.00");
	

	//Construtor padrão
	public Passeio() {
		
	}
	
	//Construtor só da classe 
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
	
	
	
	
	//Ficha técnica
	public void fichaTecnica() {	
		
		System.out.println("Nome/Modelo: " + getNome() +
									"\nCor: " + getCor() + 
										"\nPeso do carro: " + getPeso() + "Kg" +
											"\nTipo de tração: " + getTipoTracao()+  
												"\nConversível?: " + isConversivel() + 
													"\nQuantidade de portas: " + getQtdPortas() + 
														"\nVelocidade Máxima: " + getVelocidadeMax() + "Km/h" +   
															"\nMarca do pneu: " + getMarcaPneu() +
																"\nCombustivel utilizado: " + getCombustivel() + 
																	"\nValor de venda: R$" + (deci.format(valorVenda())) + 
																		"\nValor à vista com desconto: R$" + decimin.format(valorDesc())); }
	
	
	
	
	//Preço de venda
	public double valorVenda() {
		return getValorCusto() * getFatorLucro(); // getFatorLucro envia o fator de multiplicação definido na classe CriaObjetos		
	}
	
	//Historia
	public void historia() {
		JOptionPane.showMessageDialog(null, "	A história do automóvel tem início por volta de 1769, com a criação do motor a vapor de automóveis capazes de transportar humanos. ... "
										+ 	"\nO ano de 1886 é considerado o ano de nascimento do automóvel moderno - com o Benz Patent-Motorwagen, pelo inventor alemão Karl Benz.");
	}
	
	//Venda Com desconto
	
	public double valorDesc() {
		return valorVenda() * getDESCONTO(); // getDesconto envia o fator de multiplicação definido na classe CriaObjetos
	}	

	


	
	//Getter and Setter
	public boolean isConversivel() {
		return conversivel;
	}

	public void setConversivel(boolean conversivel) {
		this.conversivel = conversivel;
	}	
	
}
