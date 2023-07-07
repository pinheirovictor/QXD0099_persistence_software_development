package br.com.ufc.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.hibernate.validator.NotEmpty;
import org.hibernate.validator.NotNull;

@Entity
public class Endereco {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "codEnd")
	private Integer codigo;

	private String rua;

	private Integer numero;

	private String cidade;

	public Endereco() {

	}

	public Endereco(String rua, Integer numero, String cidade) {
		this(0, rua, numero, cidade);
	}

	public Endereco(Integer codigo, String rua, Integer numero, String cidade) {
		super();
		this.codigo = codigo;
		this.rua = rua;
		this.numero = numero;
		this.cidade = cidade;
	}

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	@Override
	public String toString() {
		return "Endereco [codigo=" + codigo + ", rua=" + rua + ", numero=" + numero + ", cidade=" + cidade + "]";
	}

}
