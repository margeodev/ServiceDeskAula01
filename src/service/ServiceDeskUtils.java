package service;

import java.util.Scanner;

public class ServiceDeskUtils {
	
	public static void iniciarSistema() {
		exibeMenu();
		Scanner entrada = new Scanner(System.in);
		int opcao = entrada.nextInt();
		carregarOpcoes(opcao);
		carregarTecnicos();
		carregarAtendentes();
		entrada.close();
	}
	

	private static void carregarAtendentes() {
		AtendenteService.carregaAtendentes();		
	}


	private static void carregarTecnicos() {
		TecnicoService.carregarTecnicos();
	}


	private static void exibeMenu() {
		System.out.println("|-------------------------------------------------|");
		System.out.println("|============ SERVICE DESK ATENDIMENTO ===========|");
		System.out.println("|-------------------------------------------------|");
		System.out.println("| 1 para cadastrar um novo cliente.               |");
		System.out.println("| 2 para listar os clientes cadastrados           |");
		System.out.println("| 3 para cadastrar um novo atendimento            |");
		System.out.println("| 4 para listar os atendimentos                   |");
		System.out.println("| 5 para resolver OS                              |");
		System.out.println("| 6 para Exibir o Histórico                       |");
		System.out.println("| 7 para sair                                     |");
		System.out.println("|_________________________________________________|");
	}
	
	
	private static void carregarOpcoes(int opcao) {
		switch (opcao) {
		case 1:
			ClienteService.cadastrarCliente();
			iniciarSistema();
			break;
		case 2:
			ClienteService.listarClientes();
			iniciarSistema();
			break;
		case 3:
			cadastrarNovoAtendimento();
			break;
//		case 4:
//			listarAtendimentos();
//			break;
//		case 5:
//			resolverOS();
//			break;
//		case 6:
//			exibirHistorico();
//			break;
		case 7:
			sair();
			return;
		default:
			exibeOpcaoErrada();


		}
	}

	private static void sair() {
		System.out.println("Obrigado por utilizar o nosso sistema.");
	}

	private static void exibeOpcaoErrada() {
		System.out.println("Opção Inválida!");
		iniciarSistema();
	}

	private static void cadastrarNovoAtendimento() {
		System.out.println("novo atendimento");		
	}
}
