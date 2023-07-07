package br.com.ufc.dao.jpa;

import br.com.ufc.dao.DependenteDAO;
import br.com.ufc.model.Dependente;

public class DependenteJPADAO extends GenericJPADAO<Dependente> implements DependenteDAO {

	public DependenteJPADAO() {
		super(Dependente.class);
	}
}
