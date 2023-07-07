package br.com.ufc.controller;

import java.util.List;
import javax.persistence.PersistenceException;

import br.com.ufc.dao.PesquisadorDAO;
import br.com.ufc.dao.ProjetoDAO;
import br.com.ufc.dao.jpa.PesquisadorJPADAO;
import br.com.ufc.dao.jpa.ProjetoJPADAO;
import br.com.ufc.model.Departamento;
import br.com.ufc.model.Pesquisador_Projeto;
import br.com.ufc.model.Projeto;

public class ProjetoController {

	// metodo adicionar projetos
	public void addProjeto(String nome, Integer tempo, Integer codigoDepartamento) {
		ProjetoDAO projetoDAO = new ProjetoJPADAO();
		Departamento departamento = new DepartamentoController().buscarDepartamentoPorCodigo(codigoDepartamento);

		try {
			projetoDAO.beginTransaction();
			projetoDAO.save(new Projeto(nome, tempo, departamento));
			projetoDAO.commit();

		} catch (IllegalStateException | PersistenceException e) {
			projetoDAO.rollback();

			e.printStackTrace();
		} finally {
			try {
				projetoDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	public boolean addPesquisadorAoProjeto(Integer codigoPesquisador, Integer codigoProjeto) {
		ProjetoDAO projetoDAO = new ProjetoJPADAO();
		PesquisadorDAO pesquisadorDAO = new PesquisadorJPADAO();
		PesquisadorDAO pesquisador_projetoDAO = new PesquisadorJPADAO();

		//pesquisador_projetoDAO.find();
		
		return false;
	}

	// medodo remover projetos
	public void deletarProjeto(Integer codigo) {
		ProjetoDAO projetoDAO = new ProjetoJPADAO();

		try {
			projetoDAO.beginTransaction();
			projetoDAO.delete(projetoDAO.find(codigo));
			projetoDAO.commit();
		} catch (IllegalStateException | PersistenceException e) {
			projetoDAO.rollback();

			e.printStackTrace();
		} finally {
			try {
				projetoDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// metodo listar todos projetos
	public List<Projeto> buscarProjetos() {
		ProjetoDAO projetoDAO = new ProjetoJPADAO();
		return projetoDAO.findAll();
	}

	// metodo bsucar projeto por codigo
	public Projeto buscarProjetoPorCodigo(Integer codigo) {
		ProjetoDAO projetoDAO = new ProjetoJPADAO();
		return projetoDAO.find(codigo);
	}
}
