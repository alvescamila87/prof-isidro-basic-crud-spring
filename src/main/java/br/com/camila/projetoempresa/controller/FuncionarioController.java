package br.com.camila.projetoempresa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.camila.projetoempresa.dao.FuncionarioDAO;
import br.com.camila.projetoempresa.model.Funcionario;

@RestController
public class FuncionarioController {
	
	@Autowired
	private FuncionarioDAO dao;
	
	@GetMapping("/testefuncionario")
	public Funcionario recuperarTeste() {
		Funcionario teste = dao.findById(1).get();
		return teste;
	}
	
	@GetMapping("/todos")
	public ArrayList<Funcionario> recuperarTodos(){
		/*
		ArrayList<Funcionario> funcionarios;		
		funcionarios = (ArrayList<Funcionario>)dao.findAll();
		return funcionarios;
		*/
		
		return (ArrayList<Funcionario>)dao.findAll();
	}

}
