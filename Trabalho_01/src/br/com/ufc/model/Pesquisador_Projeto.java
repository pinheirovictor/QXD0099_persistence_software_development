package br.com.ufc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Pesquisador_Projeto {

	@Id
	@ManyToOne
	@JoinColumn
	private Pesquisador pesquisador;

	@Id
	@ManyToOne
	@JoinColumn
	private Projeto projeto;

	private Integer horasTrabalahdas;

	public Pesquisador_Projeto(Pesquisador pesquisador, Projeto projeto, Integer horasTrabalahdas) {
		super();
		this.pesquisador = pesquisador;
		this.projeto = projeto;
		this.horasTrabalahdas = horasTrabalahdas;
	}

	public Pesquisador getPesquisador() {
		return pesquisador;
	}

	public void setPesquisador(Pesquisador pesquisador) {
		this.pesquisador = pesquisador;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public Integer getHorasTrabalahdas() {
		return horasTrabalahdas;
	}

	public void setHorasTrabalahdas(Integer horasTrabalahdas) {
		this.horasTrabalahdas = horasTrabalahdas;
	}

}
