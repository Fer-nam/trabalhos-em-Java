package application;

import java.util.Scanner;

import entities.BrazilInterestService;
import entities.InterestService;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantidde: ");
		double amount = sc.nextDouble();
		System.out.println("Meses");
		int months = sc.nextInt();
		
		InterestService is = new BrazilInterestService(2.0);
		double payment = is.payment(amount, months);
		
		System.out.println("Pagamento depois de: " + months + " Meses");
		System.out.println(String.format("%.2f", payment));
		
		sc.close();
	}

}
