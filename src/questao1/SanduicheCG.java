package questao1;

public class SanduicheCG extends Sanduiche{
	
	@Override
	public void ingrediente() {
		
		super.ingredientes = new PaoIntegral();
		System.out.println(super.ingredientes.ingrediente());
		
		super.ingredientes = new QueijoPrato();
		System.out.println(super.ingredientes.ingrediente());
		
		super.ingredientes = new PresuntoFrango();
		System.out.println(super.ingredientes.ingrediente());
		
		super.ingredientes = new SaladaSemVerdura();
		System.out.println(super.ingredientes.ingrediente());
	}

	@Override
	public void criarSalada() {
		System.out.println("Sanduiche sem verdura.");
		
	}
}
