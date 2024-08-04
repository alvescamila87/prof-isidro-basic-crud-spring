package br.com.camila.projetoempresa.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.camila.projetoempresa.model.Funcionario;

public interface FuncionarioDAO extends CrudRepository<Funcionario, Integer>{

}
