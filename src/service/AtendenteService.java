package service;

import model.Atendente;
import resource.AtendenteResource;

public class AtendenteService {

	public static void carregaAtendentes() {
		AtendenteResource atendenteResource = new AtendenteResource();
		Atendente joao = new Atendente();
		Atendente maria = new Atendente();
		joao.setId(1L);
		joao.setNome("João da Silva");
		joao.setMatricula("ABC123");

		maria.setId(2L);
		maria.setNome("Maria da Silva");
		maria.setMatricula("ABC321");

		atendenteResource.salvar(joao);
		atendenteResource.salvar(maria);
		
	}
}
