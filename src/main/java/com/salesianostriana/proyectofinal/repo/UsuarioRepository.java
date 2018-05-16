package com.salesianostriana.proyectofinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.salesianostriana.proyectofinal.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	
	public Usuario findFirstByUsernameAndPass(String usuario, String contrasenya);

}
