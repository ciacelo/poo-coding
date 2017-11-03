package listaV.questao2;

public class LanchoneteCG extends Lanchonete{

	
	public SanduichesIngredientFactory criarSanduiche(SanduichesIngredientFactory sanduichesIngredientes){

		sanduichesIngredientes = new SanduichesIngredientFactoryCG(); 

		System.out.println("Ingredientes: ");
		System.out.println(sanduichesIngredientes.createPao().descricao());
		System.out.println(sanduichesIngredientes.createQueijo().descricao());
		System.out.println(sanduichesIngredientes.createPresunto().descricao());
		System.out.println(sanduichesIngredientes.createSalada().descricao());
		return sanduichesIngredientes;
	}
}
