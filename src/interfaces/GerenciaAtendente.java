package interfaces;

import model.Atendente;

public interface GerenciaAtendente extends IGerenciamento<Atendente> {
	
	public Atendente buscaAtendentePorId(Long id);
	
}
