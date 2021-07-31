package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.demo.exception.DuplicateUsernameException;
import com.example.demo.model.TestUsuario;
import com.example.demo.repository.TestRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class TestService implements UserDetailsService, TestInterface {

	private TestRepository testRepository;

	public List<TestUsuario> listUsuarioService() {
		return testRepository.findAll();
	}

	public TestUsuario createUsuarioService(TestUsuario testUsuario) throws DuplicateUsernameException {
		duplicateUsername(testUsuario.getEmail());
		return testRepository.save(testUsuario);
	}

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<TestUsuario> usuario = testRepository.findByEmail(username);

		if (usuario.isEmpty())
			throw new UsernameNotFoundException("Usuário não existe!");

		return usuario.get();
	}

	@Override
	public void duplicateUsername(String username) throws DuplicateUsernameException {
		Optional<TestUsuario> usuario = testRepository.findByEmail(username);
		System.out.println(usuario);
		if (usuario.isPresent()) {
			throw new DuplicateUsernameException("Usuário já existe!");
		}
		
	}

}
