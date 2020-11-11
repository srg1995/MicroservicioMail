package com.webPersonal.dto;

import java.util.List;

public class AjaxResponseDto<Obj> {
	
	private Obj object;
	
	private List<String> errores;
	
	private String respuesta;

	public Obj getObject() {
		return object;
	}

	public void setObject(Obj object) {
		this.object = object;
	}

	public List<String> getErrores() {
		return errores;
	}

	public void setErrores(List<String> errores) {
		this.errores = errores;
	}

	public String getRespuesta() {
		return respuesta;
	}

	public void setRespuesta(String respuesta) {
		this.respuesta = respuesta;
	}

	
}
