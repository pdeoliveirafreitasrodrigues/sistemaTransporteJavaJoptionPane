package execu;


import javax.swing.JOptionPane;

import t.tipotransporte.aereo.AviaoCombate;
import t.tipotransporte.aereo.Helicoptero;
import t.tipotransporte.maritmo.BarcoPesca;
import t.tipotransporte.maritmo.Navio;
import t.tipotransporte.matriz.TipoCombustivel;
import t.tipotransporte.terrestre.d.Bmx;
import t.tipotransporte.terrestre.d.Biz;
import t.tipotransporte.terrestre.d.Nxr;
import t.tipotransporte.terrestre.d.Scooter;
import t.tipotransporte.terrestre.q.Camionete;
import t.tipotransporte.terrestre.q.Passeio;

public class CriaObjetos {
	

	//OBJETOS:
	
	AviaoCombate aviaoComb = new AviaoCombate("F35", 1500, "Prata Militar", 2000, 3000396.54, TipoCombustivel.AVGAS, 1.32, 2, "Combate", true, "Tomahawk II");
	Helicoptero heli = new Helicoptero("CH-47", 350, "Rosa choque", 4000, 2000000, TipoCombustivel.AVGAS, 1.40, "Carga pesada", true, "Duplo Sincronizado");
	
	
	Navio nav = new Navio("Titanic", 100, "BRANCO", 5231000, 3950463.99, TipoCombustivel.DIESEL, 1.43, 4000, "Navio de Navegação Costeira");	
	BarcoPesca barc = new BarcoPesca("Lancha VK-900", 90, "Marrom", 500, 4500, TipoCombustivel.GASOLINA, 1.25, 300, "Para pesca profissional");
	
	
	Bmx bmx = new Bmx("BMX Speed Bike", 80, "Vermelho de Corrida", 30, 1000.99, TipoCombustivel.NA, 1.50, "BMX Freestyle", "Arraia Pneus", "Shimano", 15);
	
	
	Biz biz = new Biz("Biz --> Honda", 100, "Azul bebê", 150, 2999, TipoCombustivel.GASOLINA, 1.49, "Zata Pneus", 90, 26, 100, false);
	Nxr bros = new Nxr("Bros", 110, "Preto", 160, 5986.35, TipoCombustivel.FLEX, 1.36, "BomPneu", false, 29, 160, true);
	
	
	Scooter scoot = new Scooter("JAK-500", 130, "Branco Pérola", 200, 35000, TipoCombustivel.ENERGIA, 1.47, "Pneus DE Scooter", true, 26, 300);
		
	
	Camionete cami = new Camionete("L200", 200, "Camuflado", 1000, 89000.485, TipoCombustivel.DIESEL, 1.10, "TrackWood", "Carroceria aberta", "Tração nas quatro rodas", 2);
	Passeio car = new Passeio("Chevette Biturbo com 70 cv de puro consumo", 300, "Rosa perolado", 700, 67000, TipoCombustivel.ETANOL, 1.50, "Michelan", false, "Tração traseira", 4);

	
	
	//Pula e constrói uma linha no catálogo
	private void pulaLinha() {
		System.out.println("");
		System.out.println("--------------------------------------------------------------------------");
		System.out.println("");
	}
	
	
	
	//Este método irá mostrar uma breve história de alguns produtos disponíveis no catálogo.
	private void mostraHistoria() {
	
		int numAux;		
	do {	
		
	numAux = JOptionPane.showConfirmDialog(null,"Deseja ver a história de algum meio de transporte?",
		          "Deseja ver a história de algum meio de transporte?",JOptionPane.YES_NO_OPTION);
	
	switch(numAux) {
		case 0:
		
			Object[] itens = { "Avião de Combate", "Helicoptero", "Barco", "Navio", "Biz", "NXR", "BMX", "Scooter", "Carro", "Camionete" };
			Object selectedValue = JOptionPane.showInputDialog(null, "Escolha um item", "Opçao", JOptionPane.INFORMATION_MESSAGE, null, itens, itens [0]); 
			
			if (selectedValue == "Avião de Combate") {
				aviaoComb.historia();
				aviaoComb.fichaTecnica();
			}else if (selectedValue == "Helicoptero" ) {
				heli.historia();
			}else if (selectedValue == "Barco") {
				barc.historia();
			}else if(selectedValue == "Navio") {
				nav.historia();
			}else if(selectedValue == "Biz") {
				biz.historia();
			}else if(selectedValue == "NXR") {
				bros.historia();
			}else if(selectedValue == "BMX") {
				bmx.historia();
			}else if(selectedValue == "Scooter") {
				scoot.historia();
			}else if(selectedValue == "Carro") {
				car.historia();
			}else if(selectedValue == "Camionete") {
				cami.historia();
			};
		
			break;
	
		case 1:
			
		break;	
		}
	
	 } while(numAux == 0);
	
	}
		
	
	
	//Catálogo que mostrará todos os itens disponíveis 
	public void catalogo() {
		
		//Objetos
		
		System.out.println("CATÁLOGO DE PRODUTOS");
		
pulaLinha();
		
		
		System.out.println("AERONAVES");
		System.out.println("");
					
			aviaoComb.fichaTecnica();
						
		
pulaLinha();
		
			
			heli.fichaTecnica();
		
		
pulaLinha();
			
		
		System.out.println("BARCOS E NAVIOS");
		System.out.println("");

		
			nav.fichaTecnica();
			
			
pulaLinha();	
			
			barc.fichaTecnica();
		
pulaLinha();	

		System.out.println("Veículos de duas Rodas");
		System.out.println("");
		
		System.out.println("Bicicletas: ");
		System.out.println("");

		
			bmx.fichaTecnica();
		
			
		System.out.println("");
		System.out.println("Motos: ");
		System.out.println("");
	
			
			biz.fichaTecnica();
			
			
		System.out.println("");	
		System.out.println("");	

			
			bros.fichaTecnica();
		
			
		System.out.println("");
		System.out.println("Scooters: ");
		System.out.println("");

			
			scoot.fichaTecnica();
			
			
pulaLinha();

		System.out.println("Veículos de quatro Rodas");
		System.out.println("");

			
			cami.fichaTecnica();
			
			
		System.out.println("");	
		System.out.println("");	

			
			car.fichaTecnica();
		
		
pulaLinha();		
		
		mostraHistoria();
			
	}	

}
