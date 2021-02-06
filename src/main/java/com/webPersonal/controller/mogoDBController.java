package com.webPersonal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.webPersonal.dto.MongoDto;
import com.webPersonal.service.MongoService;

@RestController
@RequestMapping("/mongoDDBB")
public class mogoDBController {

	@Autowired
	MongoService ms;
	
	@CrossOrigin
	@RequestMapping(value = "/guardar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MongoDto guardar(@RequestBody MongoDto entity) {
		return ms.guardar(entity);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/borrar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean borrar(@RequestBody MongoDto entity) {
		return ms.borrar(entity);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/actualizar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MongoDto actualizar(@RequestBody MongoDto entity) {
		return ms.actualizar(entity);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/consultarPorId", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MongoDto consultarPorId(@RequestBody MongoDto entity) {
		return ms.consultarPorId(entity);
	}
	
	@CrossOrigin
	@RequestMapping(value = "/consultarTodos", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<MongoDto> consultarTodos() {
		return ms.consultarTodos();
	}
}
