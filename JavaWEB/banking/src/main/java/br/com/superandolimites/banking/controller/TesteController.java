package br.com.superandolimites.banking.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TesteController {
	@GetMapping("/teste")
	public String digaOi() {
		return "Olá, Mundo";
	}
}
