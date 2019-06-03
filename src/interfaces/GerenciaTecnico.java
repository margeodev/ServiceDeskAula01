package interfaces;

import model.Tecnico;

public interface GerenciaTecnico extends IGerenciamento<Tecnico>{
	
	public Tecnico buscaTecnicoPorId(Long id);
	
}
