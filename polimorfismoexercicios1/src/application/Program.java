package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutSourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Entre com o número de empregados ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			System.out.println("Funcionário #"+i);
			System.out.print("Funcionário terceirizado? (S/N) ");
			char resp = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Horas trabalhadas: ");
			int hours = sc.nextInt();
			System.out.print("Valor por hora: ");
			double valuePerHour = sc.nextDouble();
			if(resp == 's') {
				System.out.print("Taxas adicionais: ");
				double tax = sc.nextDouble();	
				list.add(new OutSourcedEmployee(name, hours, valuePerHour, tax));
			}
			else{
			
			list.add(new Employee(name, hours, valuePerHour));
			}
		}
		
		System.out.println();
		System.out.println("Pagamentos: ");
		
		for(Employee emp : list) {
		System.out.println(emp.getName()+ "- $"+String.format("%.2f",emp.payment()));
			
		}
		
		
	}

}
