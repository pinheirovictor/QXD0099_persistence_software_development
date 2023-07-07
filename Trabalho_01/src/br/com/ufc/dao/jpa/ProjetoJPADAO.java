package br.com.ufc.dao.jpa;

import br.com.ufc.dao.ProjetoDAO;
import br.com.ufc.model.Projeto;

public class ProjetoJPADAO extends GenericJPADAO<Projeto> implements ProjetoDAO {

	public ProjetoJPADAO() {
		super(Projeto.class);
	}

}
