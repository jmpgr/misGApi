package es.gastosApi.entidades;

import comun.MovimientoImpl;

public class MovimientoConId extends MovimientoImpl{
	private Long id;
	
	

	public MovimientoConId() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
