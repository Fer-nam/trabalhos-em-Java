package Application;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		
		
		//Imprime a data atual
		LocalDate d01 = LocalDate.now();
		
		//Imprime data atual + horário
		LocalDateTime d02 = LocalDateTime.now();
		
		//Imprime data atual e hora atual com timezone em Londres
		Instant d03 = Instant.now();
		
		//Imprime data em tipo objeto
		LocalDate d04 = LocalDate.parse("2022-01-20");
		
		//Imprime data atual e hora atual em tipo Objeto
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d08 = LocalDate.parse("20/07/2022", fmt1);
		
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30",fmt2);
		
		
		LocalDate d10 = LocalDate.of(2022, 7, 20);
		
		LocalDateTime d11 = LocalDateTime.of(2022, 7,20,1,30);
		
		 System.out.println("D01 = " + d01);
		 System.out.println("D02 = " + d02);
		 System.out.println("D03 = " + d03);
		 System.out.println("D04 = " + d04);
		 System.out.println("D05 = " + d05);
		 System.out.println("D06 = " + d06);
		 System.out.println("D07 = " + d07);
		 System.out.println("D08 = " + d08);
		 System.out.println("D09 = " + d09);
		 System.out.println("D10 = "+ d10);
		 System.out.println("D11 = "+ d11);
		
		 
		 ;
	}

}
