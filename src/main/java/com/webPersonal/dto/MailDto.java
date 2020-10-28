package com.webPersonal.dto;


public class MailDto {

	private String emisor;
	private String asunto;
	private String nombre;
	private String mensaje;
	
	public String getEmisor() {
		return emisor;
	}
	
	public void setEmisor(String emisor) {
		this.emisor = emisor;
	}
	
	public String getAsunto() {
		return asunto;
	}
	
	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getMensaje() {
		return mensaje;
	}
	
	public void setMensaje(String mensaje) {
		this.mensaje = mensaje;
	}
	
}
