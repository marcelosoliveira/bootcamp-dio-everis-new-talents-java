package com.example.demo.service;

import com.example.demo.exception.DuplicateUsernameException;

public interface TestInterface {
	
	void duplicateUsername(String username) throws DuplicateUsernameException;

}
