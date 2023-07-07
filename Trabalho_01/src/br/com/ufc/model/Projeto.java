package br.com.ufc.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.NotNull;

@Entity
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer cod_projeto;

	private String nome;

	@NotEmpty
	private Integer tempo;

	@ManyToOne
	@JoinColumn(name = "codigo_departamento")
	private Departamento departamento;

	//@ManyToMany()
	//@JoinTable(name = "pesquisador_projeto", joinColumns = @JoinColumn(name = "pesquisador_codigo"), inverseJoinColumns = @JoinColumn(name = "projeto_codigo"))
	@OneToMany(mappedBy = "projeto", cascade = CascadeType.ALL)
	private List<Pesquisador> pesquisadores;

	public Projeto() {
		this.pesquisadores = new ArrayList<Pesquisador>();
	}

	public Projeto(String nome, Integer tempo) {
		this.nome = nome;
		this.tempo = tempo;
	}

	public Projeto(Integer codigo, String nome, Integer tempo, Departamento departamento) {
		super();
		this.cod_projeto = codigo;
		this.nome = nome;
		this.tempo = tempo;
		this.departamento = departamento;
		// this.pesquisadores = new ArrayList<Pesquisador>();
	}

	public Projeto(String nome, Integer tempo, Departamento departamento) {
		this(0, nome, tempo, departamento);
	}

	public Integer getCodigo() {
		return cod_projeto;
	}

	public void setCodigo(Integer codigo) {
		this.cod_projeto = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTempo() {
		return tempo;
	}

	public void setTempo(Integer tempo) {
		this.tempo = tempo;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	@Override
	public String toString() {
		return "Projeto [codigo=" + cod_projeto + ", nome=" + nome + ", tempo=" + tempo + ", departamento="
				+ departamento + "]";
	}

}
