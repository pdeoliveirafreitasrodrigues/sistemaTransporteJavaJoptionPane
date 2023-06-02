package t.tipotransporte.terrestre.q;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;


public class Camionete extends Carro {

	private String tipoCarroceria;

	
	DecimalFormat deci = new DecimalFormat("00,000.00");
	
	
	//Construtor padr�o
	public Camionete() {
		
	}
	
	//Construtor s� da classe 
	public Camionete(String tipoCarroc) {
		super();
		this.setTipoCarroceria(tipoCarroc);
	}
	
	
	
	//Construtor dos atributos
	public Camionete(String nome, int velocidade, String cor, double peso, double valorCusto, TipoCombustivel combustivel, double fatorLucro,
						String marcaPneu, String tipoCarroceria, String tipoTracao, int qtdPortas) {
		
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
		
		this.tipoCarroceria = tipoCarroceria;
		
	}	
	
	
//Ficha t�cnica	
public void fichaTecnica() {	
		
	System.out.println("Nome/Modelo: " + getNome() +
									"\nCor: " + getCor() + 
										"\nPeso da camionete: " + getPeso() + "Kg" +
											"\nTipo de tra��o: " + getTipoTracao()+  
												"\nTipo de carroceria: " + getTipoCarroceria() + 
													"\nQuantidade de portas: " + getQtdPortas() + 
														"\nVelocidade M�xima: " + getVelocidadeMax() + "Km/h" +   
															"\nMarca do pneu: " + getMarcaPneu() +
																"\nCombustivel utilizado: " + getCombustivel() + 
																	"\nValor de venda: R$" + (deci.format(valorVenda())) + 
																		"\nValor � vista com desconto: R$" + deci.format(valorDesc())); }
	
	
		
	//Pre�o Venda
	public double valorVenda() {
		return getValorCusto() * getFatorLucro();	// getFatorLucro envia o fator de multiplica��o definido na classe CriaObjetos	
	}

	// Hist�ria
	public void historia() {
	JOptionPane.showMessageDialog(null, "A primeira carrinha de caixa aberta a ser fabricada foi baseada no carro Ford Model T, com a traseira modificada."
									+ "\nEle estreou em 1925 e vendido por 281 d�lares. ...  "
									+ "\nEm 1932, com 65 cavalos de pot�ncia (48 kW) Ford Flathead V8 foi oferecido como uma op��o no caminh�o.");
	}
	
	//Venda Com desconto
	public double valorDesc() {
		return valorVenda() * getDESCONTO(); // getDesconto envia o fator de multiplica��o definido na classe CriaObjetos
	}
	
	
	
	//Getter and Setter
	public String getTipoCarroceria() {
		return tipoCarroceria;
	}

	public void setTipoCarroceria(String tipoCarroceria) {
		this.tipoCarroceria = tipoCarroceria;
	}
	
	
}
