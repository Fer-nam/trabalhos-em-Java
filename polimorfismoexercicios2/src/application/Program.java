package application;

import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		List<Product> list = new ArrayList<>();
		
		System.out.print("Entre com o número de produtos: ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			System.out.println("Dados do " +i +"º produto:");
			System.out.print("Comum, Usado ou Importado? (c/u/i) ");
			char resp = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Preço: ");
			double price = sc.nextDouble();
			
			if(resp == 'c') {
				list.add(new Product(name, price));
			 
			} else if(resp == 'u') {
				
				System.out.println("Data de fabricação (dd/mm/yyyy): ");
				LocalDate date =  LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("dd/MM/yyyy"));
				list.add(new UsedProduct(name, price, date));
				
			} else {
				
				System.out.print("Taxa da alfandega: ");
				double customfee = sc.nextDouble();
				 list.add(new ImportedProduct(name, price, customfee));
				
			}
			
			
			System.out.println();
			System.out.println("Tabela de preços: ");
			for(Product prod : list) {
				System.out.println(prod.priceTag());
				
			}
			
			

		}

		sc.close();
	}

}
