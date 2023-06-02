package t.tipotransporte.aereo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;
import t.tipotransporte.matriz.TransporteAereo;

public class Helicoptero extends TransporteAereo{

	DecimalFormat deci = new DecimalFormat("000,000.00");
	
	private String tipoRotor; //Simples, rotor de cauda comum, Fenestron, Duplo Coaxial, Duplo Sincronizado, Duplo lado a lado, Tandem, ect....

	
	
	
	//Construtor padrão
	public Helicoptero() {
		
	}
	
	//Construtor só da classe 
	public Helicoptero(String tipoRotor) {
		super();
		this.setTipoRotor(tipoRotor);		
	}
	
	
	//Construtor dos atributos
	public Helicoptero(String nome, int velocidade, String cor, double peso, double valorCusto, TipoCombustivel combustivel, double fatorLucro,
						String categoriaAviao, boolean tripulado, String tipoRotor ) {
		
		setNome(nome);
		setVelocidadeMax(velocidade);
		setCor(cor);
		setPeso(peso);
		setValorCusto(valorCusto);
		setCombustivel(combustivel);
		setFatorLucro(fatorLucro);
		
		setCategoriaAviao(categoriaAviao);
		setTripulado(tripulado);
		this.tipoRotor = tipoRotor;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	//Ficha técnica
	public void fichaTecnica() {	
		
		System.out.println("Nome/Modelo: " + getNome() + 
							"\nCategoria do helicóptero: " + getCategoriaAviao() + 
								"\nHelicóptero tripulável?: " + isTripulado() + 
									"\nTipo do rotor do helicóptero: " + getTipoRotor() + 
										"\nCor: " + getCor() + 
											"\nPeso do helicóptero: " + getPeso() + "Kg" + 
												"\nVelocidade Máxima: " + getVelocidadeMax() + "Km/h" + 
													"\nCombustivel utilizado: " + getCombustivel() + 
														"\nValor de venda: R$" + (deci.format(valorVenda())) +
															"\nValor à vista com desconto: R$" + deci.format(valorDesc())); }
	
	
	//Preço de venda
	public double valorVenda() {
		return getValorCusto() * getFatorLucro();	// getFatorLucro envia o fator de multiplicação definido na classe CriaObjetos	
	}
	
	//Historia
	public void historia() {
		JOptionPane.showMessageDialog(null, "	A primeira ideia pouco prática de um helicóptero foi concebida por Leonardo da Vinci no século XV,"
											+ "\nmas esquecida até a invenção do avião no século XX. "
											+ "\n... O primeiro voo bem-sucedido e registrado de um helicóptero ocorreu em 1907, realizado por Paul Cornu, na França.");
	}
	
	
	//Venda Com desconto
	public double valorDesc() {
		return valorVenda() * getDESCONTO(); // getDesconto envia o fator de multiplicação definido na classe CriaObjetos
	}
	
	
	
	
	//Getter and Setter
	public String getTipoRotor() {
		return tipoRotor;
	}

	public void setTipoRotor(String tipoRotor) {
		this.tipoRotor = tipoRotor;
	}
	
	
	
	
	
}
