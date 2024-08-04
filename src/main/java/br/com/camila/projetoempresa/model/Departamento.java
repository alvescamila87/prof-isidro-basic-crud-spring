package br.com.camila.projetoempresa.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="departamento")
public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="numero_id")
	private Integer numeroId;
	
	@Column(name="nome", nullable = false, length = 100)	
	private String nome;
	
	@Column(name="andar", nullable = false)
	private Integer andar;
	
	/*
	 * Permite recuperar a lista de fucionarios daquele departamento.
	 * mappedBy idenfifica o atributo na classe funcionário que
	 * mapeia a classe departamento pelo atributo 'depto'
	 * 
	 * cascade: se departamento for removido, remove os funcionarios 
	 * relacionados também àquele departamento
	 */	
	@OneToMany(mappedBy = "depto", cascade = CascadeType.ALL)	
	@JsonIgnoreProperties("depto")
	private List<Funcionario> listaFuncionarios;

	public Integer getNumeroId() {
		return numeroId;
	}

	public void setNumeroId(Integer numeroId) {
		this.numeroId = numeroId;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getAndar() {
		return andar;
	}

	public void setAndar(Integer andar) {
		this.andar = andar;
	}

	public List<Funcionario> getListaFuncionarios() {
		return listaFuncionarios;
	}

	public void setListaFuncionarios(List<Funcionario> listaFuncionarios) {
		this.listaFuncionarios = listaFuncionarios;
	}
	
	
	
}
