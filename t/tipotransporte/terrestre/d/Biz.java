package t.tipotransporte.terrestre.d;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;


public class Biz extends Moto {

	private int volumeBauIntegrado;

	
	
	DecimalFormat deci = new DecimalFormat("0,000.00");
	
	
	
	//Construtor padrão
	public Biz() {
		
	}
	
	//Construtor só da classe 
	public Biz(int volumeBau) {
		super();
		this.setVolumeBauIntegrado(volumeBau);
	}
	
	
	//Construtor dos atributos
	public Biz(String nome, int velocidade, String cor, double peso, double valorCusto, TipoCombustivel combustivel, double fatorLucro,
					String marcaPneu, int volumeBauIntegrado, int tamanhoAro, int cilindradas, boolean partidaEletrica) {
		
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
		
		this.volumeBauIntegrado = volumeBauIntegrado;
		
	}
	
	
	
	
	//Ficha técnica
	public void fichaTecnica() {	
		
		System.out.println("Nome/Modelo: " + getNome() +
									"\nCor: " + getCor() + 
										"\nPeso da moto: " + getPeso() + "Kg" +
											"\nVolume do baú integrado: " + getVolumeBauIntegrado() + "l" +  
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
		return getValorCusto() * getFatorLucro(); // getFatorLucro envia o fator de multiplicação definido na classe CriaObjetos			
	}

	
	//História
	public void historia() {
	JOptionPane.showMessageDialog(null, "Embora tenha deixado de oferecer um custo benefício atraente há anos, "
									+ "\na Honda Biz 100 é uma versão da Honda Biz que segue sendo um fenômeno em vendas no Brasil. "
									+ "\nÉ um dos veículos mais vendido por aqui."
									+ "\nPor menos de R$ 6 mil, o interessado pode levar para a casa uma motoneta bastante prática e econômica, "
									+ "\nideal para o dia a dia. "
									+ "\nA Honda Biz 100/Honda Biz 110i está presente no Brasil há mais de 20 anos. Fez e ainda faz história em nosso mercado.");
	}
	
	
	//Venda Com desconto
	
	public double valorDesc() {
		return valorVenda() * getDESCONTO(); // getDesconto envia o fator de multiplicação definido na classe CriaObjetos	
	}
	
	
	
	
	//Getter and Setter
	public int getVolumeBauIntegrado() {
		return volumeBauIntegrado;
	}

	public void setVolumeBauIntegrado(int volumeBauIntegrado) {
		this.volumeBauIntegrado = volumeBauIntegrado;
	}	
	
	
}
