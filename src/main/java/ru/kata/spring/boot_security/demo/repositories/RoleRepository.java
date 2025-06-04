package ru.kata.spring.boot_security.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;

public interface RoleRepository {
    List<Role> findAll();
    void save(Role role);
    Role findByName(String name);
    Role findById(Long id);
    void deleteById(Long id);
}
