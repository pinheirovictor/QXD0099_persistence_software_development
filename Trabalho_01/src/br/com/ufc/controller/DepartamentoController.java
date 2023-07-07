package br.com.ufc.controller;

import java.util.List;

import javax.persistence.PersistenceException;

import br.com.ufc.dao.DepartamentoDAO;
import br.com.ufc.dao.jpa.DepartamentoJPADAO;
import br.com.ufc.model.Departamento;

public class DepartamentoController {

	// metodo adicionar departamento
	public void addDepartamento(String nome) {
		DepartamentoDAO departamentoDAO = new DepartamentoJPADAO();

		try {
			departamentoDAO.beginTransaction();
			departamentoDAO.save(new Departamento(0,nome));
			departamentoDAO.commit();
		} catch (IllegalStateException | PersistenceException e) {
			departamentoDAO.rollback();
			e.printStackTrace();
		} finally {
			try {
				departamentoDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// metodo de remover departamento - que deverás nao é necessário e nem faz
	// sentido existir!
	public void deletarDepartamento(Integer codigo) {
		DepartamentoDAO departamentoDAO = new DepartamentoJPADAO();

		try {
			departamentoDAO.beginTransaction();
			departamentoDAO.delete(departamentoDAO.find(codigo));
			departamentoDAO.commit();
		} catch (IllegalStateException | PersistenceException e) {
			departamentoDAO.rollback();
			e.printStackTrace();
		} finally {
			try {
				departamentoDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// metodo de listar todos os departamentos
	public List<Departamento> buscarDepartamentos() {
		DepartamentoDAO departamentoDAO = new DepartamentoJPADAO();
		return departamentoDAO.findAll();
	}

	// metodo buscar departamento por codigo
	public Departamento buscarDepartamentoPorCodigo(Integer codigo) {
		DepartamentoDAO departamentoDAO = new DepartamentoJPADAO();
		return departamentoDAO.find(codigo);
	}

}
