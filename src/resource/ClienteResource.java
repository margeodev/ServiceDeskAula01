package resource;

import java.util.ArrayList;
import java.util.List;

import interfaces.GerenciaCliente;
import model.Cliente;

public class ClienteResource implements GerenciaCliente {
	
	private static ArrayList<Cliente> clientes = new ArrayList<>();

	@Override
	public Cliente salvar(Cliente cliente) {
		Cliente c1 = cliente;
		clientes.add(c1);
		return c1;
	}

	@Override
	public List<Cliente> listar() {
		return clientes;
	}

	@Override
	public void remover(Cliente t) {
		// TODO Auto-generated method stub
		
	}

		
}
