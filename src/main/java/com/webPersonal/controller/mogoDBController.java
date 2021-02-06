package com.webPersonal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.webPersonal.dto.MongoDto;
import com.webPersonal.service.MongoService;

@RequestMapping("/mongoDDBB")
public class mogoDBController {

	@Autowired
	MongoService ms;
	
	@RequestMapping(value = "/guardar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MongoDto guardar(@RequestBody MongoDto entity) {
		return ms.guardar(entity);
	}
	
	@RequestMapping(value = "/borrar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean borrar(@RequestBody MongoDto entity) {
		return ms.borrar(entity);
	}
	
	@RequestMapping(value = "/actualizar", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MongoDto actualizar(@RequestBody MongoDto entity) {
		return ms.actualizar(entity);
	}
	
	@RequestMapping(value = "/consultarPorId", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MongoDto consultarPorId(@RequestBody MongoDto entity) {
		return ms.consultarPorId(entity);
	}
	
	@RequestMapping(value = "/consultarTodos", method = RequestMethod.POST, 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<MongoDto> consultarTodos() {
		return ms.consultarTodos();
	}
}
