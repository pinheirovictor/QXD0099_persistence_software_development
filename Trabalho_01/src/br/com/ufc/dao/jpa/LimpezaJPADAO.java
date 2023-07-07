package br.com.ufc.dao.jpa;

import br.com.ufc.dao.LimpezaDAO;
import br.com.ufc.model.Limpeza;

public class LimpezaJPADAO extends GenericJPADAO<Limpeza> implements LimpezaDAO {

	public LimpezaJPADAO() {
		super(Limpeza.class);
	}
}
