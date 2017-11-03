package listaV.questao1;

public class SanduicheRT extends Sanduiche{

	@Override
	public void ingrediente() {
		
		super.ingredientes = new PaoBola();
		System.out.println(super.ingredientes.ingrediente());
		
		super.ingredientes = new QueijoCheddar();
		System.out.println(super.ingredientes.ingrediente());
		
		super.ingredientes = new PresuntoPeru();
		System.out.println(super.ingredientes.ingrediente());
		
		super.ingredientes = new SaladaSemVerdura();
		System.out.println(super.ingredientes.ingrediente());
	}

	@Override
	public void criarSalada() {
		System.out.println("Sanduiche sem salada.");
		
	}
}
