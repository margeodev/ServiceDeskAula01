package service;

import model.Tecnico;
import resource.TecnicoResource;

public class TecnicoService {	
	
	public static void carregarTecnicos() {
		TecnicoResource tecnicoResource = new TecnicoResource();
		Tecnico pedro = new Tecnico();
		Tecnico antonio = new Tecnico();
	
		pedro.setId(1L);
		pedro.setNome("Pedro da Silva");
		pedro.setMatricula("1234");
	
		antonio.setId(2L);
		antonio.setNome("Antonio da Silva");
		antonio.setMatricula("8888");
	
		tecnicoResource.salvar(pedro);
		tecnicoResource.salvar(antonio);
	}
}
