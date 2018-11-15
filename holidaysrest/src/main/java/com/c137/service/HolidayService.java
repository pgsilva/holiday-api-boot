package com.c137.service;

import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.json.JSONException;
import org.json.JSONObject;
import org.springframework.stereotype.Service;

import com.c137.dto.RequestDTO;
import com.c137.dto.ResponseDTO;
import com.c137.util.DaysofWeek;
import com.c137.util.HolidayJson;
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
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		return json;
	}

	private void calculaDays(LocalDate init, LocalDate finish, ResponseDTO json) throws JSONException, IOException {
		LocalDateUtil util = new LocalDateUtil();
		LocalDate dateAux = init;

		Integer contUtil = 0;
		Integer contSabado = 0;
		Integer contDomingo = 0;
		//List<JSONObject> jHoliday = HolidayJson.readJsonFromUrl(MsgUtil.URL_HOLIDAY_API);
		//System.out.println(jHoliday);
		for (int i = 0; i < util.compareTo(init, finish).intValue(); i++) {
			if (dateAux.plusDays(1).getDayOfWeek().name() == DaysofWeek.SUNDAY.getLabel()) {
				contSabado++;
			} else if (dateAux.plusDays(1).getDayOfWeek().name() == DaysofWeek.MONDAY.getLabel() ) {
				contDomingo++;
			} else if (dateAux.plusDays(1).getDayOfWeek().name() == DaysofWeek.TUESDAY.getLabel()) {
				contUtil++;
			} else if (dateAux.plusDays(1).getDayOfWeek().name() == DaysofWeek.WEDNESDAY.getLabel()) {
				contUtil++;
			} else if (dateAux.plusDays(1).getDayOfWeek().name() == DaysofWeek.THURSDAY.getLabel()) {
				contUtil++;
			} else if (dateAux.plusDays(1).getDayOfWeek().name() == DaysofWeek.FRIDAY.getLabel()) {
				contUtil++;
			} else if (dateAux.plusDays(1).getDayOfWeek().name() == DaysofWeek.SATURDAY.getLabel()) {
				contUtil++;
			} else {

			}
			dateAux = dateAux.plusDays(1);
		}
		json.setTtUteis(contUtil);
		json.setTtDomingos(contDomingo);
		json.setTtSabados(contSabado);

	}

}
