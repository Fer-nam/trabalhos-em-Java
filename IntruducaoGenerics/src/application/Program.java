package application;

import java.util.Scanner;

import services.PrintService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		PrintService<Integer> ps = new PrintService<>();
		
		System.out.print("Quantos valores? ");
		int n = sc.nextInt();
		
		
		
		for(int i = 0 ; i<n; i++) {
			int value = sc.nextInt();
			ps.addValue(value);
		}
		
		ps.print();
		System.out.print("Primeiro: "+ps.first());
		
		sc.close();
	}

}
