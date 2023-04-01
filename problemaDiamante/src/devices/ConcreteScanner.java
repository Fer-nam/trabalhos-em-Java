package devices;

public  class ConcreteScanner extends Device  implements Scanner {

	public ConcreteScanner(String serialNumber) {
		super(serialNumber);
	}
	
	@Override
	public void processDoc(String doc) {
		System.out.println("Processando scaneamento: "+ doc);
		
	}
	
	
	@Override
	public String scan() {
		return "Conteudo scaneado";
	}
	
}
