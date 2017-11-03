package questao2;

public abstract class Lanchonete {

	protected Pao pao;
	protected Queijo queijo;
	protected Presunto presunto;
	protected Salada salada;
	protected SanduichesIngredientFactory sanduichesIngredientes;
	
	public SanduichesIngredientFactory orderSanduiche(SanduichesIngredientFactory sanduichesIngredientes){
		sanduichesIngredientes = criarSanduiche(sanduichesIngredientes);
		Sanduiche sanduiche = new Sanduiche();
		System.out.println("Preparando = ");
		sanduiche.preparar();
		return sanduichesIngredientes;
	}
	
	public abstract SanduichesIngredientFactory criarSanduiche(SanduichesIngredientFactory sanduichesIngredientes);
}
