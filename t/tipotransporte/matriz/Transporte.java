package t.tipotransporte.matriz;

public abstract class Transporte { // Classe Pai
								  //  Utilizada esta classe como Abstract para levar os métodos  de ficha técnica, cálculo de venda, valor com desconto,
								 //   e historia para todos as classes filhas.

	private String  nome;
	private int velocidadeMax;
	private String cor;
	private double peso;
	private double valorCusto;
	private TipoCombustivel combustivel;
	private double fatorLucro; 
	private final double DESCONTO = 0.97; //Este valor será o desconto padrão aplicado à todos os objetos que forem comprados à vista.


	// métodos
		
	public abstract void fichaTecnica(); //	Método que mostrará todos os atributos dos objetos.

	public abstract double valorVenda(); //	Método que calcula o preço de venda dos objetos.
	
	public abstract void historia();	 // Método que conta uma breve história do objeto.
	
	public abstract double valorDesc();  // Método que aplica o fator de desconto da variavel final no valor de venda.
	
		

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
