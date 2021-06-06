package es.gastosApi.entidades;

import comun.Movimiento;

public class IngresoConId extends MovimientoConId{
	private boolean compartido;
	
	
	public IngresoConId() {
		super();
	}

	public boolean isCompartido() {
		return compartido;
	}

	public void setCompartido(boolean compartido) {
		this.compartido = compartido;
	}

	
	
	
	

}
