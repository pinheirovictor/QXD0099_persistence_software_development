package br.com.ufc.dao.jpa;

import br.com.ufc.dao.EnderecoDAO;
import br.com.ufc.model.Endereco;

public class EnderecoJPADAO extends GenericJPADAO<Endereco> implements EnderecoDAO {

	public EnderecoJPADAO() {
		super(Endereco.class);
	}

}
