package br.com.superandolimites.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import br.com.superandolimites.banking.dao.ContaDao;
import br.com.superandolimites.banking.model.Conta;

@RestController
public class ContaController {
	@Autowired
	private ContaDao dao;
	
	@GetMapping ("/contas")
	public List<Conta> recuperarTodas() {
		return (List<Conta>)dao.findAll();
	}
	@GetMapping("/contas/{numero}")
	public Conta recuperarPeloNumero (@PathVariable int numero) {
		return dao.findById(numero).orElse(null);
	}
}
