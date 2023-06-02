package t.tipotransporte.terrestre.d;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;


public class Nxr extends Moto {

	
	private boolean edicaoEspecialESDD; //Edição especial deste modelo

	DecimalFormat deci = new DecimalFormat("0,000.00");
	

	//Construtor padrão
	public Nxr() {
		
	}
	
	//Construtor só da classe 
	public Nxr(boolean edicaoEsp) {
		super();
		this.setEdicaoEspecialESDD(edicaoEsp);
	}	
	
	
	//Construtor dos atributos
	public Nxr(String nome, int velocidade, String cor, double peso, double valorCusto, TipoCombustivel combustivel, double fatorLucro,
					String marcaPneu, boolean edicaoEspecialESDD, int tamanhoAro, int cilindradas, boolean partidaEletrica) {
		
		setNome(nome);
		setVelocidadeMax(velocidade);
		setCor(cor);
		setPeso(peso);
		setValorCusto(valorCusto);
		setCombustivel(combustivel);
		setFatorLucro(fatorLucro);
		
		
		setMarcaPneu(marcaPneu);
		setTamanhoAro(tamanhoAro);
		setCilindradas(cilindradas);
		setPartidaEletrica(partidaEletrica);
		
		this.edicaoEspecialESDD = edicaoEspecialESDD;
		
	}
	
	
	
	//Ficha técnica
	public void fichaTecnica() {	
		
		System.out.println("Nome/Modelo: " + getNome() +
									"\nCor: " + getCor() + 
										"\nPeso da moto: " + getPeso() + "Kg" +
											"\nEdição especial da NXR?: " + isEdicaoEspecialESDD() +  
												"\nPartida elétrica?: " + isPartidaEletrica() +
													"\nCilindradas: " + getCilindradas() + 
														"\nVelocidade Máxima: " + getVelocidadeMax() + "Km/h" +  
															"\nTamanho do Aro: " + getTamanhoAro() + 
																"\nMarca do pneu: " + getMarcaPneu() +
																	"\nCombustivel utilizado: " + getCombustivel() + 
																		"\nValor de venda: R$" + (deci.format(valorVenda())) + 
																			"\nValor à vista com desconto: R$" + deci.format(valorDesc())); }
	
	

	// Preço Venda
	public double valorVenda() {
		return getValorCusto() * getFatorLucro();	// getFatorLucro envia o fator de multiplicação definido na classe CriaObjetos		
	}

	
	
	//História
	public void historia() {
	JOptionPane.showMessageDialog(null, "A Honda Bros é, atualmente, a trail mais barata que o seu dinheiro pode comprar entre as motocicletas"
									+ "\nvendidas pela marca japonesa no Brasil." 
									+ "\nEla se destaca pela versatilidade, "
									+ "sobretudo por encarar as ruas esburacadas com certa facilidade.");
	}
	
	
	//Venda Com desconto
	public double valorDesc() {
		return valorVenda() * getDESCONTO();	// getDesconto envia o fator de multiplicação definido na classe CriaObjetos	
	}
	
	
	//Getter and Setter
	public boolean isEdicaoEspecialESDD() {
		return edicaoEspecialESDD;
	}

	public void setEdicaoEspecialESDD(boolean edicaoEspecialESDD) {
		this.edicaoEspecialESDD = edicaoEspecialESDD;
	}
		
	
}
