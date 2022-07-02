package com.cezar.projectspring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cezar.projectspring.entities.Usuario;

public interface UserRepository extends JpaRepository<Usuario, Long> {

}
