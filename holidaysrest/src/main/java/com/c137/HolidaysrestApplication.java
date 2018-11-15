package com.c137;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Holiday Api 
 * Gerador de prazos em diferentes datas, calcula a quantidade de dias uteis, sabados, domingos,
 * dias corridos e feriados entre elas.
 * 
 * @author paulog
 *
 */
@SpringBootApplication
public class HolidaysrestApplication {

	public static void main(String[] args) {
		SpringApplication.run(HolidaysrestApplication.class, args);
	}
}
