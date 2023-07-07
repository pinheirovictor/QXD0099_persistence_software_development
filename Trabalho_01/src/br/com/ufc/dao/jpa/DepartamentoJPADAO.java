package br.com.ufc.dao.jpa;

import br.com.ufc.dao.DepartamentoDAO;
import br.com.ufc.model.Departamento;

public class DepartamentoJPADAO extends GenericJPADAO<Departamento> implements DepartamentoDAO {
	public DepartamentoJPADAO() {
		super(Departamento.class);
	}
}
