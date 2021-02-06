package com.webPersonal.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.webPersonal.dto.MongoDto;
import com.webPersonal.repository.mongoRepository;

public class MongoService {

	
	@Autowired
	mongoRepository repository;
	
	public MongoDto guardar(MongoDto entity) {
		return repository.save(entity);
	}
	
	public boolean borrar(MongoDto entity) {
		try {
			repository.delete(entity);
			return true;
		} catch(Exception ex) {
			return false;
		}
	}
	
	public MongoDto actualizar(MongoDto entity) {
		return repository.save(entity);
	}
	
	public MongoDto consultarPorId(MongoDto entity) {
		return repository.findById(entity.getId()).orElse(null);
	}
	
	public List<MongoDto>consultarTodos() {
		return repository.findAll();
	}
}
