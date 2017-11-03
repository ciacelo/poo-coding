package questao1;

public abstract class Sanduiche {

	protected Ingredientes ingredientes;
	
	public abstract void ingrediente();
	
	public void criarPao(){
		System.out.println("Colocar pão");
		
	}
	public void criarQueijo(){
		System.out.println("acrescentar queijo");
	}
	
	public void criarPresunto(){
		System.out.println("e o presunto");
	}
	
	public abstract void criarSalada();
	

}
