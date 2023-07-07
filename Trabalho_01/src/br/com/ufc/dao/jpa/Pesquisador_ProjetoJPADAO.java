package br.com.ufc.dao.jpa;

import br.com.ufc.dao.Pesquisador_ProjetoDAO;
import br.com.ufc.model.Pesquisador;
import br.com.ufc.model.Pesquisador_Projeto;

public class Pesquisador_ProjetoJPADAO extends GenericJPADAO<Pesquisador_Projeto> implements Pesquisador_ProjetoDAO{
	
	public Pesquisador_ProjetoJPADAO() {
		super(Pesquisador_Projeto.class);
	}
}
