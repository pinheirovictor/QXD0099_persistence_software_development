package br.com.ufc.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.validator.NotNull;

@Entity
public class Pesquisador extends Funcionario {

	@NotNull
	private String areaAtuacao;

	/*
	 * @ManyToMany(cascade = CascadeType.ALL)
	 * 
	 * @JoinTable(name = "pesquisador_projeto", joinColumns = @JoinColumn(name =
	 * "codigo_pesquisador"), inverseJoinColumns = @JoinColumn(name =
	 * "codigo_projeto"))
	 */
	@OneToMany(mappedBy = "pesquisador", cascade = CascadeType.ALL)
	private List<Projeto> projetos;

	public Pesquisador() {

	}

	public Pesquisador(Integer codigo, String nome, String sexo, Date data_aniversario, Double salario,
			String area_atuacao) {
		super(codigo, nome, sexo, data_aniversario, salario);
		this.areaAtuacao = area_atuacao;
	}

	public String getAreaAtuacao() {
		return areaAtuacao;
	}

	public void setAreaAtuacao(String areaAtuacao) {
		this.areaAtuacao = areaAtuacao;
	}

	@Override
	public String toString() {
		return super.toString() + "Pesquisador [areaAtuacao=" + areaAtuacao + "]";
	}

}
