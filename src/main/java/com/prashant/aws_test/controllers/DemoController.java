package com.prashant.aws_test.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/*
 * @Created 19/04/2023
 * @Author Prashant Barnwal
 */
@RestController
public class DemoController {
	@GetMapping(value = "/product")
	public ResponseEntity<String> getProduct()
	{
		return new ResponseEntity<>("Hello World!", HttpStatus.OK);
	}
}
