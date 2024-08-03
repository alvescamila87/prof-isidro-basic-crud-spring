package br.com.camila.projetoempresa.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.camila.projetoempresa.model.Departamento;

public interface DepartamentoDAO extends CrudRepository<Departamento, Integer>{
	
	// consultas customizadas
	
	public List<Departamento> findByOrderByNome();
	
	public List<Departamento> findByAndar(Integer andar);
	
	public List<Departamento> findByOrderByNomeDesc();
	
	public List<Departamento> findByOrderByNumeroIdDesc();
	
	// public List<Departamento> findByNumeroIdAndAndar(Integer numeroId, Integer andar);
	
	public List<Departamento> findByNumeroIdOrAndar(Integer numeroId, Integer andar);

}
