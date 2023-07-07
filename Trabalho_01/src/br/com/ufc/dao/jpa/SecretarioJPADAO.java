package br.com.ufc.dao.jpa;

import br.com.ufc.dao.SecretarioDAO;
import br.com.ufc.model.Secretario;

public class SecretarioJPADAO extends GenericJPADAO<Secretario> implements SecretarioDAO {

	public SecretarioJPADAO() {
		super(Secretario.class);
	}
}
