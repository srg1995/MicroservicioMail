package com.webPersonal.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webPersonal.dto.MailDto;
import com.webPersonal.service.EmailService;

@RestController
@RequestMapping("/mail")
public class MailController {

	@Autowired
	EmailService es;
	
	@CrossOrigin
	@PostMapping
	public String enviarMail(@RequestBody MailDto mail) {
		mensajeRespuesta(mail);
		mensajeRespuestaAdministrador(mail);
		return "OK";
	}
	
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
