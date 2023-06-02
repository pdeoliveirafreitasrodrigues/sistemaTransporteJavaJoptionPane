package t.tipotransporte.matriz;

public abstract class Transporte { // Classe Pai
								  //  Utilizada esta classe como Abstract para levar os m�todos  de ficha t�cnica, c�lculo de venda, valor com desconto,
								 //   e historia para todos as classes filhas.

	private String  nome;
	private int velocidadeMax;
	private String cor;
	private double peso;
	private double valorCusto;
	private TipoCombustivel combustivel;
	private double fatorLucro; 
	private final double DESCONTO = 0.97; //Este valor ser� o desconto padr�o aplicado � todos os objetos que forem comprados � vista.


	// m�todos
		
	public abstract void fichaTecnica(); //	M�todo que mostrar� todos os atributos dos objetos.

	public abstract double valorVenda(); //	M�todo que calcula o pre�o de venda dos objetos.
	
	public abstract void historia();	 // M�todo que conta uma breve hist�ria do objeto.
	
	public abstract double valorDesc();  // M�todo que aplica o fator de desconto da variavel final no valor de venda.
	
		

	//Getter and Setter
	public int getVelocidadeMax() {
		return velocidadeMax;
	}
	public void setVelocidadeMax(int velocidadeMax) {
		this.velocidadeMax = velocidadeMax;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}

	public TipoCombustivel getCombustivel() {
		return combustivel;
	}

	public void setCombustivel(TipoCombustivel combustivel) {
		this.combustivel = combustivel;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValorCusto() {
		return valorCusto;
	}
	public void setValorCusto(double valorCusto) {
		this.valorCusto = valorCusto;
	}
	public double getFatorLucro() {
		return fatorLucro;
	}
	public void setFatorLucro(double fatorLucro) {
		this.fatorLucro = fatorLucro;
	}
	public double getDESCONTO() {
		return DESCONTO;
	}
	
	
}
