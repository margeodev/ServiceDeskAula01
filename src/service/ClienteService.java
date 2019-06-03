package service;

import java.util.List;
import java.util.Scanner;

import model.Cliente;
import resource.ClienteResource;

public class ClienteService {

	private static ClienteResource clienteResource = new ClienteResource();
	private static Long idCliente = 1L;

	public static void cadastrarCliente() {
		Scanner entrada = new Scanner(System.in);
		System.out.println("Nome do cliente: ");
		String nome = entrada.nextLine();
		System.out.println("CPF do cliente: ");
		String cpf = entrada.nextLine();
		System.out.println("Telefone do cliente: ");
		String telefone = entrada.nextLine();

		Cliente cliente = new Cliente();
		cliente.setId(idCliente);
		cliente.setCpf(cpf);
		cliente.setNome(nome);
		cliente.setTelefone(telefone);

		clienteResource.salvar(cliente);
		idCliente+=1;
		System.out.println("Cliente adicionado com sucesso!\n");

	}

	public static void listarClientes() {
		List<Cliente> clientes = clienteResource.listar();
		if (!clientes.isEmpty()) {
			System.out.println(" ===================================");
			System.out.println("| Clientes cadastrados             |");
			System.out.println(" ===================================");
			for (Cliente c : clientes) {
				System.out.println("ID: " + c.getId());
				System.out.println("Nome: " + c.getNome());
				System.out.println("CPF: " + c.getCpf());
				System.out.println("Telefone: " + c.getTelefone());
				System.out.println("=================================\n");
			}
		} else {
			System.out.println("Não foram localizados clientes. \n\n");
		}

	}

}
