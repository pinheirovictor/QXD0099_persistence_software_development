package br.com.ufc.model;

import java.util.ArrayList;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.validator.NotEmpty;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public abstract class Funcionario {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer codigo;
	private String nome;
	private String sexo;

	@Temporal(TemporalType.DATE)
	private Date dataAniversario;

	@NotEmpty
	private Double salario;

	@ManyToOne
	@JoinColumn(name = "codigo_departamento")
	private Departamento departamento;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Dependente> dependentes;

	@OneToOne(cascade = CascadeType.ALL)
	private Endereco endereco;

	public Funcionario() {
		this.dependentes = new ArrayList<Dependente>();
	}

	public Funcionario(String nome, String sexo, Date dataAniversario, Double salario, Departamento departamento,
			Endereco endereco) {
		this(0, nome, sexo, dataAniversario, salario, departamento, endereco);
	}

	public Funcionario(Integer codigo, String nome, String sexo, Date dataAniversario, Double salario,
			Departamento departamento, Endereco endereco) {
		this.codigo = codigo;
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
		this.salario = salario;
		this.departamento = departamento;
		this.dependentes = new ArrayList<Dependente>();
		this.endereco = endereco;
	}

	public Funcionario(Integer codigo, String nome, String sexo, Date dataAniversario, Double salario) {
		this.codigo = codigo;
		this.nome = nome;
		this.sexo = sexo;
		this.dataAniversario = dataAniversario;
		this.salario = salario;
		this.dependentes = new ArrayList<Dependente>();
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

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public List<Dependente> getDependentes() {
		return dependentes;
	}

	public void setDependentes(List<Dependente> dependentes) {
		this.dependentes = dependentes;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	@Override
	public String toString() {
		return "Funcionario [codigo=" + codigo + ", nome=" + nome + ", sexo=" + sexo + ", dataAniversario="
				+ dataAniversario + ", salario=" + salario + ", departamento=" + departamento + ", endereco=" + endereco
				+ "]" + "\n";

	}

}
