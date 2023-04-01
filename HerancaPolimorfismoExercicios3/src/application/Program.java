package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Person;
import entities.PessoFisica;
import entities.PessoaJuridica;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		List<Person> list = new ArrayList<>();
		
		System.out.print("Entre com o número de pessoas: ");
		int n = sc.nextInt();
		
		for(int i = 1; i<=n; i++) {
			System.out.println("Dados da pessoa #"+i);
			System.out.print("Pessoa Física ou Pessoa Juridica: (i/c)");
			char ch = sc.next().charAt(0);
			System.out.print("Nome: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Renda anual: ");
			double anualIncome = sc.nextDouble();
			
			if(ch == 'i') {
				System.out.print("Gasto anual com saúde: ");
				double health = sc.nextDouble();
				
				list.add(new PessoFisica(name, anualIncome, health));
			} else{
				System.out.print("Quantidade de funcionários: ");
				int employeeQtd = sc.nextInt();
				
				list.add(new PessoaJuridica(name, anualIncome,  employeeQtd));
			}
		}
		
		System.out.println();
		System.out.println("Impostos pago: ");
		
		double sum = 0.0;
		for(Person person : list) {
			sum += person.tax();
			System.out.println(person.getName()+": $"
					+ String.format("%.2f", person.tax()));
		}
		
		System.out.println("Total de impostos pagos: " + sum);
		sc.close();
	}

}
