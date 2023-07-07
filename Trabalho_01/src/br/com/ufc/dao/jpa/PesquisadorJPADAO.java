package br.com.ufc.dao.jpa;

import br.com.ufc.dao.PesquisadorDAO;
import br.com.ufc.model.Pesquisador;

public class PesquisadorJPADAO extends GenericJPADAO<Pesquisador> implements PesquisadorDAO {

	public PesquisadorJPADAO() {
		super(Pesquisador.class);
	}
}
