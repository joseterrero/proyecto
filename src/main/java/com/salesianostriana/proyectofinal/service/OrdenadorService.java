package com.salesianostriana.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyectofinal.model.Ordenador;
import com.salesianostriana.proyectofinal.repo.OrdenadorRepository;

@Service
public class OrdenadorService {
	
	@Autowired
	private OrdenadorRepository orRep;
	
	public Iterable<Ordenador> findAll() {
		return orRep.findAll();
	}
	
	public Ordenador findOne(Long id) {
		return orRep.findById(id).orElse(null);
	}
	
	public Ordenador save(Ordenador or) {
		return orRep.save(or);
	}
	
	public Ordenador edit(Ordenador or) {
		return orRep.save(or);
	}

}
