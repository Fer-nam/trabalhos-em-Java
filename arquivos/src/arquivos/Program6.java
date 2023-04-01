package arquivos;

import java.io.File;
import java.util.Scanner;

public class Program6 {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Entre com o caminho do arquivo");
	String strPath = sc.nextLine();
	
	File path = new File(strPath);
	
	System.out.println("Pegar nome: "+ path.getName());
	System.out.println("Pegar caminho: "+ path.getParent());
	System.out.println("Pega caminho completo: "+ path.getPath());
	
	sc.close();
	
	
}
}