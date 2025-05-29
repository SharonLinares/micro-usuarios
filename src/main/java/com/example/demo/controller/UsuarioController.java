package com.example.demo.controller;

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

}
