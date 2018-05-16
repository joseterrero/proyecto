package com.salesianostriana.proyectofinal.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.salesianostriana.proyectofinal.model.Usuario;
import com.salesianostriana.proyectofinal.repo.UsuarioRepository;

@Service
public class UsuarioService {
	
	@Autowired
	private UsuarioRepository usuRep;
	
	public Usuario login(String usuario, String contrasenya) {
		return usuRep.findFirstByUsernameAndPass(usuario, contrasenya);
	}
	
	public Iterable<Usuario> findAll(){
		return usuRep.findAll();
	}
	
	public Usuario findOne(Long id) {
		return usuRep.findById(id).orElse(null);
	}
	
	public Usuario save(Usuario usu) {
		return usuRep.save(usu);
	}
	
	public Usuario edit(Usuario usu) {
		return usuRep.save(usu);
	}
	
	public Usuario delete(Usuario usu) {
		Usuario borrar = usuRep.findById(usu.getId()).orElse(null);
		if(borrar != null) {
			usuRep.delete(usu);
		}
		return borrar;
	}

}
