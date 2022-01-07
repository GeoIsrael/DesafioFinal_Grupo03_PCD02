package br.com.superandolimites.banking.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import br.com.superandolimites.banking.dao.ContaDao;
import br.com.superandolimites.banking.model.Conta;

public class TipoController {
	@Autowired
	private ContaDao dao;
	
	@GetMapping("/tipo")
	public List<Conta> recuperarTodas() {
		return (List<Conta>)dao.findAll();
	}
}
