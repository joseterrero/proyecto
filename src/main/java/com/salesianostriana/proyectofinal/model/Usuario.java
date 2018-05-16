package com.salesianostriana.proyectofinal.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Usuario {
	
	private String nombre;
	private String apellido;
	@Id @GeneratedValue
	private Long id;
	private String correo;
	private boolean isEmpleado;
	private String nombreUsuario;
	
	public Usuario() {
		
	}
	
	public Usuario(String nombre, String apellido, long id, String correo, boolean isEmpleado, String nombreUsuario) {
		this.nombre=nombre;
		this.apellido=apellido;
		this.id=id;
		this.correo=correo;
		this.isEmpleado=isEmpleado;
		this.nombreUsuario=nombreUsuario;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public boolean isEmpleado() {
		return isEmpleado;
	}

	public void setEmpleado(boolean isEmpleado) {
		this.isEmpleado = isEmpleado;
	}

	public String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		this.nombreUsuario = nombreUsuario;
	}

	@Override
	public String toString() {
		return "Usuario [nombre=" + nombre + ", apellido=" + apellido + ", id=" + id + ", correo=" + correo
				+ ", isEmpleado=" + isEmpleado + ", nombreUsuario=" + nombreUsuario + "]";
	}
	
}
