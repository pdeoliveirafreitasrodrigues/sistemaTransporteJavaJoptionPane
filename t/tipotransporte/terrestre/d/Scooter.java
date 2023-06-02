package t.tipotransporte.terrestre.d;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;

public class Scooter extends DuasRodas {

	private boolean automatica;

	DecimalFormat deci = new DecimalFormat("00,000.00");
	

	//Construtor padr�o
	public Scooter() {
		
	}
	
	//Construtor s� da classe 
	public Scooter(boolean automatica) {
		super();
		this.setAutomatica(automatica);
	}	
	
	
	//Construtor dos atributos
	public Scooter(String nome, int velocidade, String cor, double peso, double valorCusto, TipoCombustivel combustivel, double fatorLucro,
						String marcaPneu, boolean automatica, int tamanhoAro, int cilindradas) {
		
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
		
		this.automatica = automatica;
		
	}	
	
	
	
//Ficha t�cnica	
public void fichaTecnica() {	
		
	System.out.println("Nome/Modelo: " + getNome() +
									"\nCor: " + getCor() + 
										"\nPeso da Scooter: " + getPeso() + "Kg" +  
											"\nAutom�tica?: " + isAutomatica() + 
												"\nCilindradas: " + getCilindradas() + 
													"\nVelocidade M�xima: " + getVelocidadeMax() + "Km/h" +  
														"\nTamanho do Aro: " + getTamanhoAro() + 
															"\nMarca do pneu: " + getMarcaPneu() +
																"\nCombustivel utilizado: " + getCombustivel() + 
																	"\nValor de venda: R$" + (deci.format(valorVenda())) + 
																		"\nValor � vista com desconto: R$" + deci.format(valorDesc())); }



	
	//Pre�o Venda
	public double valorVenda() {
		return getValorCusto() * getFatorLucro(); // getFatorLucro envia o fator de multiplica��o definido na classe CriaObjetos			
	}

	
	//Hist�ria
	public void historia() {
	JOptionPane.showMessageDialog(null, "Em 1947, a scooter foi inventada com o objetivo de ser um ve�culo econ�mico, acess�vel, para as massas,"
									+ "\nf�cil de pilotar e capaz de proteger piloto e passageiro das emiss�es de gases poluentes. ... "
									+ "\nA primeira scooter do mundo foi criada por Enrico Piaggio.");
	}
	
	
	//Venda Com desconto
	public double valorDesc() {
		return valorVenda() * getDESCONTO(); // getDesconto envia o fator de multiplica��o definido na classe CriaObjetos	
	}
	
	
	

//Getter and Setter
public boolean isAutomatica() {
	return automatica;
}



public void setAutomatica(boolean automatica) {
	this.automatica = automatica;
}	
	
}
