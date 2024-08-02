package br.com.camila.projetoempresa.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.camila.projetoempresa.model.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer>{
	
	// consultas customizadas

}
