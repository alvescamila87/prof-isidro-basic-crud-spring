package br.com.camila.projetoempresa.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.camila.projetoempresa.dao.DepartamentoDAO;
import br.com.camila.projetoempresa.model.Departamento;

@RestController
public class DepartamentoController {
	
	@Autowired
	private DepartamentoDAO dao;
	
	@GetMapping("/departamentos")
	public ArrayList<Departamento> recuperarTodos(){
		ArrayList<Departamento> departamentos;
		departamentos = (ArrayList<Departamento>)dao.findAll();
		return departamentos;
		
		/*
		 * Modo 2 de fazer
		 * casting
		 * return ArrayList<Departamento>)dao.findAll();
		 */
	}

}
