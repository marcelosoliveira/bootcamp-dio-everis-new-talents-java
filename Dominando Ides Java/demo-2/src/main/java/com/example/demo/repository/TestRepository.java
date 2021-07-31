package com.example.demo.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.TestUsuario;

@Repository
public interface TestRepository extends JpaRepository<TestUsuario, Long> {

	Optional<TestUsuario> findByEmail(String username);

}
