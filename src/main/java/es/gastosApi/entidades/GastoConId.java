package es.gastosApi.entidades;

public class GastoConId extends MovimientoConId{
	private boolean autorizado;
	
	
	public GastoConId() {
		super();
	}

	public boolean isAutorizado() {
		return autorizado;
	}

	public void setAutorizado(boolean autorizado) {
		this.autorizado = autorizado;
	}

	
	
	


}
