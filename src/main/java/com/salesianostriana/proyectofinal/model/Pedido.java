package com.salesianostriana.proyectofinal.model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Pedido {
	
	@Id @GeneratedValue
	private Long id;
	private LocalDateTime fecha;
	@OneToMany
	private List<LineaPedido> lineaPedido;
	
	public Pedido() {
		super();
	}

	public Pedido(Long id, LocalDateTime fecha, LineaPedido lineaPed) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.lineaPedido = new ArrayList<LineaPedido>();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getFecha() {
		return fecha;
	}

	public void setFecha(LocalDateTime fecha) {
		this.fecha = fecha;
	}

	public List<LineaPedido> getLineaPedido() {
		return lineaPedido;
	}

	public void setLineaPedido(List<LineaPedido> lineaPedido) {
		this.lineaPedido = lineaPedido;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", fecha=" + fecha + ", lineaPedido=" + lineaPedido + "]";
	}
	
}
