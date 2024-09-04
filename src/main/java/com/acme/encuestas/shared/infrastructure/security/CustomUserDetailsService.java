package com.acme.encuestas.shared.infrastructure.security;

import java.util.Optional;

import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.acme.encuestas.shared.application.service.IUserService;
import com.acme.encuestas.shared.domain.entity.Users;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    private final IUserService userService;

    public CustomUserDetailsService(IUserService userService) {
        this.userService = userService;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<Users> optionalUser = userService.findBynombreUsuario(nombreUsuario);
        if (optionalUser.isPresent()) {
            Users user = optionalUser.get();
            // Obtener roles del usuario
            String user = role.getRoles().getRol(); // Adaptar según tu implementación de roles
            return User.builder()
                       .username(user.getNombreUsuario())
                       .password(user.getContrasenya())
                       .roles(role) // Aquí se asigna el rol
                       .build();
        } else {
            throw new UsernameNotFoundException("Usuario no encontrado");
        }
    }
}

