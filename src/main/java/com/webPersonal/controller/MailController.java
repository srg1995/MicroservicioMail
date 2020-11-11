package com.webPersonal.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webPersonal.dto.AjaxResponseDto;
import com.webPersonal.dto.MailDto;
import com.webPersonal.service.EmailService;

@RestController
@RequestMapping("/mail")
public class MailController {

	@Autowired
	EmailService es;
	
	@CrossOrigin
	@PostMapping(
	        consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
	        produces= {MediaType.APPLICATION_JSON_VALUE}
			)
	public AjaxResponseDto<MailDto> enviarMail(@RequestBody MailDto mail) throws Exception{
		
		AjaxResponseDto response = new AjaxResponseDto();
		
		String respuesta;
		try {
			mensajeRespuesta(mail);
			mensajeRespuestaAdministrador(mail);
			response.setRespuesta("OK");
		}catch(Exception e) {
			response.setRespuesta("KO");
			List<String> errores = new ArrayList<String>(); 
			errores.add("Servicio no disponible, inetntelo más tarde");
			
			response.setErrores(errores);
		};
		return response;
	}
	
	@CrossOrigin
	@GetMapping
	public String verMail() {
		return "inicio";
	}
	
	
	public void mensajeRespuesta(MailDto mail) {
		/*modificar el mensaje de respuesta*/
		es.sendGenericEmail(mail.getEmisor());
	}
	
	public void mensajeRespuestaAdministrador(MailDto mail) {
		/*concatenar campos de informacion del formulario y meterlo en mensaje*/
		es.sendEmail("sergiosacristan8@gmail.com" ,  mail.getAsunto(), mail.getMensaje());
	}

}
