package aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Department;
import entities.HourContract;
import entities.Worker;
import entities.enums.WorkerLevel;


public class Program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub

		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.print("Entre com o nome departamento: ");
		String departamentName = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Nome: ");
		String workerName = sc.nextLine();
		System.out.print("Nível: ");
		String workerLevel = sc.nextLine();
		System.out.print("Salário base: ");
		double baseSalary = sc.nextDouble();
		
		Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departamentName));
		
		System.out.print("Quantos Contratos tem esse trabalhador? ");
		int n = sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			System.out.println("Entre com o número de contrato " + i +"# e data:  " );
			System.out.print("Data (DD/MM/YYYY");
			Date contractDate = sdf.parse(sc.next());
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			System.out.print("Entre com a duração: ");
			int hours = sc.nextInt();
			HourContract contract = new HourContract(contractDate,valuePerHour,hours);
			worker.addContract(contract);
		}
		
		System.out.println();
		System.out.print("Entre com o mês e o ano para calcular o salário: (mm/yyyy)");
		String monthAndYear = sc.next();
		int month = Integer.parseInt(monthAndYear.substring(0,2));
		int year = Integer.parseInt(monthAndYear.substring(3));
		
		System.out.println("Nome: " + worker.getName());
		System.out.println("Departamento: "+worker.getDepartment().getName());
		System.out.println("Salário para: "+monthAndYear+": "+ String.format("%.2f",worker.income(year, month)));
		
		sc.close();
	}

}
