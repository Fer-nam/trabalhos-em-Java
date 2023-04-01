package Aplicacao;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import model.entidades.AluguelCarro;
import model.entidades.Veiculo;
import model.servicos.BrazilTaxServices;
import model.servicos.RentalServices;

public class Programa {

	public static void main(String[] args) {
		
		Scanner sc =  new Scanner(System.in);
		
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		System.out.println("Entre com os dados do aluguel: ");
		System.out.print("Modelo do carro: ");
		String carModel = sc.nextLine();
		System.out.println("Retirda (dd/MM/yyyy hh:mm)");
		LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
		System.out.println("Retorno (dd/MM/yyyy hh:mm)");
		LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
		

		AluguelCarro ac = new AluguelCarro(start, finish, new Veiculo(carModel));
		
		
		System.out.println("Entre com o preço por hora: ");
		double pricePerHour = sc.nextDouble();
		System.out.println(" Entre com o preço por dia: ");
		double pricePerDay = sc.nextDouble();
		
		RentalServices rentalServices = new RentalServices(pricePerHour, pricePerDay, new BrazilTaxServices());
		
		rentalServices.processinvoce(ac);
		
		System.out.println("Fatura: ");
		System.out.println("Pagamento basico: " + ac.getFatura().getBasicPayment());
		System.out.println("Imposto: " + ac.getFatura().getTax());
		System.out.println("Pagamento total: "+ac.getFatura().getTotalPayment());
		
		sc.close();
	}

}
