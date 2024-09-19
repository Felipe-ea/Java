package aplication;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Program {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		
		LocalDate d01 = LocalDate.now();
		LocalDateTime d02 = LocalDateTime.now();
		Instant d03 = Instant.now();
		
		LocalDate d04 = LocalDate.parse("2022-07-20");
		LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26");
		
		Instant d06 = Instant.parse("2022-07-20T01:30:26-03:00");
		
		LocalDate d07 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		LocalDateTime d08 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));
		
		LocalDate d09 = LocalDate.of(2022, 07,20);
		LocalDateTime d10 = LocalDateTime.of(2022, 07, 20, 01, 30);
		
		System.out.println("Data Local: " + d01);
		System.out.println("Data-hora Local: " + d02);
		System.out.println("Data-hora Global: " + d03);
		
		System.out.println();
		
		System.out.println("Data ISO: " + d04);
		System.out.println("Data-hora ISO: " + d05);
		
		System.out.println();
		
		System.out.println("Data-hora ISO com alteração de fuso: " + d06);
		
		System.out.println();
		
		System.out.println("Data com formato customizado: " + d07);
		System.out.println("Data-hora com formato customizado: " + d08);
		
		System.out.println();
		
		System.out.println("Data com dados isolados: " + d09);
		System.out.println("Data-hora com dados isolados: " + d10);

	}

}
