package com.example.demo.controller;

import java.util.List;

import com.example.demo.dto.UsuarioDto;
import com.example.demo.service.UsuarioService;

public class UsuarioController {

	private UsuarioService usuarioService = new UsuarioService();

	public void agregarUsuario(UsuarioDto usuariodto) {
		UsuarioDto usuario = usuarioService.consultarUsuarioPorId(usuariodto.getId());
		if (usuario == null) {
			usuarioService.crearUsuario(usuariodto);
		} else {
			System.out.println(usuariodto + "este usuario ya existe");
		}

	}

	public void consultarUsuarios() {
		List<UsuarioDto> usuarioLista = usuarioService.consultarUsuarios();
		for (UsuarioDto usuarioDto : usuarioLista) {
			System.out.println("nombre: " + usuarioDto.getNombre());
			System.out.println("apellido: " + usuarioDto.getApellidos());
			System.out.println("identificacion: " + usuarioDto.getId());
		}

	}

	public UsuarioDto consultarUsuarioId(String id) {
		return usuarioService.consultarUsuarioPorId(id);

	}
}
