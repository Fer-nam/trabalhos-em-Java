package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Set<Student> set = new HashSet<>();
		
		System.out.print("Quantos estudantes para o curso A? " );
		int n = sc.nextInt();
		for(int i=0; i< n; i++) {
			int code = sc.nextInt();
			set.add(new Student(code));
		}
		System.out.print("Quantos estudantes para o curso B? " );
		n = sc.nextInt();
		for(int i=0; i< n; i++) {
			int code = sc.nextInt();
			set.add(new Student(code));
		}
		System.out.print("Quantos estudantes para o curso C? " );
		n = sc.nextInt();
		for(int i=0; i< n; i++) {
			int code = sc.nextInt();
			set.add(new Student(code));
		}
		
		System.out.println("Total de Alunos: " +set.size());
		
		
		sc.close();
		
		
	}

}
