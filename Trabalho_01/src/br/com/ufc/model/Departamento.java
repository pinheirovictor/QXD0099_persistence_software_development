package br.com.ufc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.hibernate.validator.NotNull;

@Entity
public class Departamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;

	@NotNull
	private String nome;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "departamento")
	private List<Funcionario> funcionarios;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "departamento")
	private List<Projeto> projetos;

	public Departamento() {
		this.funcionarios = new ArrayList<Funcionario>();
		this.projetos = new ArrayList<Projeto>();
	}

	public Departamento(Integer codigo, String nome) {
		this.codigo = codigo;
		this.nome = nome;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(List<Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	@Override
	public String toString() {
		return "Departamento [codigo=" + codigo + ", nome=" + nome + "]";
	}

}
