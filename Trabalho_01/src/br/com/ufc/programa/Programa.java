package br.com.ufc.programa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import br.com.ufc.controller.DepartamentoController;
import br.com.ufc.controller.FuncionarioController;
import br.com.ufc.controller.ProjetoController;
import br.com.ufc.model.Departamento;
import br.com.ufc.model.Funcionario;

public class Programa {

	private static void menuPrincipal() {

		System.out.println("####################################");
		System.out.println("##                                ##");
		System.out.println("##          SEJA BEM-VINDO        ##");
		System.out.println("##                                ##");
		System.out.println("####################################");
		System.out.println("##                                ##");
		System.out.println("##              MENU              ##");
		System.out.println("##                                ##");
		System.out.println("##++++++++++++++++++++++++++++++++##");
		System.out.println("##                                ##");
		System.out.println("##     [0] Sair                   ##");
		System.out.println("##     [1] Departamentos          ##");
		System.out.println("##     [2] Funcionarios           ##");
		System.out.println("##     [3] Projetos               ##");
		System.out.println("##                                ##");
		System.out.println("####################################");

	}

	private static void menuDerpatamento() {

		System.out.println("####################################");
		System.out.println("##                                ##");
		System.out.println("##         DEPARTAMENTOS          ##");
		System.out.println("##                                ##");
		System.out.println("##++++++++++++++++++++++++++++++++##");
		System.out.println("##                                ##");
		System.out.println("##     [0] Voltar                 ##");
		System.out.println("##     [1] Adcionar               ##");
		System.out.println("##     [2] Remover                ##");
		System.out.println("##     [3] Listar Departamentos   ##");
		System.out.println("##     [4] Buscar Departamento    ##");
		System.out.println("##                                ##");
		System.out.println("####################################");
	}

	private static void menuFuncionario() {

		System.out.println("####################################");
		System.out.println("##                                ##");
		System.out.println("##          FUNCIONARIOS          ##");
		System.out.println("##                                ##");
		System.out.println("##++++++++++++++++++++++++++++++++##");
		System.out.println("##                                ##");
		System.out.println("##     [0] Voltar                 ##");
		System.out.println("##     [1] Adcionar               ##");
		System.out.println("##     [2] Remover                ##");
		System.out.println("##     [3] Listar Funcionarios    ##");
		System.out.println("##     [4] Buscar Funcionario     ##");
		System.out.println("##     [5] Adcionar Dependente    ##");
		System.out.println("##                                ##");
		System.out.println("####################################");
	}

	private static void menuProjeto() {

		System.out.println("####################################");
		System.out.println("##                                ##");
		System.out.println("##            PROJETOS            ##");
		System.out.println("##                                ##");
		System.out.println("##++++++++++++++++++++++++++++++++##");
		System.out.println("##                                ##");
		System.out.println("##     [0] Voltar                 ##");
		System.out.println("##     [1] Adcionar               ##");
		System.out.println("##     [2] Remover                ##");
		System.out.println("##     [3] Listar Projetos        ##");
		System.out.println("##     [4] Buscar Projeto         ##");
		System.out.println("##     [5] Adicionar Pesquisador  ##");
		System.out.println("##                                ##");
		System.out.println("####################################");
	}

	private static void menuAddDepartamento() {

		System.out.println("####################################");
		System.out.println("##                                ##");
		System.out.println("##     Adcionar Departamento      ##");
		System.out.println("##++++++++++++++++++++++++++++++++##");
		System.out.println("##   EX.: nome                    ##");
		System.out.println("##++++++++++++++++++++++++++++++++##");

	}

	@SuppressWarnings("resource")
	public static void main(String[] args) throws ParseException {
		boolean executando = true;
		Scanner scanner = new Scanner(System.in);

		/*
		 * while (executando) { menuPrincipal();
		 * 
		 * String opcaoMenuPrincipal = scanner.nextLine(); switch (opcaoMenuPrincipal) {
		 * 
		 * case "0": executando = false; System.out.println("Saindo..."); break;
		 * 
		 * // menu de departamentos case "1": menuDerpatamento(); String
		 * opcaoMenuDeDepartamentos = scanner.nextLine();
		 * 
		 * switch (opcaoMenuDeDepartamentos) { case "0":
		 * System.out.println("Voltando..."); break;
		 * 
		 * case "1": System.out.println("Informe o nome do departamento: ");
		 * 
		 * String nome = scanner.nextLine(); new
		 * DepartamentoController().addDepartamento(nome);
		 * System.out.println("Departamento salvo com sucesso"); break;
		 * 
		 * case "2": System.out.println("Informe o código do departamento: ");
		 * 
		 * try { Integer codigo = Integer.parseInt(scanner.nextLine()); new
		 * DepartamentoController().deletarDepartamento(codigo); } catch
		 * (NumberFormatException e) {
		 * System.out.println("O numero informado não é valido!"); }
		 * 
		 * System.out.println("Departamento removido com sucesso"); break;
		 * 
		 * case "3": List<Departamento> departamentos = new
		 * DepartamentoController().buscarDepartamentos(); for (Departamento
		 * departamento : departamentos) { System.out.println(departamento); }
		 * 
		 * break;
		 * 
		 * case "4": System.out.println("Informe o numero do departamento: ");
		 * 
		 * try { Integer codigo = Integer.parseInt(scanner.nextLine()); Departamento
		 * departamento = new
		 * DepartamentoController().buscarDepartamentoPorCodigo(codigo);
		 * 
		 * System.out.println(departamento); } catch (NumberFormatException e) {
		 * System.out.println("O numero informado não e valido!"); }
		 * 
		 * break;
		 * 
		 * default: System.out.println("Opção inválida"); break; } break; // menu de
		 * funcionarios } } scanner.close();
		 */

		/*
		 * int codigo = Integer.parseInt(scanner.nextLine()); String nomeDependente =
		 * scanner.nextLine(); String sexoDependente = scanner.nextLine(); Date
		 * dataAniversarioDependente = new
		 * SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine()); String
		 * grauParentesco = scanner.nextLine();
		 * 
		 * new FuncionarioController().adicionarDependente(codigo, nomeDependente,
		 * sexoDependente, dataAniversarioDependente, grauParentesco);
		 * 
		 * System.out.println("certo!!!");
		 */

		/*
		 * String nome = scanner.nextLine(); new
		 * DepartamentoController().addDepartamento(nome);
		 */

		/*
		 * System.out.println("Informe o nome do funcionario: "); String nomeFuncionario
		 * = scanner.nextLine();
		 * 
		 * System.out.println("Informe a rua do funcionario: "); String ruaFuncionario =
		 * scanner.nextLine();
		 * 
		 * System.out.println("Informe o numero da casa do funcionario: "); Integer
		 * numeroCasaFuncionario = 0; try { numeroCasaFuncionario =
		 * Integer.parseInt(scanner.nextLine()); } catch (NumberFormatException e) {
		 * 
		 * System.out.println("O numero informado nao e valido"); }
		 * 
		 * System.out.println("Informe a cidade do funcionario: "); String
		 * cidadeFuncionario = scanner.nextLine();
		 * 
		 * System.out.println("Informe o sexo do funcionario: "); String sexoFuncionario
		 * = scanner.nextLine();
		 * 
		 * System.out.
		 * println("Informe a data de aniversario(nascimento) do funcionario: "); Date
		 * dataAniversarioFuncionario = new
		 * SimpleDateFormat("dd/MM/yyyy").parse(scanner.nextLine());
		 * 
		 * System.out.println("Informe o salario do funcionario: "); Double
		 * salarioFuncionario = Double.parseDouble(scanner.nextLine());
		 * 
		 * System.out.println("Informe o codigo do departamento: "); int
		 * codigoDepartamento = Integer.parseInt(scanner.nextLine());
		 * 
		 * System.out.println("Informe a area de atuacao do pesquisador: "); String
		 * areaAtuacaoPesquisador = scanner.nextLine();
		 * 
		 * new FuncionarioController().addPesquisador(nomeFuncionario, ruaFuncionario,
		 * numeroCasaFuncionario, cidadeFuncionario, sexoFuncionario,
		 * dataAniversarioFuncionario, salarioFuncionario, codigoDepartamento,
		 * areaAtuacaoPesquisador);
		 */

		System.out.println("Informe o nome do projeto: ");
		String nomeProjeto = scanner.nextLine();

		System.out.println("Informe o tempo do projeto: ");
		Integer tempoProjeto = Integer.parseInt(scanner.nextLine());

		System.out.println("Informe o numero do departamento ao qual o projeto pertence: ");
		Integer numeroDepartamentoProjeto = Integer.parseInt(scanner.nextLine());

		new ProjetoController().addProjeto(nomeProjeto, tempoProjeto, numeroDepartamentoProjeto);

		System.out.println("Projeto salvo com sucesso");

		System.out.println("ok");

		/*
		 * System.out.
		 * println("Informe a jornada de trabalho em horas do funcionario de limpeza: "
		 * ); Integer jornadaTrabalhoFuncionarioLimpeza =
		 * Integer.parseInt(scanner.nextLine());
		 * 
		 * System.out.println("Informe o cargo do funcionario de limpeza: "); String
		 * cargo = scanner.nextLine();
		 */

		/*
		 * System.out.println("Informe a ID do gerente: "); Integer
		 * idGerenteFuncionarioLimpeza = Integer.parseInt(scanner.nextLine());
		 */

		// System.out.println("Funcionario de limpeza salvo com sucesso");

		/*
		 * new FuncionarioController().addFuncionarioLimpeza(nomeFuncionario,
		 * ruaFuncionario, numeroCasaFuncionario, cidadeFuncionario, sexoFuncionario,
		 * dataAniversarioFuncionario, salarioFuncionario,
		 * jornadaTrabalhoFuncionarioLimpeza, idGerenteFuncionarioLimpeza, cargo);
		 */

		/*
		 * System.out.println("Informe o grau de escolaridade: "); String
		 * grauEscolaridade = scanner.nextLine();
		 */

		/*
		 * new FuncionarioController().addSecretario(nomeFuncionario, ruaFuncionario,
		 * numeroCasaFuncionario, cidadeFuncionario, sexoFuncionario,
		 * dataAniversarioFuncionario, salarioFuncionario, grauEscolaridade);
		 */

		// System.out.println(new FuncionarioController().listarPesquisador());
		// System.out.println(new FuncionarioController().listarSecretario());
		// System.out.println(new FuncionarioController().listarLimpeza());

//		for (Funcionario f : new FuncionarioController().listarTodosFuncionarios()) {
//			System.out.println(f);
//			System.out.println("\n");
//
//		}
	}

}
