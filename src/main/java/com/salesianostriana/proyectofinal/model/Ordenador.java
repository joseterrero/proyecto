package com.salesianostriana.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Ordenador {
	
	private String fuente;
	private String placaBase;
	private String tarjetaGrafica;
	private String caja;
	private String procesador;
	@Id @GeneratedValue
	private Long id;
	private double precio;
	
	public Ordenador() {
		
	}
	
	public Ordenador(String fuente, String placaBase, String tarjetaGrafica, String caja, String procesador, long id, double precio) {
		this.fuente=fuente;
		this.placaBase=placaBase;
		this.tarjetaGrafica=tarjetaGrafica;
		this.caja=caja;
		this.procesador=procesador;
		this.id=id;
		this.precio=precio;
	}

	public String getFuente() {
		return fuente;
	}

	public void setFuente(String fuente) {
		this.fuente = fuente;
	}

	public String getPlacaBase() {
		return placaBase;
	}

	public void setPlacaBase(String placaBase) {
		this.placaBase = placaBase;
	}

	public String getTarjetaGrafica() {
		return tarjetaGrafica;
	}

	public void setTarjetaGrafica(String tarjetaGrafica) {
		this.tarjetaGrafica = tarjetaGrafica;
	}

	public String getCaja() {
		return caja;
	}

	public void setCaja(String caja) {
		this.caja = caja;
	}

	public String getProcesador() {
		return procesador;
	}

	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	@Override
	public String toString() {
		return "Ordenador [fuente=" + fuente + ", placaBase=" + placaBase + ", tarjetaGrafica=" + tarjetaGrafica
				+ ", caja=" + caja + ", procesador=" + procesador + ", id=" + id + ", precio=" + precio + "]";
	}
	
}


