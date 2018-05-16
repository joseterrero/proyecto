package com.salesianostriana.proyectofinal.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.OneToMany;

@Entity
public class LineaPedido {
	
	@OneToMany
	private Set<Ordenador> or;
	private int cantidad;
	private Long id;
	
	public LineaPedido() {
		super();
	}

	public LineaPedido(Set<Ordenador> or, int cantidad, Long id) {
		super();
		this.or = or;
		this.cantidad = cantidad;
		this.id = id;
	}

	public Set<Ordenador> getOr() {
		return or;
	}

	public void setOr(Set<Ordenador> or) {
		this.or = or;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id=id;
	}

	@Override
	public String toString() {
		return "LineaPedido [or=" + or + ", cantidad=" + cantidad + ", id=" + id + "]";
	}
	
}
