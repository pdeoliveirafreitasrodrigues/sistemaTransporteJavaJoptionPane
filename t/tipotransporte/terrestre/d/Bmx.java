package t.tipotransporte.terrestre.d;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;


public class Bmx extends Bicicleta {

	
	private String modalidadeBmx; //Existem bicicletas desta modalidade para: Flatland, Freestyle, Dirt jump, Park, Vert e Freestyle 


	DecimalFormat deci = new DecimalFormat("0,000.00");
	
	
	//Construtor padrão
	public Bmx() {
		
	}
	
	//Construtor só da classe 
	public Bmx(String modalidadeBmx) {
		super();
		this.setModalidadeBmx(modalidadeBmx);
	}
	
	
	//Construtor dos atributos
	public Bmx(String nome, int velocidade, String cor, double peso, double valorCusto, TipoCombustivel combustivel, double fatorLucro,
			   String modalidadeBmx, String marcaPneu, String marcaPedal, int tamanhoAro ) {
		
		setNome(nome);
		setVelocidadeMax(velocidade);
		setCor(cor);
		setPeso(peso);
		setValorCusto(valorCusto);
		setCombustivel(combustivel);
		setFatorLucro(fatorLucro);
		
		setMarcaPedal(marcaPedal);
		setMarcaPneu(marcaPneu);
		setTamanhoAro(tamanhoAro);
		
		
		this.modalidadeBmx = modalidadeBmx;
		
	}
	
	
	
	//Ficha técnica
	public void fichaTecnica() {	

		System.out.println("Nome/Modelo: " + getNome() +
								"\nModalidade da BMX: " + getModalidadeBmx() + 
									"\nCor: " + getCor() + 
										"\nPeso da Bicicleta: " + getPeso() + "Kg" + 
											"\nVelocidade Máxima: " + getVelocidadeMax() + "Km/h" + " no barranco sem freio." + 
												"\nTamanho do Aro: " + getTamanhoAro() + 
													"\nMarca  do pedal: " + getMarcaPedal() + 
														"\nMarca do pneu: " + getMarcaPneu() +
															"\nValor de venda: R$" + (deci.format(valorVenda())) + 
																"\nValor à vista com desconto: R$" + deci.format(valorDesc())); }
	
	
	// Preço de venda
	public double valorVenda() {
		return getValorCusto() * getFatorLucro();		
	}

	
	// História
	public void historia() {
	JOptionPane.showMessageDialog(null, "O BMX surgiu graças à admiração de jovens norte-americanos pelo MotoCross. "
										+ "\nA vontade de imitar as manobras dos ídolos, aliada à falta de equipamento, "
										+ "\nfez com que bicicletas fossem utilizadas em pistas de terra. "
										+ "\nNasceu, então, o Bicycle Moto Cross, ou simplesmente BMX. ... "
										+ "\nEm 1981, surgiu a Federação Internacional de BMX.");
	}
	
	
	//Venda Com desconto
	public double valorDesc() {
		return valorVenda() * getDESCONTO(); // getDesconto envia o fator de multiplicação definido na classe CriaObjetos	
	}
	
	
	
	//getter and setter
	public String getModalidadeBmx() {
		return modalidadeBmx;
	}

	public void setModalidadeBmx(String modalidadeBmx) {
		this.modalidadeBmx = modalidadeBmx;
	}
	
}
