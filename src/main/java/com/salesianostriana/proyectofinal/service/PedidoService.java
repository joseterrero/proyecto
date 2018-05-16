package com.salesianostriana.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyectofinal.model.Pedido;
import com.salesianostriana.proyectofinal.repo.PedidoRepository;

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository pedRep;
	
	public Iterable<Pedido> findAll() {
		return pedRep.findAll();
	}
	
	public Pedido findOne(Long id) {
		return pedRep.findById(id).orElse(null);
	}

}
