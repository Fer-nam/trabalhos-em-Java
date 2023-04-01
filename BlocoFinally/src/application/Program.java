package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		File file = new File("c:\\temp\\in.txt");
		Scanner sc = new Scanner(System.in);
		try {
			sc = new Scanner(file);
			while(sc.hasNextLine()) {
				System.out.println(sc.nextLine());
			}
		}
		catch(FileNotFoundException e) {
			System.out.println("Erro em abrir o arquivo: "+ e.getMessage());
		} 
		finally {
			if(sc!= null) {
				sc.close();
			}
			System.out.println("Finally bloco executado");
		}
	}

}
