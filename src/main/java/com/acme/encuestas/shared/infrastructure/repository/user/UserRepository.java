package com.acme.encuestas.shared.infrastructure.repository.user;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acme.encuestas.shared.domain.entity.Users;

public interface UserRepository extends JpaRepository<Users, Long> {
    boolean existsBynombreUsuario(String nombreusuario);
}
