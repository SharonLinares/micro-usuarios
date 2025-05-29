package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.dto.UsuarioDto;

public class UsuarioService {

	private List<UsuarioDto> usuariosdto = new ArrayList<>();

	public void crearUsuario(UsuarioDto usuariodto) {
		boolean agregarUsuario = true;
		for (UsuarioDto usuariov2 : usuariosdto) {
			if (usuariov2.getId().equals(usuariodto.getId())) {
				agregarUsuario = false;
			}
		}
		if (agregarUsuario) {
			this.usuariosdto.add(usuariodto);
		}

	}

	public List<UsuarioDto> consultarUsuarios() {
		return usuariosdto;
	}

	public UsuarioDto consultarUsuarioPorId(String id) {
		for (UsuarioDto usuarioDto : usuariosdto) {
			if (usuarioDto.getId().equals(id)) {
				return usuarioDto;
			}
		}
		return null;
	}

	public void eliminarUsuarioPorId(String id) {
		UsuarioDto usuariodto = consultarUsuarioPorId(id);
		if (usuariodto != null) {
			usuariosdto.remove(usuariodto);
			System.out.println("se ha eliminado correctamente");
		} else {
			System.out.println("no existe un usuario con este id");
		}
	}

}
