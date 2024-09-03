package com.acme.encuestas.shared.domain.implement;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.acme.encuestas.shared.application.service.IUserService;
import com.acme.encuestas.shared.domain.entity.Users;
import com.acme.encuestas.shared.infrastructure.repository.user.UserRepository;

import jakarta.persistence.EntityNotFoundException;

@Service
public class UserServiceImpl implements IUserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public List<Users> findAll() {
        return userRepository.findAll();
    }

    @Override
    public Optional<Users> findById(Long id) {
        return userRepository.findById(id);
    }

    @Override
    public Users save(Users users) {
        if (userRepository.existsBynombreUsuario(users.getNombreUsuario())) {
            throw new RuntimeException("Ya existe un usuario con este nombre");
        }
        return userRepository.save(users);
    }

    @Override
    public Users update(Users users) {
        if (userRepository.existsById(users.getIduser())) {
            return userRepository.save(users);
        } else {
            throw new EntityNotFoundException("Usuario no encontrado por id:" + users.getIduser());
        }
    }

    @Override
    public void deleteById(Long id) {
        if (userRepository.existsById(id)) {
            userRepository.deleteById(id);
        } else {
            throw new EntityNotFoundException("Usuario no encontrado por id" + id);
        }
    }
}
