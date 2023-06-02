package t.tipotransporte.maritmo;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

import t.tipotransporte.matriz.TipoCombustivel;
import t.tipotransporte.matriz.TransporteMaritmo;

public class Navio extends TransporteMaritmo {

	
	DecimalFormat deci = new DecimalFormat("000,000.00");
	
	private String tipoembarcacao;
	
	// Navio de Navegação Oceânica - Adequadas para navegar sem limite de área (Tipo A)
	// Navio de Navegação ao Largo - Adequadas para navegar ao largo até 200 milhas da costa (Tipo B)
	// Navio de Navegação Costeira - Adequadas para navegação costeira até 60 milhas de um porto de abrigo e 25 da costa (Tipo C1)
	// Navio de Navegação Costeira restrita - Adequadas para navegação costeira até 20 milhas de um porto de abrigo e 6 da costa (Tipo C2)
	// Navio de Navegação em Águas Abrigadas - Adequadas para navegar junto à costa e em águas interiores num raio de 3 milhas de um porto de abrigo (Tipo D). 
	
	
		//Construtor padrão
		public Navio() {
			
		}
		
		//Construtor só da classe 
		public Navio(String tipoEmbarc) {
			super();
			this.setTipoembarcacao(tipoEmbarc);		
		}	
		
		
		//Construtor dos atributos
		public Navio(String nome, int velocidade, String cor, double peso, double valorCusto, TipoCombustivel combustivel, double fatorLucro,
							int arqueacao, String tipoEmbarc ) {
			
			setNome(nome);
			setVelocidadeMax(velocidade);
			setCor(cor);
			setPeso(peso);
			setValorCusto(valorCusto);
			setCombustivel(combustivel);
			setFatorLucro(fatorLucro);
			
			setArqueacao(arqueacao);

			
			this.tipoembarcacao = tipoEmbarc;
			
		}
		
		
		
		
		
		
		
		
		
		
	
	
//Ficha técnica	
public void fichaTecnica() {	
		
	System.out.println("Nome/Modelo: " + getNome() + 
							"\nArqueação: " + getArqueacao() + "m³" + 
								"\nTipo de embarcação: " + getTipoembarcacao() + 
									"\nCor: " + getCor() + 
										"\nPeso do Navio: " + getPeso() + "Kg" + 
											"\nVelocidade Máxima: " + getVelocidadeMax() + "Km/h" + 
												"\nCombustivel utilizado: " + getCombustivel() + 
													"\nValor de venda: R$" + (deci.format(valorVenda())) + 
														"\nValor à vista com desconto: R$" + deci.format(valorDesc())); }
	
	


public double valorVenda() {
	return getValorCusto() * getFatorLucro();	// getFatorLucro envia o fator de multiplicação definido na classe CriaObjetos	
}




public void historia() {
	JOptionPane.showMessageDialog(null, "O desenvolvimento do navio a vapor foi um processo complexo, o primeiro navio comercial de sucesso foi o 'North River Steamboat' "
										+ "\n(também chamado de \"Clermont\") creditado a Robert Fulton, nos EUA em 1807. "
										+ "\nEm seguida surgiu na Europa em 1812 o PS Comet de 45 pés de comprimento.");
}


//Venda Com desconto

public double valorDesc() {
	return valorVenda() * getDESCONTO(); // getDesconto envia o fator de multiplicação definido na classe CriaObjetos
}

	
	//Getter and Setter
	
	public String getTipoembarcacao() {
		return tipoembarcacao;
	}

	public void setTipoembarcacao(String tipoembarcacao) {
		this.tipoembarcacao = tipoembarcacao;
	} 
	
}
