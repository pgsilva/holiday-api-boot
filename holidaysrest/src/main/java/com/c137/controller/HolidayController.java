package com.c137.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.c137.dto.RequestDTO;
import com.c137.dto.ResponseDTO;
import com.c137.service.HolidayService;

@RestController
@Transactional
@CrossOrigin
public class HolidayController {

	@Autowired
	private HolidayService holiService;

	@Transactional
	@RequestMapping(method = RequestMethod.POST, value = "/api/postDate")
	public ResponseEntity<ResponseDTO> verificaFita(@RequestBody RequestDTO post) {
		try {
			ResponseDTO form = holiService.validaRequest(post);
			return new ResponseEntity<>(form, HttpStatus.OK);
		} catch (Exception e) {
			e.printStackTrace();
 			return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
