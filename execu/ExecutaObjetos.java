package execu;


public class ExecutaObjetos  {

	public static void main(String[] args) {

/*		Este trabalho possui diversos m�todos.  Todos os m�todos void, ou de qualquer tipo, criados para os objetos foram colocados como abstract na classe pai, 
  		com o objetivo de padroniz�o de aplica��o para todos. Sendo alteradas somente as informa��es convenientes ao seu tipo.
  		
 * 		O objetivo disto foi para que se crie um padr�o de impress�o, visto que o criador do sistema viu o trabalho como uma loja que possui 
  		um cat�ologo de vendas de variados produtos.
  		
 * 		O m�todo Hist�ria utiliza a classe Jop para que o usu�rio escolha algum dos produtos criados e veja uma curiosidade sobre o mesmo.
 
  		
 *		Os valores de venda e de desconto foram feitos atrav�s de fatores multiplicativos que equivalem � soma ou subtra��o da porcentagem do valor do produto
 *		onde: (10 * 1.35) = 10 + (10 * 35%)
 
 
 *		Criados tr�s m�todos construtores para cada objeto, por�m s� utilizado o m�todo com todos os atributos na Classe CriaObjetos
		
*/
		
		CriaObjetos co = new CriaObjetos();
		co.catalogo();			
		
	}

}
