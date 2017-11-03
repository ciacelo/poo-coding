package questao2;

public class LanchoneteJP extends Lanchonete{
	

	public SanduichesIngredientFactory criarSanduiche(SanduichesIngredientFactory sanduichesIngredientes){
		
		sanduichesIngredientes = new SanduichesIngredientFactoryJP(); 
		
		System.out.println("Ingredientes");
		System.out.println(sanduichesIngredientes.createPao().descricao());
		System.out.println(sanduichesIngredientes.createQueijo().descricao());
		System.out.println(sanduichesIngredientes.createPresunto().descricao());
		System.out.println(sanduichesIngredientes.createSalada().descricao());
		return sanduichesIngredientes;
	}
}
