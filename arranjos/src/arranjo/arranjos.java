package arranjo;

import java.util.Scanner;
import entidade.produto;

public class arranjos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		produto[] prod = new produto[n];
		
		for ( int i = 0; i<n; i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double valor = sc.nextDouble();
			
			prod[i] = new produto(nome,valor);
			
		}
		double soma = 0.0;
		for(int i =0;i<n;i++) {
			soma += prod[i].getValor();
		}
		double media = soma/n;
		
	System.out.printf("Preço médio = %.2f%n ", media);
	
	sc.close();
		}
	
		
		
	}


