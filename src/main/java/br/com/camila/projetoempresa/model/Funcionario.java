package br.com.camila.projetoempresa.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="funcionario")
@JsonIgnoreProperties("listaFuncionarios")
public class Funcionario {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "num_funcional", nullable = false)
	private Integer numFuncional;
	
	@Column(name="nome", nullable = false, length = 100)	
	private String nome;
	
	@Column(name="email", nullable = false, length = 100, unique = true)
	private String email;
	
	@Column(name="salario")
	private Double salario;
	
	/**
	 * REFERÊNCIA DE OBJETO PARA DEPARTAMENTO:
	 * Não é atributo, mas sim FK de Departamento, sendo uma 
	 * referência de departamento ao qual o Funcionário pertence.
	 * Isso torna o objeto relacionável com outros
	 */	
	@ManyToOne
	@JoinColumn(name="numero_id")
	@JsonIgnoreProperties("listaFuncionarios")
	private Departamento depto;

	public Integer getNumFuncional() {
		return numFuncional;
	}

	public void setNumFuncional(Integer numFuncional) {
		this.numFuncional = numFuncional;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return depto;
	}

	public void setDepartamento(Departamento departamento) {
		this.depto = departamento;
	}
	
	
	
}
