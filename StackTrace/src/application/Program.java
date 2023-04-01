package application;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		
		method1();
		
		System.out.println("Fim do programa");
	

	}
	
	public static void method1() {
		System.out.println("=====Method 1 START=======");
		method2();
		System.out.println("=====Method 1 END=======");
	}
	
	
	public static void method2() {
		
		System.out.println("=====Method 2 START=======");
		Scanner sc = new Scanner(System.in);
		try {
			String[] vect = sc.nextLine().split(" ");
			int position = sc.nextInt();
			System.out.println(vect[position]);
			
			} 
			catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Posição inválida!");
			e.printStackTrace();
			sc.next();
			}
			catch(InputMismatchException e) {
				System.out.println("Erro de entrada!");
			}
		System.out.println("=====Method 2 END=======");
		
		sc.close();	
	}
	
}
