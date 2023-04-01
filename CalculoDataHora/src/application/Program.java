package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		Instant d06 = Instant.parse("2022-07-20T01:30:26Z");
		
		
		LocalDate pastweekLocalDate = d04.minusDays(7);
		LocalDate nextWeekLocalDate = d04.plusDays(7);
		
		System.out.println("pastweekLocalDate = "+ pastweekLocalDate);
		System.out.println("nextWeekLocalDate = "+ nextWeekLocalDate);
		
		
		LocalDateTime pastweekLocalDateTime = d05.minusDays(7);
		LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);
		
		System.out.println("pastweekLocalDateTime = "+ pastweekLocalDateTime);
		System.out.println("nextWeekLocalDateTime = "+ nextWeekLocalDateTime);

		
		Instant pastweekInstant = d06.minus(7,ChronoUnit.DAYS);
		Instant nextweekInstant = d06.plus(7,ChronoUnit.DAYS);

		
		System.out.println("pastweekInstant = "+ pastweekInstant);
		System.out.println("nextweekInstant = "+ nextweekInstant);

		Duration t1 = Duration.between(pastweekLocalDate.atStartOfDay(),d04.atTime(0,0));
		Duration t2 = Duration.between(pastweekLocalDateTime, d05);
		Duration t3 = Duration.between(pastweekInstant, d06);
		Duration t4 = Duration.between( d06,pastweekInstant);
		
		System.out.println("T1 dias = " + t1.toDays());
		System.out.println("T2 dias = " + t2.toDays());
		System.out.println("T3 dias = " + t3.toDays());
		System.out.println("T4 dias = " + t4.toDays());
		
		
		
		
		
	}

}
