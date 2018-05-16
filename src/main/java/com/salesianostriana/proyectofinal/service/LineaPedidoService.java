package com.salesianostriana.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyectofinal.model.LineaPedido;
import com.salesianostriana.proyectofinal.repo.LineaPedidoRepository;

@Service
public class LineaPedidoService {
	
	@Autowired
	private LineaPedidoRepository linPedRep;
	
	public Iterable<LineaPedido> findAll() {
		return linPedRep.findAll();
	}
	
	public LineaPedido findOne(Long id) {
		return linPedRep.findById(id).orElse(null);
	}

}
