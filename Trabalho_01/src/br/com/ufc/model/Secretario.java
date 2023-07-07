package br.com.ufc.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

import org.hibernate.validator.NotNull;

@Entity
public class Secretario extends Funcionario {

	private String grauEscolaridade;

	public Secretario() {

	}

	public Secretario(Integer codigo, String nome, String sexo, Date dataAniversario, Double salario,
			String grauEscolaridade) {
		super(codigo, nome, sexo, dataAniversario, salario);
		this.grauEscolaridade = grauEscolaridade;
	}

	public Secretario(Integer codigo, String nome, String sexo, Date dataAniversario, Double salario) {
		super(codigo, nome, sexo, dataAniversario, salario);
	}

	public String getGrauEscolaridade() {
		return grauEscolaridade;
	}

	public void setGrauEscolaridade(String grauEscolaridade) {
		this.grauEscolaridade = grauEscolaridade;
	}

	@Override
	public String toString() {
		return super.toString() + "Secretario [grauEscolaridade=" + grauEscolaridade + "]";
	}

}
