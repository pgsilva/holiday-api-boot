package com.c137.util;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import org.apache.el.parser.ParseException;

public class LocalDateUtil {
	public LocalDateUtil() {}
	
	public LocalDate convertDate(String datainput) throws ParseException {
		DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate localDate_1 = LocalDate.parse(datainput, formatter_1);
		return localDate_1;
	}

	public LocalDate addDay(LocalDate init, int qtd) {
		LocalDate finish = init.plusDays(qtd);

		return finish;
	}

	public Long compareTo(LocalDate init, LocalDate finish) {
		Long daysDiference = init.until(finish, ChronoUnit.DAYS);
		return daysDiference;
	}

}
