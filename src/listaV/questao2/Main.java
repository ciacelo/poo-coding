package listaV.questao2;

public class Main {
	
	public static void main(String args[]){

	Lanchonete lanchonete = null;
	
	System.out.println("Rio Tinto:\n");
	lanchonete = new LanchoneteRT();
	lanchonete.orderSanduiche(new SanduichesIngredientFactoryRT());

	System.out.println("\nJoão Pessoa:\n");
	lanchonete = new LanchoneteJP();
	lanchonete.orderSanduiche(new SanduichesIngredientFactoryJP());
	
	System.out.println("\nCampina Grande:\n");
	lanchonete = new LanchoneteCG();
	lanchonete.orderSanduiche(new SanduichesIngredientFactoryCG());
	
	}
}
