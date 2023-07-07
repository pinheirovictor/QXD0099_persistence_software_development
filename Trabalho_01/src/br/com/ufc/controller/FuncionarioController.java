package br.com.ufc.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.PersistenceException;

import br.com.ufc.dao.DepartamentoDAO;
import br.com.ufc.dao.DependenteDAO;
import br.com.ufc.dao.EnderecoDAO;
import br.com.ufc.dao.FuncionarioDAO;
import br.com.ufc.dao.LimpezaDAO;
import br.com.ufc.dao.PesquisadorDAO;
import br.com.ufc.dao.SecretarioDAO;
import br.com.ufc.dao.jpa.DepartamentoJPADAO;
import br.com.ufc.dao.jpa.DependenteJPADAO;
import br.com.ufc.dao.jpa.EnderecoJPADAO;
import br.com.ufc.dao.jpa.FuncionarioJPADAO;
import br.com.ufc.dao.jpa.LimpezaJPADAO;
import br.com.ufc.dao.jpa.PesquisadorJPADAO;
import br.com.ufc.dao.jpa.SecretarioJPADAO;
import br.com.ufc.model.Departamento;
import br.com.ufc.model.Dependente;
import br.com.ufc.model.Endereco;
import br.com.ufc.model.Funcionario;
import br.com.ufc.model.Limpeza;
import br.com.ufc.model.Pesquisador;
import br.com.ufc.model.Secretario;

public class FuncionarioController {
	// metodo adicionar funcionario pesquisador
	public boolean addPesquisador(String nome, String rua, Integer numeroDaCasa, String cidade, String sexo,
			Date dataAniversario, Double salario, Integer codigoDepartamento, String areaAtuacao) {
		PesquisadorDAO pesquisadorDAO = new PesquisadorJPADAO();
		Endereco enderecoFuncionario = new Endereco(rua, numeroDaCasa, cidade);
		Pesquisador pesquisador = new Pesquisador(0, nome, sexo, dataAniversario, salario, areaAtuacao);
		pesquisador.setEndereco(enderecoFuncionario);

		Departamento departamento = new DepartamentoJPADAO().find(codigoDepartamento);

		try {
			if (departamento != null) {
				pesquisadorDAO.beginTransaction();
				pesquisador.setDepartamento(departamento);
				pesquisadorDAO.save(pesquisador);
				pesquisadorDAO.commit();
				return true;
			}
			return false;
		} catch (IllegalStateException | PersistenceException e) {
			pesquisadorDAO.rollback();
			e.printStackTrace();
		} finally {
			try {
				pesquisadorDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	// metodo adicionar funcionario secretario
	public boolean addSecretario(String nome, String rua, Integer numeroCasa, String cidade, String sexo,
			Date dataAniversario, Double salario, Integer codigoDepartamento, String grauEscolaridade) {
		SecretarioDAO secretarioDAO = new SecretarioJPADAO();
		Endereco enderecoFuncionario = new Endereco(rua, numeroCasa, cidade);
		Secretario secretario = new Secretario(0, nome, sexo, dataAniversario, salario, grauEscolaridade);
		secretario.setEndereco(enderecoFuncionario);

		Departamento departamento = new DepartamentoJPADAO().find(codigoDepartamento);

		try {
			if (departamento != null) {
				secretarioDAO.beginTransaction();
				secretario.setDepartamento(departamento);
				secretarioDAO.save(secretario);
				secretarioDAO.commit();
				return true;
			}
			return false;
		} catch (IllegalStateException | PersistenceException e) {
			secretarioDAO.rollback();
			e.printStackTrace();
		} finally {
			try {
				secretarioDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	// metodo adicionar funcionario de limpeza
	public boolean addFuncionarioLimpeza(String nome, String rua, Integer numeroCasa, String cidade, String sexo,
			Integer codigoDepartamento, Date dataAniversario, Double salario, Integer jornadaTrabalho,
			Integer codigoGerente, String cargo) {

		LimpezaDAO limpezaDAO = new LimpezaJPADAO();
		Endereco enderecoFuncionario = new Endereco(rua, numeroCasa, cidade);
		Limpeza limpeza = new Limpeza(nome, sexo, dataAniversario, salario, jornadaTrabalho, cargo, codigoGerente);
		limpeza.setEndereco(enderecoFuncionario);

		Departamento departamento = new DepartamentoJPADAO().find(codigoDepartamento);

		try {
			if (departamento != null) {
				limpezaDAO.beginTransaction();
				limpeza.setDepartamento(departamento);
				limpezaDAO.save(limpeza);
				limpezaDAO.commit();
				return true;
			}
			return false;
		} catch (IllegalStateException | PersistenceException e) {
			limpezaDAO.rollback();
			e.printStackTrace();
		} finally {
			try {
				limpezaDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	// metodo remover funcionario pesquisador
	public void deletarPesquisador(Integer codigo) {
		PesquisadorDAO pesquisadorDAO = new PesquisadorJPADAO();

		try {
			pesquisadorDAO.beginTransaction();
			pesquisadorDAO.delete(pesquisadorDAO.find(codigo));
			pesquisadorDAO.commit();
		} catch (IllegalStateException | PersistenceException e) {
			pesquisadorDAO.rollback();
			e.printStackTrace();
		} finally {
			try {
				pesquisadorDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// metodo remover funcionario secretario
	public void deletarSecretario(Integer codigo) {
		SecretarioDAO secretarioDAO = new SecretarioJPADAO();

		try {
			secretarioDAO.beginTransaction();
			secretarioDAO.delete(secretarioDAO.find(codigo));
			secretarioDAO.commit();
		} catch (IllegalStateException | PersistenceException e) {
			secretarioDAO.rollback();
			e.printStackTrace();
		} finally {
			try {
				secretarioDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// metodo remover funcionario limpeza
	public void deletarLimpeza(Integer codigo) {
		LimpezaDAO limpezaDAO = new LimpezaJPADAO();
		try {
			limpezaDAO.beginTransaction();
			limpezaDAO.delete(limpezaDAO.find(codigo));
			limpezaDAO.commit();
		} catch (IllegalStateException | PersistenceException e) {
			limpezaDAO.rollback();
			e.printStackTrace();
		} finally {
			try {
				limpezaDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}

	// metodo adicionar departamento aos funcionarios
	public boolean adicionarDependente(Integer numeroFuncDependente, String nomeDependente, String sexo,
			Date dataAniversarioDependente, String grauparentesco) {
		DependenteDAO dependenteDAO = new DependenteJPADAO();
		FuncionarioDAO funcionarioDAO = new FuncionarioJPADAO();
		try {
			Funcionario funcionario = funcionarioDAO.find(numeroFuncDependente);
			if (funcionario != null) {
				dependenteDAO.beginTransaction();
				Dependente dependente = new Dependente(nomeDependente, sexo, dataAniversarioDependente, grauparentesco);
				dependente.setFuncionario(funcionario);
				dependenteDAO.save(dependente);
				dependenteDAO.commit();
				return true;
			} else {
				return false;
			}
		} catch (IllegalStateException | PersistenceException e) {
			dependenteDAO.rollback();
			e.printStackTrace();
		} finally {
			try {
				dependenteDAO.close();
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return false;
	}

	// metodos listar todos
	public List<Funcionario> listarTodosFuncionarios() {
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		for (Funcionario f : listarPesquisador())
			funcionarios.add(f);

		for (Funcionario f : listarSecretario())
			funcionarios.add(f);

		for (Funcionario f : listarLimpeza())
			funcionarios.add(f);

		return funcionarios;
	}

	// metodo listar todos os funcionarios pesquisadores
	public List<Pesquisador> listarPesquisador() {
		PesquisadorDAO pesquisadorDAO = new PesquisadorJPADAO();
		return pesquisadorDAO.findAll();
	}

	// metodo listar todos os funcionarios secretario
	public List<Secretario> listarSecretario() {
		SecretarioDAO secretarioDAO = new SecretarioJPADAO();
		return secretarioDAO.findAll();
	}

	// metodo listar todos os funcionarios secretario
	public List<Limpeza> listarLimpeza() {
		LimpezaDAO limpezaDAO = new LimpezaJPADAO();
		return limpezaDAO.findAll();
	}

	// metodos listar por codigo

	// metodo listar pesquisador por codigo
	public Funcionario buscarPesquisadorPorCodigo(Integer codigo) {
		PesquisadorDAO pesquisadorDAO = new PesquisadorJPADAO();
		return pesquisadorDAO.find(codigo);
	}

	// metodo listar secretario por codigo
	public Funcionario buscarSecretarioPorCodigo(Integer codigo) {
		SecretarioDAO secretarioDAO = new SecretarioJPADAO();
		return secretarioDAO.find(codigo);
	}

	// metodo listar limpeza por codigo
	public Funcionario buscarLimpezaPorCodigo(Integer codigo) {
		LimpezaDAO limpezaDAO = new LimpezaJPADAO();
		return limpezaDAO.find(codigo);
	}
}
