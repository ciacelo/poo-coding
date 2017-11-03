package questao1;

public class SanduicheJP extends Sanduiche{
	
	@Override
	public void ingrediente() {
		
		super.ingredientes = new PaoFrances();
		System.out.println(super.ingredientes.ingrediente());
		
		super.ingredientes = new QueijoMussarela();
		System.out.println(super.ingredientes.ingrediente());
		
		super.ingredientes = new PresuntoFrango();
		System.out.println(super.ingredientes.ingrediente());
		
		super.ingredientes = new SaladaComVerdura();
		System.out.println(super.ingredientes.ingrediente());
	}

	@Override
	public void criarSalada() {
		System.out.println("Sanduiche com verdura.");
		
	}
}
