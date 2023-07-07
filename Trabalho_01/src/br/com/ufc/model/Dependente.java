package br.com.ufc.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.NotNull;

@Entity
public class Dependente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer codigo;
	
	private String nome;
	private String sexo;
	
	@Temporal(TemporalType.DATE)
	private Date dataAniversario;
	
	private String grauParentesco;

	@ManyToOne
	@JoinColumn(name = "codigo_funcionario")
	private Funcionario funcionario;

	public Dependente() {

	}

	public Dependente(Integer codigo, String nome, String sexo, Date dataAniversario, String grauParentesco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
		this.grauParentesco = grauParentesco;
	}

	public Dependente(String nome, String sexo, Date dataAniversario, String grauParentesco) {
		this(0,nome,sexo,dataAniversario,grauParentesco);
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

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Date getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(Date dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public String getGrauParentesco() {
		return grauParentesco;
	}

	public void setGrauParentesco(String grauParentesco) {
		this.grauParentesco = grauParentesco;
	}

	public Funcionario getFuncionario() {
		return funcionario;
	}

	public void setFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public String toString() {
		return "Dependente [codigo=" + codigo + ", nome=" + nome + ", sexo=" + sexo + ", dataAniversario="
				+ dataAniversario + ", grauParentesco=" + grauParentesco + "]";
	}

}
