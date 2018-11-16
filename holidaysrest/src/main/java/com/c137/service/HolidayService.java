package com.c137.service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;

import org.json.JSONException;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.c137.dto.HolidayJsonDTO;
import com.c137.dto.RequestDTO;
import com.c137.dto.ResponseDTO;
import com.c137.util.DaysofWeek;
import com.c137.util.LocalDateUtil;
import com.c137.util.MsgUtil;

@Service
public class HolidayService {

	public ResponseDTO validaRequest(RequestDTO form) {
		LocalDateUtil util = new LocalDateUtil();
		ResponseDTO json = new ResponseDTO();
		if (form.getDiasSeguidos() != null) {
			String sInit = form.getsDateInit();
			DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate init = LocalDate.parse(sInit, formatter_1);

			LocalDate finish = util.addDay(init, form.getDiasSeguidos());
			json.setTtCorridos(util.compareTo(init, finish).intValue());
			try {
				calculaDays(init, finish, json);
			} catch (JSONException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}

		}
		return json;
	}

	private void calculaDays(LocalDate init, LocalDate finish, ResponseDTO json) throws JSONException, IOException {
		HolidayJsonDTO[] holi = feriadosJson(MsgUtil.URL_HOLIDAY_API);

		LocalDateUtil util = new LocalDateUtil();
		LocalDate dateAux = init;
		LocalDate dateFinish = init;

		Integer contUtil = 0;
		Integer contSabado = 0;
		Integer contDomingo = 0;
		Integer contFeriados = 0;
		for (int i = 0; i < util.compareTo(init, finish).intValue(); i++) {
			if (dateAux.getDayOfWeek().name() == DaysofWeek.SUNDAY.getLabel()) {
				contDomingo++;
				// verifica os feriados, fiz na mao pq estava com sono na hr ai foi soh copy
				// paste
				for (HolidayJsonDTO h : holi) {
					DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					String hdate = h.getDate();
					LocalDate lholi = LocalDate.parse(hdate, formatter_1);
					if ((lholi.getDayOfMonth() == dateAux.getDayOfMonth())
							&& (lholi.getMonthValue() == dateAux.getMonthValue())) {
						contFeriados++;
					}
				}
			} else if (dateAux.getDayOfWeek().name() == DaysofWeek.MONDAY.getLabel()) {
				Boolean noHoliday = false;
				for (HolidayJsonDTO h : holi) {
					DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					String hdate = h.getDate();
					LocalDate lholi = LocalDate.parse(hdate, formatter_1);
					if ((lholi.getDayOfMonth() == dateAux.getDayOfMonth())
							&& (lholi.getMonthValue() == dateAux.getMonthValue())) {
						contFeriados++;
					} else {
						noHoliday = Boolean.TRUE.booleanValue();
					}
				}
				if (Boolean.TRUE.equals(noHoliday)) {
					contUtil++;
					dateFinish = dateFinish.plusDays(1);
				}

			} else if (dateAux.getDayOfWeek().name() == DaysofWeek.TUESDAY.getLabel()) {
				Boolean noHoliday = false;
				for (HolidayJsonDTO h : holi) {
					DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					String hdate = h.getDate();
					LocalDate lholi = LocalDate.parse(hdate, formatter_1);
					if ((lholi.getDayOfMonth() == dateAux.getDayOfMonth())
							&& (lholi.getMonthValue() == dateAux.getMonthValue())) {
						contFeriados++;
					} else {
						noHoliday = Boolean.TRUE.booleanValue();
					}
				}
				if (Boolean.TRUE.equals(noHoliday)) {
					contUtil++;
					dateFinish = dateFinish.plusDays(1);
				}

			} else if (dateAux.getDayOfWeek().name() == DaysofWeek.WEDNESDAY.getLabel()) {
				Boolean noHoliday = false;
				for (HolidayJsonDTO h : holi) {
					DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					String hdate = h.getDate();
					LocalDate lholi = LocalDate.parse(hdate, formatter_1);
					if ((lholi.getDayOfMonth() == dateAux.getDayOfMonth())
							&& (lholi.getMonthValue() == dateAux.getMonthValue())) {
						contFeriados++;
					} else {
						noHoliday = Boolean.TRUE.booleanValue();
					}
				}
				if (Boolean.TRUE.equals(noHoliday)) {
					contUtil++;
					dateFinish = dateFinish.plusDays(1);
				}

			} else if (dateAux.getDayOfWeek().name() == DaysofWeek.THURSDAY.getLabel()) {
				Boolean noHoliday = false;
				for (HolidayJsonDTO h : holi) {
					DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					String hdate = h.getDate();
					LocalDate lholi = LocalDate.parse(hdate, formatter_1);
					if ((lholi.getDayOfMonth() == dateAux.getDayOfMonth())
							&& (lholi.getMonthValue() == dateAux.getMonthValue())) {
						contFeriados++;
					} else {
						noHoliday = Boolean.TRUE.booleanValue();
					}
				}
				if (Boolean.TRUE.equals(noHoliday)) {
					contUtil++;
					dateFinish = dateFinish.plusDays(1);
				}

			} else if (dateAux.getDayOfWeek().name() == DaysofWeek.FRIDAY.getLabel()) {
				Boolean noHoliday = false;
				for (HolidayJsonDTO h : holi) {
					DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					String hdate = h.getDate();
					LocalDate lholi = LocalDate.parse(hdate, formatter_1);
					if ((lholi.getDayOfMonth() == dateAux.getDayOfMonth())
							&& (lholi.getMonthValue() == dateAux.getMonthValue())) {
						contFeriados++;
					} else {
						noHoliday = Boolean.TRUE.booleanValue();
					}
				}
				if (Boolean.TRUE.equals(noHoliday)) {
					contUtil++;
					dateFinish = dateFinish.plusDays(1);
				}


			} else if (dateAux.getDayOfWeek().name() == DaysofWeek.SATURDAY.getLabel()) {
				contSabado++;
				for (HolidayJsonDTO h : holi) {
					DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
					String hdate = h.getDate();
					LocalDate lholi = LocalDate.parse(hdate, formatter_1);
					if ((lholi.getDayOfMonth() == dateAux.getDayOfMonth())
							&& (lholi.getMonthValue() == dateAux.getMonthValue())) {
						contFeriados++;
					}
				}
			} else {
				// nao implementei nadadateFinish = dateFinish.plusDays(1);
			}
			dateAux = dateAux.plusDays(1);
		}
		json.setTtUteis(contUtil);
		json.setTtDomingos(contDomingo);
		json.setTtSabados(contSabado);
		json.setTtFeriados(contFeriados);
		DateTimeFormatter formatter_1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		json.setDataFinal(dateFinish.format(formatter_1));

	}

	private HolidayJsonDTO[] feriadosJson(String url) {
		try {
			RestTemplate restTemplate = new RestTemplate();
			HttpHeaders headers = new HttpHeaders();
			headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
			headers.add("user-agent",
					"Mozilla/5.0 (Windows NT 10.0; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/54.0.2840.99 Safari/537.36");
			HttpEntity<String> entity = new HttpEntity<String>("parameters", headers);
			ResponseEntity<HolidayJsonDTO[]> response = restTemplate.exchange(url, HttpMethod.GET, entity,
					HolidayJsonDTO[].class);
			HolidayJsonDTO[] holi = response.getBody();
			return holi;
		} catch (Exception ex) {
			ex.printStackTrace();
			return null;
		}
	}

}
