package br.com.ufc.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.validator.NotNull;

@Entity
public class Limpeza extends Funcionario {

	private Integer jornadaTrabalho;
	private String cargo;
	private int codigoGerente;

	public Limpeza(Integer codigo, String nome, String sexo, Date dataAniversario, Double salario,
			Integer jornadaTrabalho, String cargo) {
		super(codigo, nome, sexo, dataAniversario, salario);
		this.jornadaTrabalho = jornadaTrabalho;
		this.cargo = cargo;
	}

	public Limpeza(String nome, String sexo, Date dataAniversario, Double salario, Integer jornadaTrabalho,
			String cargo, int codigoGerente) {
		super(0, nome, sexo, dataAniversario, salario);
		this.jornadaTrabalho = jornadaTrabalho;
		this.cargo = cargo;
		this.codigoGerente = codigoGerente;
	}

	public Limpeza() {

	}

	public Integer getJornadaTrabalho() {
		return jornadaTrabalho;
	}

	public void setJornadaTrabalho(Integer jornadaTrabalho) {
		this.jornadaTrabalho = jornadaTrabalho;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}

	public int getCodigoGerente() {
		return codigoGerente;
	}

	public void setCodigoGerente(int codigoGerente) {
		this.codigoGerente = codigoGerente;
	}

	@Override
	public String toString() {
		return super.toString() + "Limpeza [jornadaTrabalho=" + jornadaTrabalho + ", cargo=" + cargo + ", codigoGerente=" + codigoGerente
				+ "]";
	}

}
