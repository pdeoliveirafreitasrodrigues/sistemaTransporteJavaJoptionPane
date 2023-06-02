package execu;


public class ExecutaObjetos  {

	public static void main(String[] args) {

/*		Este trabalho possui diversos métodos.  Todos os métodos void, ou de qualquer tipo, criados para os objetos foram colocados como abstract na classe pai, 
  		com o objetivo de padronizão de aplicação para todos. Sendo alteradas somente as informações convenientes ao seu tipo.
  		
 * 		O objetivo disto foi para que se crie um padrão de impressão, visto que o criador do sistema viu o trabalho como uma loja que possui 
  		um catáologo de vendas de variados produtos.
  		
 * 		O método História utiliza a classe Jop para que o usuário escolha algum dos produtos criados e veja uma curiosidade sobre o mesmo.
 
  		
 *		Os valores de venda e de desconto foram feitos através de fatores multiplicativos que equivalem à soma ou subtração da porcentagem do valor do produto
 *		onde: (10 * 1.35) = 10 + (10 * 35%)
 
 
 *		Criados três métodos construtores para cada objeto, porém só utilizado o método com todos os atributos na Classe CriaObjetos
		
*/
		
		CriaObjetos co = new CriaObjetos();
		co.catalogo();			
		
	}

}
