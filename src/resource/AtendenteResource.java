package resource;

import java.util.ArrayList;
import java.util.List;

import interfaces.GerenciaAtendente;
import model.Atendente;
import model.Cliente;

public class AtendenteResource implements GerenciaAtendente {
	
	private static ArrayList<Atendente> atendentes = new ArrayList<>();

	@Override
	public Atendente salvar(Atendente atendente) {
		Atendente a1 = atendente;
		atendentes.add(a1);
		return a1;
	}

	@Override
	public List<Atendente> listar() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void remover(Atendente t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Atendente buscaAtendentePorId(Long id) {
		Atendente atendente = new Atendente();
		for (int i = 0; i < atendentes.size(); i++) {
			if (atendentes.get(i).getId().equals(id)) {
				atendente.setNome(atendentes.get(i).getNome());
				atendente.setMatricula(atendentes.get(i).getMatricula());
			}
		}
		return atendente;
	}

	
}
