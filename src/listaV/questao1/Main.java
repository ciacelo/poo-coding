package listaV.questao1;

public class Main {
	
	public static void main(String args[]){
		
		Lanchonete lanchonete = null;	
		
		System.out.println("MENU LANCHONETE:\n");
		
		System.out.println("Lanchonete em João Pessoa");
		lanchonete = new LanchoneteJP();
		lanchonete.orderSanduiche();
	
		System.out.println("\nLanchonete em Rio Tinto");
		lanchonete = new LanchoneteRT();
		lanchonete.orderSanduiche();

		System.out.println("\nLanchonete em Campina Grande");
		lanchonete = new LanchoneteCG();
		lanchonete.orderSanduiche();		
	}
}
