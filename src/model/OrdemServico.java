package model;

import enums.Categoria;

public class OrdemServico {
	
	private Long id;
	private String status;
	private Categoria categoria;
	private SubCategoria subCategoria;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getStatus() {
		return status;
	}	
	public void setStatus(String status) {
		this.status = status;
	}
	
	public Categoria getCategoria() {
		return categoria;
	}	
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	public SubCategoria getSubCategoria() {
		return subCategoria;	}
	
	public void setSubCategoria(SubCategoria subCategoria) {
		this.subCategoria = subCategoria;
	}
		
	
}
