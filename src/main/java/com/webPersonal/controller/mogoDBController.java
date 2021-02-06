package com.webPersonal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
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
	@PostMapping(value = "/guardar",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MongoDto guardar(@RequestBody MongoDto entity) {
		return ms.guardar(entity);
	}
	
	@CrossOrigin
	@PostMapping(value = "/borrar",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody boolean borrar(@RequestBody MongoDto entity) {
		return ms.borrar(entity);
	}
	
	@CrossOrigin
	@PostMapping(value = "/actualizar",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MongoDto actualizar(@RequestBody MongoDto entity) {
		return ms.actualizar(entity);
	}
	
	@CrossOrigin
	@PostMapping(value = "/consultarPorId", 
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody MongoDto consultarPorId(@RequestBody MongoDto entity) {
		return ms.consultarPorId(entity);
	}
	
	@CrossOrigin
	@PostMapping(value = "/consultarTodos",
			consumes = MediaType.APPLICATION_JSON_VALUE, 
			produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody List<MongoDto> consultarTodos() {
		return ms.consultarTodos();
	}
}
