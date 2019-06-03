package resource;

import java.util.ArrayList;
import java.util.List;

import interfaces.GerenciaTecnico;
import model.Atendente;
import model.Cliente;
import model.Tecnico;

public class TecnicoResource implements GerenciaTecnico {
	
	private static ArrayList<Tecnico> tecnicos = new ArrayList<>();

	@Override
	public Tecnico salvar(Tecnico tecnico) {
		Tecnico t1 = tecnico;
		tecnicos.add(t1);
		return t1;
	}

	@Override
	public List listar() {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public void remover(Tecnico t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Tecnico buscaTecnicoPorId(Long id) {
		Tecnico tecnico = new Tecnico();
		for (int i = 0; i < tecnicos.size(); i++) {
			if (tecnicos.get(i).getId().equals(id)) {
				tecnico.setNome(tecnicos.get(i).getNome());
				tecnico.setMatricula(tecnicos.get(i).getMatricula());
			}
		}
		return tecnico;
	}
		
	
}
