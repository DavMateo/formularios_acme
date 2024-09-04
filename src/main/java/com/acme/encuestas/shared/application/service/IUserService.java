package com.acme.encuestas.shared.application.service;

import java.util.List;
import java.util.Optional;

import com.acme.encuestas.shared.domain.entity.Users;

public interface IUserService {
    List<Users> findAll();
    Optional<Users> findById(Long id);
    Optional<Users> findBynombreUsuario(String nombreUsuario);
    Users save(Users users);
    Users update(Users users);
    void deleteById(Long id);
	Optional<Users> findByUsername(String username);
}