package t.tipotransporte.terrestre.d;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;


public class Biz extends Moto {

	private int volumeBauIntegrado;

	
	
	DecimalFormat deci = new DecimalFormat("0,000.00");
	
	
	
	//Construtor padr�o
	public Biz() {
		
	}
	
	//Construtor s� da classe 
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
	
	
	
	
	//Ficha t�cnica
	public void fichaTecnica() {	
		
		System.out.println("Nome/Modelo: " + getNome() +
									"\nCor: " + getCor() + 
										"\nPeso da moto: " + getPeso() + "Kg" +
											"\nVolume do ba� integrado: " + getVolumeBauIntegrado() + "l" +  
												"\nPartida el�trica?: " + isPartidaEletrica() + 
													"\nCilindradas: " + getCilindradas() + 
														"\nVelocidade M�xima: " + getVelocidadeMax() + "Km/h" +  
															"\nTamanho do Aro: " + getTamanhoAro() + 
																"\nMarca do pneu: " + getMarcaPneu() +
																	"\nCombustivel utilizado: " + getCombustivel() + 
																		"\nValor de venda: R$" + (deci.format(valorVenda())) + 
																			"\nValor � vista com desconto: R$" + deci.format(valorDesc())); }
	
	
	
	
	// Pre�o Venda
	public double valorVenda() {
		return getValorCusto() * getFatorLucro(); // getFatorLucro envia o fator de multiplica��o definido na classe CriaObjetos			
	}

	
	//Hist�ria
	public void historia() {
	JOptionPane.showMessageDialog(null, "Embora tenha deixado de oferecer um custo benef�cio atraente h� anos, "
									+ "\na Honda Biz 100 � uma vers�o da Honda Biz que segue sendo um fen�meno em vendas no Brasil. "
									+ "\n� um dos ve�culos mais vendido por aqui."
									+ "\nPor menos de R$ 6 mil, o interessado pode levar para a casa uma motoneta bastante pr�tica e econ�mica, "
									+ "\nideal para o dia a dia. "
									+ "\nA Honda Biz 100/Honda Biz 110i est� presente no Brasil h� mais de 20 anos. Fez e ainda faz hist�ria em nosso mercado.");
	}
	
	
	//Venda Com desconto
	
	public double valorDesc() {
		return valorVenda() * getDESCONTO(); // getDesconto envia o fator de multiplica��o definido na classe CriaObjetos	
	}
	
	
	
	
	//Getter and Setter
	public int getVolumeBauIntegrado() {
		return volumeBauIntegrado;
	}

	public void setVolumeBauIntegrado(int volumeBauIntegrado) {
		this.volumeBauIntegrado = volumeBauIntegrado;
	}	
	
	
}
