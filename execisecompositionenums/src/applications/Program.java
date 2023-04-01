package applications;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat fmt = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);		
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String name = sc.nextLine();
		System.out.print("Entre com o email do cliente: ");
		String email = sc.nextLine();
		System.out.print("Data de nascimento (dd/mm/aaaa) ");
		Date birthDate = fmt.parse(sc.next());
		
		Client client = new Client(name, email, birthDate);
		
		System.out.println("Entre com o status do pedido: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());
		
		System.out.print("Quanto items esse pedido vai ter? ");
		int n = sc.nextInt();
		
		Order order = new Order(new Date(),status , client);
		
		for(int i=0; i<n; i++) {
			System.out.println("Entre com os dados do pedido "+(i+1)+"Nº");
			System.out.print("Nome do Produto: ");
			sc.nextLine();
			String ProductName = sc.nextLine();
			System.out.print("Preço do produto: ");
			double productPrice = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantity = sc.nextInt();
			
			Product prod = new Product(ProductName, productPrice);
			
			OrderItem it = new OrderItem(quantity,productPrice,prod);
			
			order.addItem(it);
		}
		
		System.out.println();
		System.out.println(order);
		
		sc.close();
		
		
	}

}
