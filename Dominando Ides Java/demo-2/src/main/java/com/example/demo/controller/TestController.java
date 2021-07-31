package com.example.demo.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.exception.DuplicateUsernameException;
import com.example.demo.model.TestUsuario;
import com.example.demo.service.TestService;

import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/api/v1")
@AllArgsConstructor
public class TestController {

	private TestService testService;

	@GetMapping("/test")
	public List<TestUsuario> listTestUsuario() {
		return testService.listUsuarioService();
	}

	@PostMapping("/test")
	public TestUsuario listTestUsuario(@RequestBody TestUsuario testUsuario) throws DuplicateUsernameException {
		return testService.createUsuarioService(testUsuario);
	}

}
