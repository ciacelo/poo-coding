package questao1;

public abstract class Lanchonete{ 

	public Sanduiche orderSanduiche(){
		Sanduiche sanduiche = createSanduiche();
		sanduiche.ingrediente();

		sanduiche.criarPao();
		sanduiche.criarQueijo();
		sanduiche.criarPresunto();
		sanduiche.criarSalada();
		return sanduiche;
	}
	
	public abstract Sanduiche createSanduiche();
}
