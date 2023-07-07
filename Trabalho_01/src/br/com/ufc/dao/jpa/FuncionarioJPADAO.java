package br.com.ufc.dao.jpa;

import br.com.ufc.dao.FuncionarioDAO;
import br.com.ufc.model.Funcionario;

public class FuncionarioJPADAO extends GenericJPADAO<Funcionario> implements FuncionarioDAO {

	public FuncionarioJPADAO() {
		super(Funcionario.class);
	}

}
