package application;

import devices.ComboDevice;
import devices.ConcretePrinter;
import devices.ConcreteScanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ConcretePrinter p = new ConcretePrinter("1080");
		p.processDoc("Minha carta");
		p.print("Minha carta");
		
		ConcreteScanner s = new ConcreteScanner("2003");
		System.out.println();
		s.processDoc("Meu email");
		System.out.println("Resultado do Scan: "+ s.scan());
		
		ComboDevice c = new ComboDevice("2001");
		
		System.out.println();
		c.processDoc("Minha dissertação");
		c.print("Minha dissertação");
		System.out.println("Resultado do scan: "+ c.scan());
	}

}
