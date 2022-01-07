package br.com.superandolimites.banking.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.superandolimites.banking.model.Conta;

public interface ContaDao extends CrudRepository<Conta, Integer>{

}