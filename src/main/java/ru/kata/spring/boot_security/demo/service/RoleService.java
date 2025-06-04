package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.Role;

import java.util.List;
import java.util.Set;

public interface RoleService {
    List<Role> findAll();
    void save(Role role);
    Role findByName(String name);

    Set<Role> getRolesSetByUserName(Set<Role> userRoles, List<String> roleNames);
}
